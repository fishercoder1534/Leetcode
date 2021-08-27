package com.fishercoder.solutions;

import java.util.Stack;

public class _32 {
    public static class Solution1 {
        public int longestValidParentheses(String s) {
            int result = 0;
            Stack<Integer> stack = new Stack();
            stack.push(-1);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(i);
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        stack.push(i);
                    } else {
                        result = Math.max(result, i - stack.peek());
                    }
                }
            }
            return result;
        }
    }

    public static class Solution2 {
        /**
         * my lengthy but original solution on 4/5/2021, the idea is to convert the valid parenthesis pairs into numbers and push them onto a stack.
         */
        public int longestValidParentheses(String s) {
            Stack<String> stack = new Stack<>();
            int longest = 0;
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(c + "");
                } else {
                    if (stack.isEmpty()) {
                        continue;
                    } else {
                        if (stack.peek().equals("(")) {
                            stack.pop();
                            stack.push("2");
                        } else {
                            int sum = 0;
                            while (!stack.isEmpty() && !stack.peek().equals("(")) {
                                sum += Integer.parseInt(stack.pop());
                            }
                            if (!stack.isEmpty()) {
                                stack.pop();//pop off the open paren
                                sum += 2;
                                stack.push("" + sum);
                            }
                            longest = Math.max(longest, sum);
                        }
                    }
                }
            }
            int result = 0;
            while (!stack.isEmpty()) {
                if (stack.peek().equals("(")) {
                    stack.pop();
                    result = 0;
                } else {
                    result += Integer.parseInt(stack.pop());
                    longest = Math.max(result, longest);
                }
            }
            return longest;
        }
    }
}
