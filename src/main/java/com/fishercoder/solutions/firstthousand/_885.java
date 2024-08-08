package com.fishercoder.solutions.firstthousand;

public class _885 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/spiral-matrix-iii/discuss/158977/Java-15-lines-concise-solution-with-comments
         */
        public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
            int[] directions = new int[]{0, 1, 0, -1, 0};
            int[][] result = new int[rows * cols][2];
            int i = 0;
            result[i++] = new int[]{rStart, cStart};
            int len = 0;
            int d = 0;
            while (i < rows * cols) {
                if (d == 0 || d == 2) {
                    //plus one when moving east or west
                    len++;
                }
                for (int k = 0; k < len; k++) {
                    rStart += directions[d];
                    cStart += directions[d + 1];
                    if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                        result[i++] = new int[]{rStart, cStart};
                    }
                }
                d = (d + 1) % 4;
            }
            return result;
        }
    }
}
