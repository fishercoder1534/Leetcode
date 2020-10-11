package com.fishercoder.solutions;

import java.util.Stack;

public class _1614 {
    public static class Solution1 {
        public int maxDepth(String s) {
            Stack<Character> stack = new Stack<>();
            int maxDepth = 0;
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    maxDepth = Math.max(maxDepth, stack.size());
                    stack.pop();
                }
            }
            return maxDepth;
        }
    }
}
