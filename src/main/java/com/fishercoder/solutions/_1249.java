package com.fishercoder.solutions;

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
}
