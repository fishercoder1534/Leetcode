package com.fishercoder.solutions;

import java.util.Stack;

public class _503 {

    public static class Solution1 {
        /**
         * Credit: https://discuss.leetcode.com/topic/77881/typical-ways-to-solve-circular-array-problems-java-solution
         * Note: we store INDEX into the stack, reversely, the larger index put at the bottom of the stack, the smaller index at the top
         */
        public int[] nextGreaterElements(int[] nums) {
            if (nums == null || nums.length == 0) {
                return nums;
            }
            int len = nums.length;
            Stack<Integer> stack = new Stack<>();
            for (int i = len - 1; i >= 0; i--) {
                stack.push(i);
                //push all indexes into the stack reversely
            }
            int[] result = new int[len];
            for (int i = len - 1; i >= 0; i--) {
                result[i] = -1;
                //initialize it to be -1 in case we cannot find its next greater element in the array
                while (!stack.isEmpty() && (nums[stack.peek()] <= nums[i])) {
                    stack.pop();
                }
                if (!stack.isEmpty()) {
                    result[i] = nums[stack.peek()];
                }
                stack.push(i);
            }
            return result;
        }
    }

    public static class Solution2 {
        /**
         * credit: https://leetcode.com/articles/next-greater-element-ii/
         */
        public int[] nextGreaterElements(int[] nums) {
            int[] result = new int[nums.length];
            Stack<Integer> stack = new Stack<>();
            for (int i = nums.length * 2 - 1; i >= 0; i--) {
                while (!stack.isEmpty() && nums[stack.peek()] <= nums[i % nums.length]) {
                    stack.pop();
                }
                result[i % nums.length] = stack.isEmpty() ? -1 : nums[stack.peek()];
                stack.push(i % nums.length);
            }
            return result;
        }
    }

}
