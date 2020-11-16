package com.fishercoder.solutions;

import java.util.Arrays;

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
