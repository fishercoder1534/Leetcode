package com.fishercoder.solutions;

import java.util.Deque;
import java.util.LinkedList;

public class _3174 {
    public static class Solution1 {
        public String clearDigits(String s) {
            Deque<Character> stack = new LinkedList<>();
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    if (!stack.isEmpty()) {
                        Deque<Character> temp = new LinkedList<>();
                        while (!stack.isEmpty() && Character.isDigit(stack.peekLast())) {
                            temp.addLast(stack.pollLast());
                        }
                        if (!stack.isEmpty() && !Character.isDigit(stack.peekLast())) {
                            stack.pollLast();
                            while (!temp.isEmpty()) {
                                stack.addLast(temp.pollLast());
                            }
                        }
                    }
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
