package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

public class _227 {

    public static class Solution1 {
        public int calculate(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            int len = s.length();
            Deque<Integer> stack = new ArrayDeque<>();
            int num = 0;
            char sign = '+';
            for (int i = 0; i < len; i++) {
                if (Character.isDigit(s.charAt(i))) {
                    num = num * 10 + s.charAt(i) - '0';
                }
                if ((!Character.isDigit(s.charAt(i))) && ' ' != s.charAt(i) || i == len - 1) {
                    if (sign == '+') {
                        stack.addLast(num);
                    } else if (sign == '-') {
                        stack.addLast(-num);
                    } else if (sign == '/') {
                        stack.addLast(stack.pollLast() / num);
                    } else if (sign == '*') {
                        stack.addLast(stack.pollLast() * num);
                    }
                    sign = s.charAt(i);
                    num = 0;
                }
            }
            int result = 0;
            while (!stack.isEmpty()) {
                result += stack.poll();
            }
            return result;
        }
    }
}
