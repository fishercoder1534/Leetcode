package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 416. Partition Equal Subset Sum
 *
 * Given a non-empty array containing only positive integers,
 * find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.

 Note:

 Each of the array element will not exceed 100.
 The array size will not exceed 200.

 Example 1:

 Input: [1, 5, 11, 5]

 Output: true

 Explanation: The array can be partitioned as [1, 5, 5] and [11].


 Example 2:

 Input: [1, 2, 3, 5]

 Output: false

 Explanation: The array cannot be partitioned into equal sum subsets.
 */
public class _416 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/67539/0-1-knapsack-detailed-explanation
         */
        public boolean canPartition(int[] nums) {
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }

            if ((sum & 1) == 1) {
                return false;
            }

            sum /= 2;

            int n = nums.length;
            boolean[][] dp = new boolean[n + 1][sum + 1];
            for (int i = 0; i < dp.length; i++) {
                Arrays.fill(dp[i], false);
            }

            dp[0][0] = true;

            for (int i = 1; i < n + 1; i++) {
                dp[i][0] = true;
            }

            for (int j = 1; j < sum + 1; j++) {
                dp[0][j] = false;
            }

            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < sum + 1; j++) {
                    dp[i][j] = dp[i - 1][j];
                    if (j >= nums[i - 1]) {
                        dp[i][j] = (dp[i][j] || dp[i - 1][j - nums[i - 1]]);
                    }
                }
            }

            return dp[n][sum];
        }
    }

}
