package com.fishercoder.solutions;

public class _1672 {
    public static class Solution1 {
        public int maximumWealth(int[][] accounts) {
            int m = accounts.length;
            int n = accounts[0].length;
            int max = 0;
            for (int i = 0; i < m; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum += accounts[i][j];
                }
                max = Math.max(max, sum);
            }
            return max;
        }
    }
}
