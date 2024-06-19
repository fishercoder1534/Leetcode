package com.fishercoder.solutions.secondthousand;

import java.util.Deque;
import java.util.LinkedList;

public class _1047 {
    public static class Solution1 {
        public String removeDuplicates(String S) {
            StringBuilder sb = new StringBuilder(S);
            for (int i = 0; i < S.length() - 1; i++) {
                if (S.charAt(i) == S.charAt(i + 1)) {
                    return removeDuplicates(S.substring(0, i) + S.substring(i + 2));
                }
            }
            return sb.toString();
        }
    }

    public static class Solution2 {
        public String removeDuplicates(String s) {
            Deque<Character> stack = new LinkedList<>();
            for (char c : s.toCharArray()) {
                if (!stack.isEmpty() && stack.peekLast() == c) {
                    stack.pollLast();
                } else {
                    stack.addLast(c);
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append(stack.pollLast());
            }
            return sb.reverse().toString();
        }
    }
}
