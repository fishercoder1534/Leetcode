package com.fishercoder.solutions;

/**
 * 885. Spiral Matrix III
 *
 * On a 2 dimensional grid with R rows and C columns, we start at (r0, c0) facing east.
 * Here, the north-west corner of the grid is at the first row and column, and the south-east corner of the grid is at the last row and column.
 * Now, we walk in a clockwise spiral shape to visit every position in this grid.
 * Whenever we would move outside the boundary of the grid, we continue our walk outside the grid (but may return to the grid boundary later.)
 * Eventually, we reach all R * C spaces of the grid.
 * Return a list of coordinates representing the positions of the grid in the order they were visited.
 *
 * Example 1:
 * Input: R = 1, C = 4, r0 = 0, c0 = 0
 * Output: [[0,0],[0,1],[0,2],[0,3]]
 *
 * Example 2:
 * Input: R = 5, C = 6, r0 = 1, c0 = 4
 * Output: [[1,4],[1,5],[2,5],[2,4],[2,3],[1,3],[0,3],[0,4],[0,5],[3,5],[3,4],[3,3],[3,2],[2,2],[1,2],[0,2],[4,5],[4,4],[4,3],[4,2],[4,1],[3,1],[2,1],[1,1],[0,1],[4,0],[3,0],[2,0],[1,0],[0,0]]
 *
 * Note:
 * 1 <= R <= 100
 * 1 <= C <= 100
 * 0 <= r0 < R
 * 0 <= c0 < C
 * */
public class _885 {
    public static class Solution1 {
        /**credit: https://leetcode.com/problems/spiral-matrix-iii/discuss/158977/Java-15-lines-concise-solution-with-comments*/
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
