package com.fishercoder.solutions.secondthousand;

import java.util.Arrays;

public class _1099 {
    public static class Solution1 {
        /**
         * Time: O(n^2)
         * Space: O(1)
         */
        public int twoSumLessThanK(int[] nums, int k) {
            int maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] < k) {
                        maxSum = Math.max(maxSum, nums[i] + nums[j]);
                    }
                }
            }
            return maxSum == Integer.MIN_VALUE ? -1 : maxSum;
        }
    }

    public static class Solution2 {
        /**
         * Time: O(nlogn)
         * Space: O(1)
         */
        public int twoSumLessThanK(int[] nums, int k) {
            Arrays.sort(nums);
            int left = 0;
            int right = nums.length - 1;
            int sum = Integer.MIN_VALUE;
            while (left < right) {
                int newSum = nums[left] + nums[right];
                if (newSum < k && newSum > sum) {
                    sum = newSum;
                } else if (newSum >= k) {
                    right--;
                } else {
                    left++;
                }
            }
            return sum == Integer.MIN_VALUE ? -1 : sum;
        }
    }
}
