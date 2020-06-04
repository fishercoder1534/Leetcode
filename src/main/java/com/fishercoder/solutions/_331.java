package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

public class _331 {

    public static class Solution1 {
        public boolean isValidSerialization(String preorder) {
            /**Idea: we keep inserting the string into the stack, if it's a number, we just push it onto the stack;
             * if it's a "#", we see if the top of the stack is a "#" or not,
             * 1. if it's a "#", we pop it and keep popping numbers from the stack,
             * 2. if it's not a "#", we push the "#" onto the stack*/
            if (preorder == null || preorder.length() == 0) {
                return false;
            }
            String[] pre = preorder.split(",");
            Deque<String> stack = new ArrayDeque<>();
            for (int i = 0; i < pre.length; i++) {
                while (pre[i].equals("#") && !stack.isEmpty() && stack.peekLast().equals("#")) {
                    stack.pollLast();
                    if (stack.isEmpty()) {
                        return false;
                    }
                    stack.pollLast();
                }
                stack.addLast(pre[i]);
            }
            return stack.size() == 1 && stack.peekLast().equals("#");
        }
    }

}
