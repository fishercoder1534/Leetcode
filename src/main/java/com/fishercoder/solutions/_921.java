package com.fishercoder.solutions;

import java.util.Stack;

/**
 * 921. Minimum Add to Make Parentheses Valid
 *
 * Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions )
 * so that the resulting parentheses string is valid.
 *
 * Formally, a parentheses string is valid if and only if:
 * It is the empty string, or
 * It can be written as AB (A concatenated with B), where A and B are valid strings, or
 * It can be written as (A), where A is a valid string.
 * Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.
 *
 * Example 1:
 * Input: "())"
 * Output: 1
 *
 * Example 2:
 * Input: "((("
 * Output: 3
 *
 * Example 3:
 * Input: "()"
 * Output: 0
 *
 * Example 4:
 * Input: "()))(("
 * Output: 4
 *
 * Note:
 * S.length <= 1000
 * S only consists of '(' and ')' characters.
 * */
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
