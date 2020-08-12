package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _1190 {
    public static class Solution1 {
        public String reverseParentheses(String s) {
            Stack<Character> stack = new Stack<>();
            Queue<Character> queue = new LinkedList<>();
            for (char c : s.toCharArray()) {
                if (c != ')') {
                    stack.push(c);
                } else {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        queue.offer(stack.pop());
                    }
                    if (!stack.isEmpty()) {
                        stack.pop();//pop off the open paren
                    }
                    while (!queue.isEmpty()) {
                        stack.push(queue.poll());
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            return sb.reverse().toString();
        }
    }
}
