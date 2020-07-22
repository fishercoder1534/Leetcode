package com.fishercoder.solutions;

public class _718 {
    public static class Solution1 {
        public int findLength(int[] A, int[] B) {
            if (A == null || B == null || A.length == 0 || B.length == 0) {
                return 0;
            }
            int[][] dp = new int[A.length + 1][B.length + 1];
            int result = 0;
            for (int i = A.length - 1; i >= 0; i--) {
                for (int j = B.length - 1; j >= 0; j--) {
                    if (A[i] == B[j]) {
                        dp[i][j] = dp[i + 1][j + 1] + 1;
                    }
                    result = Math.max(result, dp[i][j]);
                }
            }
            return result;
        }
    }
}
