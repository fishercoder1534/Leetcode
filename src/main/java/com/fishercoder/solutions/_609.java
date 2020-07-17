package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _609 {

    public static class Solution1 {
        public List<List<String>> findDuplicate(String[] paths) {
            Map<String, List<String>> map = new HashMap<>();//key is the file content, value is the list of directories that has this directory/file
            for (String path : paths) {
                String[] dirAndFiles = path.split(" ");
                for (int i = 1; i < dirAndFiles.length; i++) {
                    String content = dirAndFiles[i].substring(dirAndFiles[i].indexOf("(") + 1, dirAndFiles[i].indexOf(")"));
                    if (!map.containsKey(content)) {
                        map.put(content, new ArrayList<>());
                    }
                    List<String> dirs = map.get(content);
                    dirs.add(dirAndFiles[0] + "/" + dirAndFiles[i].substring(0, dirAndFiles[i].indexOf("(")));
                    map.put(content, dirs);
                }
            }

            List<List<String>> result = new ArrayList<>();
            for (String content : map.keySet()) {
                if (map.get(content).size() > 1) {
                    List<String> dupFile = new ArrayList<>();
                    for (String dir : map.get(content)) {
                        dupFile.add(dir);
                    }
                    result.add(dupFile);
                }
            }
            return result;
        }
    }

    /**Answers to follow-up questions:
     * 1. Imagine you are given a real file system, how will you search files? DFS or BFS ?
     * A: Both BFS and DFS could do the work, but BFS will use extra memory, however, BFS takes advantage of memory locality, so BFS could be faster.
     *
     * 2. If the file content is very large (GB level), how will you modify your solution?
     * A: We'll fist map all files according to their sizes, since files with different sizes are guaranteed to be different, then
     * we can hash a small part of the files using MD5, SHA256, etc. Only when their md5 or sha256 is the same, we'll compare the contents byte by byte.
     *
     * 3. If you can only read the file by 1kb each time, how will you modify your solution?
     * A: This is not going to change the solution, we can hash this 1kb chunk, and then also only compare byte by byte when it's necessary.
     *
     * 4. What is the time complexity of your modified solution? What is the most time consuming part and memory consuming part of it? How to optimize?
     * A: O(n^2*k), in the worst time, we'll have to compare the file with every other file, k is the length of the file.
     * Comparing the file (by size, by hash and eventually byte by byte) is the most time consuming part.
     * Generating hash for every file will be the most memory consuming part.
     *
     * 5. How to make sure the duplicated files you find are not false positive?
     * A: Size comparision, hash detection, byte by byte check, etc. will pretty sure to rule out false positive.
     * */

}
