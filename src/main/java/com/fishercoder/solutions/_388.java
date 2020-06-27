package com.fishercoder.solutions;

import java.util.Stack;

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
