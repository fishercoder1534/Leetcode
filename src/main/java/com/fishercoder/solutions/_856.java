package com.fishercoder.solutions;

import java.util.Stack;

public class _856 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/score-of-parentheses/discuss/141763/Java-solution-using-Stack
         */
        public int scoreOfParentheses(String S) {
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == '(') {
                    stack.push(-1);//we use -1 to indicate this is a left paren '('
                } else {
                    int curr = 0;
                    while (stack.peek() != -1) {
                        curr += stack.pop();
                    }
                    stack.pop();//this is to push the '(' off of the stack
                    stack.push(curr == 0 ? 1 : curr * 2);
                }
            }
            int score = 0;
            while (!stack.isEmpty()) {
                score += stack.pop();
            }
            return score;
        }
    }
}
