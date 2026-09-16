package com.fishercoder.solutions.fifththousand;

public class _4052 {
    public static class Solution1 {
        /**
         * Row Phase: We iterate row by row ($r$). For each element at grid[r][c], we move it $k$
         * positions left to (c - k + n) % n and store the result in an intermediate grid temp.
         *
         * <p>Column Phase: We iterate column by column ($c$) over the newly created temp grid. For
         * each element at temp[r][c], we move it $k$ positions up to (r - k + n) % n and store the
         * final value in result.
         */
        public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
            int[][] temp = new int[n][n];

            // Step 1: Cyclically shift each row left
            for (int r = 0; r < n; r++) {
                int k = rowShift[r] % n;
                for (int c = 0; c < n; c++) {
                    int newCol = (c - k + n) % n;
                    temp[r][newCol] = grid[r][c];
                }
            }

            int[][] result = new int[n][n];

            // Step 2: Cyclically shift each column of the new grid upward
            for (int c = 0; c < n; c++) {
                int k = colShift[c] % n;
                for (int r = 0; r < n; r++) {
                    int newRow = (r - k + n) % n;
                    result[newRow][c] = temp[r][c];
                }
            }

            return result;
        }
    }

    public static class Solution2 {
        /**
         * Instead of simulating the matrix shifting step-by-step, you can compute the final
         * position of each cell (r, c) directly: Row Shift (Left): Shift row r left by k =
         * rowShift[r]. The column c moves to c' = (c - k % n + n) % n. Column Shift (Up): Shift
         * column c' up by k = colShift[c']. The row r moves to r' = (r - k % n + n) % n. Put
         * grid[r][c] directly into result[r'][c'].
         */
        public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
            int[][] res = new int[n][n];

            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    // 1. Calculate new column after row shift left
                    int newCol = ((c - rowShift[r]) % n + n) % n;

                    // 2. Calculate new row after column shift upward (using newCol's shift value)
                    int newRow = ((r - colShift[newCol]) % n + n) % n;

                    // 3. Place element in final destination
                    res[newRow][newCol] = grid[r][c];
                }
            }

            return res;
        }
    }
}
