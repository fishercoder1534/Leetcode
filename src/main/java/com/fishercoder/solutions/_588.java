package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 588. Design In-Memory File System
 *
 * Design an in-memory file system to simulate the following functions:

 ls: Given a path in string format. If it is a file path, return a list that only contains this file's name.
 If it is a directory path, return the list of file and directory names in this directory.
 Your output (file and directory names together) should in lexicographic order.

 mkdir: Given a directory path that does not exist,
 you should make a new directory according to the path.
 If the middle directories in the path don't exist either,
 you should create them as well. This function has void return type.

 addContentToFile: Given a file path and file content in string format.
 If the file doesn't exist, you need to create that file containing given content.
 If the file already exists, you need to append given content to original content.
 This function has void return type.

 readContentFromFile: Given a file path, return its content in string format.

 Example:
 Input:
 ["FileSystem","ls","mkdir","addContentToFile","ls","readContentFromFile"]
 [[],["/"],["/a/b/c"],["/a/b/c/d","hello"],["/"],["/a/b/c/d"]]
 Output:
 [null,[],null,null,["a"],"hello"]

 Note:

 You can assume all file or directory paths are absolute paths which begin with / and do not end with / except that the path is just "/".
 You can assume that all operations will be passed valid parameters and users will not attempt to retrieve file content or list a directory or file that does not exist.
 You can assume that all directory names and file names only contain lower-case letters, and same names won't exist in the same directory.

 */
public class _588 {
    public static class Solution1 {
        /**
         * Credit: https://github.com/lydxlx1/LeetCode/blob/master/src/_588.java
         */
        public static class FileSystem {

            class TrieNode {
                boolean isFile = false;
                Map<String, TrieNode> map;
                String name;
                StringBuilder stringBuilder;

                TrieNode(String name) {
                    this.name = name;
                    map = new HashMap<>();
                    stringBuilder = new StringBuilder();
                }
            }

            TrieNode root = new TrieNode("");

            TrieNode dfs(String path) {
                TrieNode node = root;
                for (String eachPath : path.split("/")) {
                    if (eachPath.isEmpty()) {
                        continue;
                    }
                    if (!node.map.containsKey(eachPath)) {
                        node.map.put(eachPath, new TrieNode(eachPath));
                    }
                    node = node.map.get(eachPath);
                }
                return node;
            }

            public FileSystem() {
            }

            public List<String> ls(String path) {
                TrieNode node = dfs(path);
                if (node.isFile) {
                    return Arrays.asList(node.name);
                } else {
                    List<String> files = new ArrayList(node.map.keySet());
                    Collections.sort(files);
                    return files;
                }
            }

            public void mkdir(String path) {
                dfs(path);
            }

            public void addContentToFile(String filePath, String content) {
                TrieNode node = dfs(filePath);
                node.isFile = true;
                node.stringBuilder.append(content);
            }

            public String readContentFromFile(String filePath) {
                return dfs(filePath).stringBuilder.toString();
            }
        }
    }

/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * List<String> param_1 = obj.ls(path);
 * obj.mkdir(path);
 * obj.addContentToFile(filePath,content);
 * String param_4 = obj.readContentFromFile(filePath);
 */
}
