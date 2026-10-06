package com.fishercoder.solutions.firstthousand;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class _921 {
    public static class Solution1 {
        public int minAddToMakeValid(String s) {
            Deque<Character> stack = new LinkedList<>();
            for (char c : s.toCharArray()) {
                if (c == ')') {
                    if (!stack.isEmpty() && stack.peekLast() == '(') {
                        stack.pollLast();
                    } else {
                        stack.addLast(c);
                    }
                } else {
                    stack.addLast(c);
                }
            }
            return stack.size();
        }
    }

    public static class Solution2 {
        public int minAddToMakeValid(String s) {
            Deque<Character> stack = new ArrayDeque<>();
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        stack.push(c);
                    } else {
                        if (stack.peek() == ')') {
                            stack.push(c);
                        } else {
                            stack.pop();
                        }
                    }
                }
            }
            return stack.size();
        }
    }
}
