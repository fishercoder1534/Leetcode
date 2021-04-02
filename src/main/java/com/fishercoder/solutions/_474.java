package com.fishercoder.solutions;

public class _474 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/ones-and-zeroes/discuss/95811/Java-Iterative-DP-Solution-O(mn)-Space and
         * https://leetcode.com/problems/ones-and-zeroes/discuss/95811/Java-Iterative-DP-Solution-O(mn)-Space/100352
         * <p>
         * The problem can be interpreted as:
         * What's the max number of str can we pick from strs with limitation of m "0"s and n "1"s.
         *
         * Thus we can define dp[i][j] as it stands for max number of str can we pick from strs with limitation of i "0"s and j "1"s.
         *
         * For each str, assume it has a "0"s and b "1"s, we update the dp array iteratively
         * and set dp[i][j] = Math.max(dp[i][j], dp[i - a][j - b] + 1).
         * So at the end, dp[m][n] is the answer.
         */
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
