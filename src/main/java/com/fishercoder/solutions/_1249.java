package com.fishercoder.solutions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class _1249 {
    public static class Solution1 {
        public String minRemoveToMakeValid(String s) {
            Stack<Character> stack = new Stack<>();
            int leftParen = 0;
            int rightParen = 0;
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                    leftParen++;
                } else if (c == ')') {
                    if (leftParen > rightParen) {
                        stack.push(c);
                        rightParen++;
                    }
                } else {
                    stack.push(c);
                }
            }
            StringBuilder sb = new StringBuilder();
            int diff = leftParen - rightParen;
            while (!stack.isEmpty()) {
                if (stack.peek() == '(') {
                    if (diff-- > 0) {
                        stack.pop();
                    } else {
                        sb.append(stack.pop());
                    }
                } else {
                    sb.append(stack.pop());
                }
            }
            return sb.reverse().toString();
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 10/26/2021.
         */
        public String minRemoveToMakeValid(String s) {
            Deque<String> stack = new LinkedList<>();
            int left = 0;
            int right = 0;
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.addLast(c + "");
                    left++;
                } else if (c == ')') {
                    if (left <= right) {
                        continue;
                    } else {
                        right++;
                        stack.addLast(c + "");
                    }
                } else {
                    stack.addLast(c + "");
                }
            }
            left = 0;
            right = 0;
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                String str = stack.pollLast();
                if (str.equals(")")) {
                    right++;
                    sb.append(str);
                } else if (str.equals("(")) {
                    if (right > left) {
                        sb.append(str);
                        left++;
                    }
                } else {
                    sb.append(str);
                }
            }
            return sb.reverse().toString();
        }
    }
}
