package com.fishercoder.solutions.secondthousand;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class _1541 {
    public static class Solution1 {
        /**
         * There are only a few cases:
         * 1. when we encounter '(', always push it onto the stack;
         * 2. when we encounter ')':
         *          if there's nothing on the stack, then we need to insert one open paren,
         *          then check if the one character following this ')' is another ')' or not, if not, we need to insert one more closed parent;
         * 3. after going through all characters in the string, we need to iterate through all characters remaining on the stack which must be all open paren '(':
         *          for each, we'll have to insert two closed parent
         */
        public int minInsertions(String s) {
            int insertions = 0;
            Deque<Character> stack = new LinkedList<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        //this is to insert an open paren '('
                        insertions++;
                    } else {
                        stack.pop();
                    }
                    if (i < s.length() - 1 && s.charAt(i + 1) == ')') {
                        i++;
                    } else {
                        //this is to insert a closed paren ')'
                        insertions++;
                    }
                }
            }
            while (!stack.isEmpty()) {
                insertions += 2;
                stack.pop();
            }
            return insertions;
        }
    }
}
