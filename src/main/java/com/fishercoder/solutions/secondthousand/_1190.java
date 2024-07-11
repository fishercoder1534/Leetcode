package com.fishercoder.solutions.secondthousand;

import java.util.Deque;
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

    public static class Solution2 {

        public static String reverseParentheses(String s) {
            Deque<String> stack = new LinkedList<>();
            for (char c : s.toCharArray()) {
                if (c == '(' || Character.isAlphabetic(c)) {
                    stack.addLast(c + "");
                } else {
                    StringBuilder innerSb = new StringBuilder();
                    while (!stack.isEmpty()) {
                        if (stack.peekLast().equals("(")) {
                            stack.pollLast();
                            break;
                        } else {
                            innerSb.append(stack.pollLast());
                        }
                    }
                    stack.addLast(innerSb.reverse().toString());
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
