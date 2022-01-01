package com.fishercoder.solutions;

public class _312 {

    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/burst-balloons/discuss/76228/Share-some-analysis-and-explanations
         * <p>
         * Divide and conquer with memoization
         */
        public int maxCoins(int[] nums) {
            int[] input = new int[nums.length + 2];
            int n = 1;
            for (int x : nums) {
                if (x > 0) {
                    input[n++] = x;
                }
            }
            input[0] = 1;
            input[n++] = 1;

            int[][] memo = new int[n][n];
            return burst(memo, input, 0, n - 1);
        }

        private int burst(int[][] memo, int[] nums, int left, int right) {
            if (left + 1 == right) {
                return 0;
            }
            if (memo[left][right] > 0) {
                return memo[left][right];
            }
            int ans = 0;
            for (int i = left + 1; i < right; i++) {
                ans = Math.max(ans, nums[left] * nums[i] * nums[right] + burst(memo, nums, left, i) + burst(memo, nums, i, right));
            }
            memo[left][right] = ans;
            return ans;
        }
    }
}
