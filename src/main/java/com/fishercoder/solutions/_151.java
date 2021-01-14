package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

public class _151 {
    public static class Solution1 {
        public String reverseWords(String s) {
            s.trim();
            if (s == null || s.length() == 0) {
                return "";
            }
            String[] words = s.split(" ");
            if (words == null || words.length == 0) {
                return "";
            }
            Deque<String> stack = new ArrayDeque<>();
            for (String word : words) {
                if (!word.equals("")) {
                    stack.offer(word);
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            while (!stack.isEmpty()) {
                stringBuilder.append(stack.pollLast()).append(" ");
            }
            return stringBuilder.substring(0, stringBuilder.length() - 1).toString();
        }
    }
    public static class Solution2 {
        public String reverseWords(String s) {
            int len = s.length();
            int i = 0;
            int j = 0;
            String result = "";
            while (i < len) {

                // index i keeps track of the spaces and ignores them if found
                while (i < len && s.charAt(i) == ' ') {
                    i++;
                }
                if (i == len) {
                    break;
                }
                j = i + 1;

                // index j keeps track of non-space characters and gives index of the first occurrence of space after a non-space character
                while (j < len && s.charAt(j) != ' ') {
                    j++;
                }
                // word found
                String word = s.substring(i, j);
                if(result.length() == 0) {
                    result = word;
                }
                else {
                    result = word + " "+ result;
                }
                i = j + 1;
            }
            return result;
        }
    }
}
