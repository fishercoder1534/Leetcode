package com.fishercoder.solutions;

import java.util.Deque;
import java.util.LinkedList;

public class _1966 {
    public static class Solution1 {
        /**
         * Brute force: this ends in TLE on LeetCode.
         * The idea is: for every single number in the array, check if there's any number on its right side that's smaller than it
         * and if there's any number on its left side that's bigger than it.
         * If so, based on binary search, if that number gets picked as a pivot for the next search, then this number might not be found.
         */
        public int binarySearchableNumbers(int[] nums) {
            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                int j = i + 1;
                for (; j < nums.length; j++) {
                    if (nums[j] < nums[i]) {
                        break;
                    }
                }
                if (j == nums.length) {
                    int k = i - 1;
                    for (; k >= 0; k--) {
                        if (nums[i] < nums[k]) {
                            break;
                        }
                    }
                    if (k <= 0) {
                        ans++;
                    }
                }
            }
            return ans;
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution.
         */
        public int binarySearchableNumbers(int[] nums) {
            int ans = 0;
            int[] maxLeft = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                maxLeft[i] = i == 0 ? nums[i] : Math.max(nums[i], maxLeft[i - 1]);
            }
            int[] minRight = new int[nums.length];
            for (int i = nums.length - 1; i >= 0; i--) {
                minRight[i] = i + 1 == nums.length ? nums[i] : Math.min(minRight[i + 1], nums[i]);
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= maxLeft[i] && nums[i] <= minRight[i]) {
                    ans++;
                }
            }
            return ans;
        }
    }

    public static class Solution3 {
        /**
         * Using monotonic stack:
         * 1. we only add the ones that are greater than those already on the stack onto the stack.
         * 2. if the existing ones on the stack are greater than the current one,
         * pop them off because they won't be found based on binary search, as a smaller element is on their right side.
         */
        public int binarySearchableNumbers(int[] nums) {
            Deque<Integer> stack = new LinkedList<>();
            int maxLeft = Integer.MIN_VALUE;
            for (int num : nums) {
                while (!stack.isEmpty() && stack.peekLast() > num) {
                    stack.pollLast();
                }
                if (num >= maxLeft) {
                    stack.addLast(num);
                }
                maxLeft = Math.max(maxLeft, num);
            }
            return stack.size();
        }
    }
}
