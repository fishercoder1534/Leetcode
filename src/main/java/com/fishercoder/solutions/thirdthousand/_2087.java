package com.fishercoder.solutions.thirdthousand;

public class _2087 {
    public static class Solution1 {
        /**
         * Credit: Gemini
         * 1. There's no negative cost;
         * 2. There's no obstacles;
         * 3. The robot just needs to move row by row and column by column until it reaches home.
         */
        public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
            int cost = 0;
            int row = startPos[0];
            int col = startPos[1];
            while (row != homePos[0]) {
                row += homePos[0] > row ? 1 : -1;
                cost += rowCosts[row];
            }
            while (col != homePos[1]) {
                col += homePos[1] > col ? 1 : -1;
                cost += colCosts[col];
            }
            return cost;
        }
    }
}
