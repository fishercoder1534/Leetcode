package com.fishercoder.solutions.firstthousand;

import java.util.ArrayDeque;
import java.util.Deque;

public class _962 {
    public static class Solution1 {
        /**
         * This brute force solution is not efficient enough and gets TLE'd on LeetCode at 95 / 101 testcases passed
         */
        public int maxWidthRamp(int[] nums) {
            int max = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] <= nums[j]) {
                        max = Math.max(max, j - i);
                    }
                }
            }
            return max;
        }
    }

    public static class Solution2 {
        public int maxWidthRamp(int[] nums) {
            //use a monotonic stack and let it be non-decreasing
            Deque<Integer> stack = new ArrayDeque<>(); //push index onto the stack instead of the values of the array
            int max = 0;

            //Pass 1: build a strictly decreasing stack of indices
            for (int i = 0; i < nums.length; i++) {
                if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                    stack.push(i);
                }
            }

            //Pass 2: Traverse from right to left to find the max width
            for (int i = nums.length - 1; i >= 0; i--) {
                while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                    max = Math.max(max, i - stack.pop());
                }
            }
            return max;
        }
    }
}
