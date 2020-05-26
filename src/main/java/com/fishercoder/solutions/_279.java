package com.fishercoder.solutions;

import java.util.Arrays;

public class _279 {
    public static class Solution1 {
        public int numSquares(int n) {
            int result = n;
            int num = 2;
            while (num * num <= n) {
                int temp1 = n / (num * num);
                int temp2 = n % (num * num);
                result = Math.min(result, temp1 + numSquares(temp2));
                num++;
            }
            return result;
        }
    }

    public static class Solution2 {
        //DP solution
        public int numSquares(int n) {
            int[] dp = new int[n + 1];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[0] = 0;
            dp[1] = 1;
            for (int i = 1; i <= n; i++) {
                int min = Integer.MAX_VALUE;
                int j = 1;
                while (i - j * j >= 0) {
                    min = Math.min(min, dp[i - j * j] + 1);
                    j++;
                }
                dp[i] = min;
            }
            return dp[n];
        }
    }

}
