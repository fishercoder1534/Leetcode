package com.fishercoder.solutions;

import java.util.Stack;

/**
 * 388. Longest Absolute File Path
 *
 * Suppose we abstract our file system by a string in the following manner:
 *
 * The string "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" represents:
 *
 * dir
 *     subdir1
 *     subdir2
 *         file.ext
 * The directory dir contains an empty sub-directory subdir1 and a sub-directory subdir2 containing a file file.ext.
 *
 * The string "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext" represents:
 *
 * dir
 *     subdir1
 *         file1.ext
 *         subsubdir1
 *     subdir2
 *         subsubdir2
 *             file2.ext
 * The directory dir contains two sub-directories subdir1 and subdir2. subdir1 contains a file file1.ext and an empty second-level sub-directory subsubdir1.
 * subdir2 contains a second-level sub-directory subsubdir2 containing a file file2.ext.
 *
 * We are interested in finding the longest (number of characters) absolute path to a file within our file system.
 * For example, in the second example above, the longest absolute path is "dir/subdir2/subsubdir2/file2.ext", and its length is 32 (not including the double quotes).
 *
 * Given a string representing the file system in the above format, return the length of the longest absolute path to file in the abstracted file system. If there is no file in the system, return 0.
 *
 * Note:
 *
 * The name of a file contains at least a . and an extension.
 * The name of a directory or sub-directory will not contain a ..
 * Time complexity required: O(n) where n is the size of the input string.
 *
 * Notice that a/aa/aaa/file1.txt is not the longest file path, if there is another path aaaaaaaaaaaaaaaaaaaaa/sth.png.*/
public class _388 {
    public static class Solution1 {
        public int lengthLongestPath(String input) {
            Stack<Integer> stack = new Stack();
            int longestLen = 0;
            int currDirLen = 0;
            int i = 0;
            int currLevel = 0;
            int nextLevel = 0;
            boolean isFile = false;
            Character period = '.';
            Character space = ' ';
            while (i < input.length()) {
                currLevel = nextLevel;
                int currStrLen = 0;
                while (i < input.length() && (Character.isLetterOrDigit(input.charAt(i))
                    || period.equals(input.charAt(i)) || space.equals(input.charAt(i)))) {
                    if (period.equals(input.charAt(i))) {
                        isFile = true;
                    }
                    i++;
                    currStrLen++;
                }
                if (isFile) {
                    longestLen = Math.max(longestLen, currDirLen + currStrLen);
                } else {
                    currDirLen += currStrLen + 1;
                    stack.push(currStrLen + 1);
                }

                nextLevel = 0;
                i = i + 1;//increment one to let it pass "\n" and start from "\t"
                while (i < input.length() - 1 && input.substring(i, i + 1).equals("\t")) {
                    nextLevel++;
                    i = i + 1;
                }

                if (nextLevel < currLevel) {
                    int j = 0;
                    if (isFile) {
                        while (!stack.isEmpty() && j < (currLevel - nextLevel)) {
                            currDirLen -= stack.pop();
                            j++;
                        }
                    } else {
                        while (!stack.isEmpty() && j <= (currLevel - nextLevel)) {
                            currDirLen -= stack.pop();
                            j++;
                        }
                    }
                } else if (nextLevel == currLevel) {
                    if (!isFile && !stack.isEmpty()) {
                        currDirLen -= stack.pop();
                    }
                }

                if (nextLevel == 0) {
                    currDirLen = 0;
                    stack.clear();
                }

                isFile = false;
            }

            return longestLen;
        }
    }
}
