package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;

/**
 * 174. Dungeon Game

 The demons had captured the princess (P) and imprisoned her in the bottom-right corner of a dungeon. The dungeon consists of M x N rooms laid out in a 2D grid. Our valiant knight (K) was initially positioned in the top-left room and must fight his way through the dungeon to rescue the princess.

 The knight has an initial health point represented by a positive integer. If at any point his health point drops to 0 or below, he dies immediately.

 Some of the rooms are guarded by demons, so the knight loses health (negative integers) upon entering these rooms; other rooms are either empty (0's) or contain magic orbs that increase the knight's health (positive integers).

 In order to reach the princess as quickly as possible, the knight decides to move only rightward or downward in each step.

 Write a function to determine the knight's minimum initial health so that he is able to rescue the princess.

 For example, given the dungeon below, the initial health of the knight must be at least 7 if he follows the optimal path RIGHT-> RIGHT -> DOWN -> DOWN.
 -2 (K) 	-3 	3
 -5 	-10 	1
 10 	30 	-5 (P)

 Note:

 The knight's health has no upper bound.
 Any room can contain threats or power-ups, even the first room the knight enters and the bottom-right room where the princess is imprisoned.

 */
public class _174 {

  public static class Solution1 {
    /** This problem should fill the dp matrix from bottom right. */
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
