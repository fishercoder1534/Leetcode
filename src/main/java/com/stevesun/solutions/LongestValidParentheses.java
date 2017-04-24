package com.stevesun.solutions;

import java.util.Stack;

/**
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

 For "(()", the longest valid parentheses substring is "()", which has length = 2.

 Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
 */
public class LongestValidParentheses {
	public int longestValidParentheses(String s) {
		int result = 0;
		Stack<Integer> stack = new Stack();
		stack.push(-1);
		for (int i = 0; i < s.length(); i++){
			if (s.charAt(i) == '('){
				stack.push(i);
			} else {
				stack.pop();
				if (stack.isEmpty()){
					stack.push(i);
				} else {
					result = Math.max(result, i-stack.peek());
				}
			}
		}
		return result;
	}
}
