package com.fishercoder.solutions;

public class _885 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/spiral-matrix-iii/discuss/158977/Java-15-lines-concise-solution-with-comments
         */
        public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
            int[] directions = new int[]{0, 1, 0, -1, 0};
            int[][] result = new int[R * C][2];
            int i = 0;
            result[i++] = new int[]{r0, c0};
            int len = 0;
            int d = 0;
            while (i < R * C) {
                if (d == 0 || d == 2) {
                    //plus one when moving east or west
                    len++;
                }
                for (int k = 0; k < len; k++) {
                    r0 += directions[d];
                    c0 += directions[d + 1];
                    if (r0 >= 0 && r0 < R && c0 >= 0 && c0 < C) {
                        result[i++] = new int[]{r0, c0};
                    }
                }
                d = (d + 1) % 4;
            }
            return result;
        }
    }
}
