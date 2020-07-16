package com.fishercoder.solutions;

public class _474 {
    public static class Solution1 {
        public int findMaxForm(String[] strs, int m, int n) {
            int[][] dp = new int[m + 1][n + 1];
            for (String str : strs) {
                int[] count = count(str);
                for (int i = m; i >= count[0]; i--) {
                    for (int j = n; j >= count[1]; j--) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - count[0]][j - count[1]] + 1);
                    }
                }
            }
            return dp[m][n];
        }

        private int[] count(String str) {
            int[] res = new int[2];
            for (int i = 0; i < str.length(); i++) {
                res[str.charAt(i) - '0']++;
            }
            return res;
        }
    }

}
