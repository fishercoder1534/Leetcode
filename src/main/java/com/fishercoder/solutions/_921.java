package com.fishercoder.solutions;

import java.util.Stack;

public class _921 {
    public static class Solution1 {
        public int minAddToMakeValid(String S) {
            Stack<Character> stack = new Stack<>();
            for (char c : S.toCharArray()) {
                if (c == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else {
                    stack.push(c);
                }
            }
            return stack.size();
        }
    }
}
