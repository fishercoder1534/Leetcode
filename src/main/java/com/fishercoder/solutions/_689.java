package com.fishercoder.solutions;

public class _689 {
    public static class Solution1 {
        /**
         * we basically need to find the interval (i, i+k-1) as the middle interval, where k <= i <= n-2k
         * then this interval (0, i-1) will be the left interval
         * the interval (i+k, n-1) will be the right interval.
         * <p>
         * Please pay special attention to the variable name I use here: this `k` is not a random one, it's the `k`
         * from the passed in parameter.
         * <p>
         * Credit: https://discuss.leetcode.com/topic/105577/c-java-dp-with-explanation-o-n/
         */
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
