package com.fishercoder.solutions;

public class _1981 {
    public static class Solution1 {
        /**
         * creidt: https://leetcode.com/problems/minimize-the-difference-between-target-and-chosen-elements/discuss/1418614/Java-dp-code-with-proper-comments-and-explanation
         */
        int ans = Integer.MAX_VALUE;
        boolean[][] dp;

        public int minimizeTheDifference(int[][] mat, int target) {
            dp = new boolean[mat.length][4900];//we use 4900 due to the contraints in this problem: 70 * 70 = 4900
            memo(mat, 0, 0, target);
            return ans;
        }

        private void memo(int[][] mat, int row, int sum, int target) {
            if (dp[row][sum]) {
                return;
            }
            if (row == mat.length - 1) {
                for (int i = 0; i < mat[0].length; i++) {
                    ans = Math.min(ans, Math.abs(sum + mat[row][i] - target));
                }
                dp[row][sum] = true;
                return;
            }
            for (int i = 0; i < mat[0].length; i++) {
                memo(mat, row + 1, sum + mat[row][i], target);
            }
            dp[row][sum] = true;
        }
    }
}
