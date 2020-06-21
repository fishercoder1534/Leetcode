package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;

public class _174 {

    public static class Solution1 {
        /**
         * This problem should fill the dp matrix from bottom right.
         */
        public int calculateMinimumHP(int[][] dungeon) {
            if (dungeon == null || dungeon.length == 0) {
                return 0;
            }

            int height = dungeon.length;
            int width = dungeon[0].length;
            int[][] dp = new int[height][width];
            dp[height - 1][width - 1] =
                    (dungeon[height - 1][width - 1] > 0) ? 1 : 1 - dungeon[height - 1][width - 1];

            //fill the last column
            for (int i = height - 2; i >= 0; i--) {
                int temp = dp[i + 1][width - 1] - dungeon[i][width - 1];
                dp[i][width - 1] = Math.max(1, temp);
            }

            //fill the last row
            for (int j = width - 2; j >= 0; j--) {
                int temp = dp[height - 1][j + 1] - dungeon[height - 1][j];
                dp[height - 1][j] = Math.max(temp, 1);
            }

            for (int i = height - 2; i >= 0; i--) {
                for (int j = width - 2; j >= 0; j--) {
                    int down = Math.max(1, dp[i + 1][j] - dungeon[i][j]);
                    int right = Math.max(1, dp[i][j + 1] - dungeon[i][j]);
                    dp[i][j] = Math.min(down, right);
                }
            }

            CommonUtils.printMatrix(dp);
            return dp[0][0];
        }
    }
}
