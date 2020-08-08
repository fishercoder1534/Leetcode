package com.fishercoder.solutions;

import java.util.Stack;

public class _1541 {
    public static class Solution1 {
        public int minInsertions(String s) {
            Stack<Character> stack = new Stack<>();
            int insertionsNeeded = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    if (stack.isEmpty()) {
                        stack.add(c);
                    } else {
                        if (stack.peek() == ')') {
                            //in this case, we need to add one more ')' to get two consecutive right paren, then we could pop the one ')' and one '(' off the stack
                            insertionsNeeded++;
                            stack.pop();
                            stack.pop();
                            stack.add(c);
                        } else {
                            stack.add(c);
                        }
                    }
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        //in this case, we need to add one '(' before we add this ')' onto this stack
                        insertionsNeeded++;
                        stack.add('(');
                        stack.add(c);
                    } else {
                        if (stack.peek() == ')') {
                            //in this case, we could pop the one ')' and one '(' off the stack
                            stack.pop();
                            stack.pop();
                        } else {
                            stack.add(c);
                        }
                    }
                }
            }
            if (stack.isEmpty()) {
                return insertionsNeeded;
            } else {
                while (!stack.isEmpty()) {
                    char pop = stack.pop();
                    if (pop == '(') {
                        insertionsNeeded += 2;
                    } else {
                        insertionsNeeded++;
                        stack.pop();
                    }
                }
                return insertionsNeeded;
            }
        }
    }
}
