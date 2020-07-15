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
}
