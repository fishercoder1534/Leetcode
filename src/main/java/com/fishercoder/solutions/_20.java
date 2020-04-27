package com.fishercoder.solutions;

import java.util.Stack;

public class _20 {
    public static class Solution1 {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        if (stack.peek() == '(' && s.charAt(i) != ')') {
                            return false;
                        } else if (stack.peek() == '{' && s.charAt(i) != '}') {
                            return false;
                        } else if (stack.peek() == '[' && s.charAt(i) != ']') {
                            return false;
                        }
                        stack.pop();
                    }
                }
            }
            return stack.isEmpty();
        }
    }

    public static class Solution2 {
        /**
         * A more concise solution:
         * credit: https://leetcode.com/problems/valid-parentheses/discuss/9178/Short-java-solution
         * */
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(')');
                } else if (c == '{') {
                    stack.push('}');
                } else if (c == '[') {
                    stack.push(']');
                } else if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
            return stack.isEmpty();
        }
    }
}
