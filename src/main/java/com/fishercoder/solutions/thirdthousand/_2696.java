package com.fishercoder.solutions.thirdthousand;

import java.util.Deque;
import java.util.LinkedList;

public class _2696 {
    public static class Solution1 {
        public int minLength(String s) {
            Deque<Character> stack = new LinkedList<>();
            for (int i = 0; i < s.length(); i++) {
                if (stack.isEmpty()) {
                    stack.addLast(s.charAt(i));
                } else if (s.charAt(i) == 'B' && stack.peekLast() == 'A') {
                    stack.pollLast();
                } else if (s.charAt(i) == 'D' && stack.peekLast() == 'C') {
                    stack.pollLast();
                } else {
                    stack.addLast(s.charAt(i));
                }
            }
            return stack.size();
        }
    }
}
