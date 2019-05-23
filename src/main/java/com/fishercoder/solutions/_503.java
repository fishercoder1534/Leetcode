package com.fishercoder.solutions;

import java.util.Stack;

/**
 * 503. Next Greater Element II
 *
 * Given a circular array (the next element of the last element is the first element of the array),
 * print the Next Greater Number for every element.
 * The Next Greater Number of a number x is the first greater number to its traversing-order next in the array,
 * which means you could search circularly to find its next greater number. If it doesn't exist, output -1 for this number.

 Example 1:
 Input: [1,2,1]
 Output: [2,-1,2]
 Explanation: The first 1's next greater number is 2;
 The number 2 can't find next greater number;
 The second 1's next greater number needs to search circularly, which is also 2.
 Note: The length of given array won't exceed 10000.
 */
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
