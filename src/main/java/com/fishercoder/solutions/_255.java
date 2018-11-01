package com.fishercoder.solutions;

import java.util.Stack;

public class _255 {

    public static class Solution1 {
        public boolean verifyPreorder(int[] preorder) {
            int low = Integer.MIN_VALUE;
            Stack<Integer> stack = new Stack();
            for (int p : preorder) {
                if (p < low) {
                    return false;
                }
                while (!stack.empty() && p > stack.peek()) {
                    low = stack.pop();
                }
                stack.push(p);
            }
            return true;
        }
    }

}
