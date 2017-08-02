package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 20. Valid Parentheses
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.*/
public class _20 {

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) return false;
                else {
                    if (stack.peek() == '(' && s.charAt(i) != ')') return false;
                    else if (stack.peek() == '{' && s.charAt(i) != '}') return false;
                    else if (stack.peek() == '[' && s.charAt(i) != ']') return false;
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
