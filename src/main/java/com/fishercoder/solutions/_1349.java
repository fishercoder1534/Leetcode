package com.fishercoder.solutions;

import java.util.Arrays;

public class _1349 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/maximum-students-taking-exam/discuss/503686/A-simple-tutorial-on-this-bitmasking-problem
         */
        public int maxStudents(char[][] seats) {
            int m = seats.length;
            int n = seats[0].length;
            int[] validRows = new int[m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    validRows[i] = (validRows[i] << 1) + (seats[i][j] == '.' ? 1 : 0);
                }
            }
            int stateSize = 1 << n; // There are 2^n states for n columns in binary format
            int[][] dp = new int[m][stateSize];
            for (int i = 0; i < m; i++) {
                Arrays.fill(dp[i], -1);
            }
            int ans = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < stateSize; j++) {
                    if (((j & validRows[i]) == j) && ((j & (j << 1)) == 0)) {
                        if (i == 0) {
                            dp[i][j] = Integer.bitCount(j);
                        } else {
                            for (int k = 0; k < stateSize; k++) {
                                if (((k << 1) & j) == 0 && ((j << 1) & k) == 0 && dp[i - 1][k] != -1) {
                                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + Integer.bitCount(j));
                                }
                            }
                        }
                        ans = Math.max(ans, dp[i][j]);
                    }
                }
            }
            return ans;
        }
    }
}
