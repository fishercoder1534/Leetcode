package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 1388. Pizza With 3n Slices
 *
 * There is a pizza with 3n slices of varying size, you and your friends will take slices of pizza as follows:
 * You will pick any pizza slice.
 * Your friend Alice will pick next slice in anti clockwise direction of your pick.
 * Your friend Bob will pick next slice in clockwise direction of your pick.
 * Repeat until there are no more slices of pizzas.
 * Sizes of Pizza slices is represented by circular array slices in clockwise direction.
 *
 * Return the maximum possible sum of slice sizes which you can have.
 *
 * Example 1:
 * Input: slices = [1,2,3,4,5,6]
 * Output: 10
 * Explanation: Pick pizza slice of size 4, Alice and Bob will pick slices with size 3 and 5 respectively. Then Pick slices with size 6, finally Alice and Bob will pick slice of size 2 and 1 respectively. Total = 4 + 6.
 *
 * Example 2:
 * Input: slices = [8,9,8,6,1,1]
 * Output: 16
 * Output: Pick pizza slice of size 8 in each turn. If you pick slice with size 9 your partners will pick slices of size 8.
 *
 * Example 3:
 * Input: slices = [4,1,2,5,8,3,1,9,7]
 * Output: 21
 *
 * Example 4:
 * Input: slices = [3,1,2]
 * Output: 3
 *
 * Constraints:
 * 1 <= slices.length <= 500
 * slices.length % 3 == 0
 * 1 <= slices[i] <= 1000
 * */
public class _1388 {
    public static class Solution1 {
        public int maxSizeSlices(int[] slices) {
            int n = slices.length;
            int[] b = Arrays.copyOf(slices, 2 * n);
            for (int i = 0; i < n; i++) {
                b[i + n] = slices[i];
            }
            int[][] dp = new int[2 * n][2 * n];
            for (int len = 3; len <= n; len += 3) {
                for (int i = 0; i + len - 1 < 2 * n; i++) {
                    int j = i + len - 1;
                    for (int k = i + 3; k <= j - 2; k += 3) {
                        dp[i][j] = Math.max(dp[i][j], dp[i][k - 1] + dp[k][j]);
                    }
                    for (int k = i + 1; k < j; k += 3) {
                        dp[i][j] = Math.max(dp[i][j],
                                (i + 1 <= k - 1 ? dp[i + 1][k - 1] : 0)
                                        + b[k] + (k + 1 <= j - 1 ? dp[k + 1][j - 1] : 0)
                        );
                    }
                }
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans = Math.max(ans, dp[i][i + n - 1]);
            }
            return ans;
        }
    }
}
