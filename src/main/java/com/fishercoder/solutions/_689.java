package com.fishercoder.solutions;

/**
 * 689. Maximum Sum of 3 Non-Overlapping Subarrays
 *
 * In a given array nums of positive integers, find three non-overlapping subarrays with maximum sum.
 * Each subarray will be of size k, and we want to maximize the sum of all 3*k entries.
 * Return the result as a list of indices representing the starting position of each interval (0-indexed).
 * If there are multiple answers, return the lexicographically smallest one.

 Example:
 Input: [1,2,1,2,6,7,5,1], 2
 Output: [0, 3, 5]
 Explanation: Subarrays [1, 2], [2, 6], [7, 5] correspond to the starting indices [0, 3, 5].
 We could have also taken [2, 1], but an answer of [1, 3, 5] would be lexicographically larger.

 Note:
 nums.length will be between 1 and 20000.
 nums[i] will be between 1 and 65535.
 k will be between 1 and floor(nums.length / 3).
 */
public class _689 {
    public static class Solution1 {
        /**we basically need to find the interval (i, i+k-1) as the middle interval, where k <= i <= n-2k
         * then this interval (0, i-1) will be the left interval
         * the interval (i+k, n-1) will be the right interval.
         *
         * Please pay special attention to the variable name I use here: this `k` is not a random one, it's the `k`
         * from the passed in parameter.
         *
         * Credit: https://discuss.leetcode.com/topic/105577/c-java-dp-with-explanation-o-n/*/
        public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
            if (nums == null || nums.length == 0) {
                return new int[]{};
            }
            int n = nums.length;
            int[] sums = new int[n + 1];
            for (int i = 0; i < n; i++) {
                sums[i + 1] = sums[i] + nums[i];
            }

            int[] leftMax = new int[n];
            for (int i = k, total = sums[k] - sums[0]; i < n; i++) {
                if (sums[i + 1] - sums[i + 1 - k] > total) {
                    leftMax[i] = i + 1 - k;
                    total = sums[i + 1] - sums[i + 1 - k];
                } else {
                    leftMax[i] = leftMax[i - 1];
                }
            }

            int[] rightMax = new int[n];
            rightMax[n - k] = n - k;
            for (int i = n - k - 1, total = sums[n] - sums[n - k]; i >= 0; i--) {
                if (sums[i + k] - sums[i] >= total) {
                    rightMax[i] = i;
                    total = sums[i + k] - sums[i];
                } else {
                    rightMax[i] = rightMax[i + 1];
                }
            }

            //try to find all possible middle intervals
            int[] result = new int[3];
            int max = 0;
            for (int i = k; i <= n - 2 * k; i++) {
                int left = leftMax[i - 1];
                int right = rightMax[i + k];
                int total = (sums[i + k] - sums[i]) + (sums[left + k] - sums[left]) + (sums[right + k] - sums[right]);
                if (total > max) {
                    max = total;
                    result[0] = left;
                    result[1] = i;
                    result[2] = right;
                }
            }
            return result;
        }
    }

    public static class Solution2 {
        /**reference: https://leetcode.com/articles/maximum-sum-of-3-non-overlapping-intervals*/
    }
}
