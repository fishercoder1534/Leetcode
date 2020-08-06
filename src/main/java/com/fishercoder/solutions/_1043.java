package com.fishercoder.solutions;

public class _1043 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/partition-array-for-maximum-sum/discuss/290863/JavaC%2B%2BPython-DP
         */
        public int maxSumAfterPartitioning(int[] A, int K) {
            int N = A.length;
            int[] dp = new int[N];
            for (int i = 0; i < N; i++) {
                int curMax = 0;
                for (int k = 1; k <= K && i - k + 1 >= 0; k++) {
                    curMax = Math.max(curMax, A[i - k + 1]);
                    dp[i] = Math.max(dp[i], (i >= k ? dp[i - k] : 0) + curMax * k);
                }
            }
            return dp[N - 1];
        }
    }
}
