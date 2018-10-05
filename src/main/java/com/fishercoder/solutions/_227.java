package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 227. Basic Calculator II
 *
 * Implement a basic calculator to evaluate a simple expression string.

 The expression string contains only non-negative integers, +, -, *, / operators and empty spaces . The integer division should truncate toward zero.

 You may assume that the given expression is always valid.

 Some examples:
 "3+2*2" = 7
 " 3/2 " = 1
 " 3+5 / 2 " = 5
 Note: Do not use the eval built-in library function.
 */
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
