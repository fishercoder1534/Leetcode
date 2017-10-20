package com.fishercoder.solutions;

import java.util.Stack;

/**
 * 255. Verify Preorder Sequence in Binary Search Tree
 * Given an array of numbers, verify whether it is the correct preorder traversal sequence of a binary search tree.
 * You may assume each number in the sequence is unique.

 Follow up:
 Could you do it using only constant space complexity?
 */
public class _255 {

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
