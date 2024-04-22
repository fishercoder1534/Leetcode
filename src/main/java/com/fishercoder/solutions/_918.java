package com.fishercoder.solutions;

public class _918 {
    public static class Solution1 {
        /**
         * This is my original solution, but results in TLE on LeetCode.
         * Time: O(n^2)
         */
        public int maxSubarraySumCircular(int[] nums) {
            int[] prefixSums;
            int maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                prefixSums = new int[nums.length];
                for (int j = i, k = 0; j < (i + nums.length); j++) {
                    if (k == 0) {
                        prefixSums[k] = nums[(j + nums.length) % nums.length];
                    } else {
                        prefixSums[k] = prefixSums[k - 1] + nums[(j + nums.length) % nums.length];
                    }
                    maxSum = Math.max(maxSum, prefixSums[k++]);
                }
            }
            return maxSum;
        }
    }

    public static class Solution2 {
        /**
         * Credit: https://leetcode.com/problems/maximum-sum-circular-subarray/discuss/178422/One-Pass
         * Think of two cases:
         * 1. the max comes from the contiguous part of the original array
         * 2. the max comes from connecting the tail part and the head part of the original array.
         * See graph from the above link.
         * <p>
         * Time: O(n)
         * <p>
         * This is a follow-up from https://leetcode.com/problems/maximum-subarray/ which is solved by Kadane's algorithm.
         */
        public int maxSubarraySumCircular(int[] nums) {
            int currMax = 0;
            int globalMax = nums[0];
            int currMin = 0;
            int globalMin = nums[0];
            int total = 0;
            for (int i = 0; i < nums.length; i++) {
                currMax = Math.max(nums[i], currMax + nums[i]);
                globalMax = Math.max(globalMax, currMax);
                currMin = Math.min(currMin + nums[i], nums[i]);
                globalMin = Math.min(currMin, globalMin);
                total += nums[i];
            }
            return globalMax > 0 ? Math.max(globalMax, total - globalMin) : globalMax;
        }
    }

    public static class Solution3 {
        /**
         * Credit: https://leetcode.com/problems/maximum-sum-circular-subarray/discuss/633058/Java-or-C%2B%2B-or-Python3-or-With-detailed-explanation-or-O(N)-time-or-O(1)
         * This one is similar to the above Solution2, but only slightly differs in that it starts from i = 1 instead of i = 0
         * And it listed out a few examples to help illustrate why this algorithm makes sense.
         * Which I think is easier to make sense of.
         * <p>
         * Time: O(n)
         * <p>
         * This is a follow-up from https://leetcode.com/problems/maximum-subarray/ which is solved by Kadane's algorithm.
         */
        public int maxSubarraySumCircular(int[] nums) {
            int currMax = nums[0];
            int globalMax = nums[0];
            int currMin = nums[0];
            int globalMin = nums[0];
            int total = nums[0];
            for (int i = 1; i < nums.length; i++) {
                currMax = Math.max(nums[i], currMax + nums[i]);
                globalMax = Math.max(globalMax, currMax);
                currMin = Math.min(currMin + nums[i], nums[i]);
                globalMin = Math.min(currMin, globalMin);
                total += nums[i];
            }
            return globalMax > 0 ? Math.max(globalMax, total - globalMin) : globalMax;
        }
    }
}
