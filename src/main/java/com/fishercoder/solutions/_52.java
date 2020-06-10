package com.fishercoder.solutions;

public class _52 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/29626/easiest-java-solution-1ms-98-22
         */
        int count = 0;

        public int totalNQueens(int n) {
            boolean[] cols = new boolean[n];
            boolean[] diagnol = new boolean[2 * n];
            boolean[] antiDiagnol = new boolean[2 * n];
            backtracking(0, cols, diagnol, antiDiagnol, n);
            return count;
        }

        private void backtracking(int row, boolean[] cols, boolean[] diagnol, boolean[] antiDiagnol,
                                  int n) {
            if (row == n) {
                count++;
            }
            for (int col = 0; col < n; col++) {
                int x = col - row + n;
                int y = col + row;
                if (cols[col] || diagnol[x] || antiDiagnol[y]) {
                    continue;
                }
                cols[col] = true;
                diagnol[x] = true;
                antiDiagnol[y] = true;
                backtracking(row + 1, cols, diagnol, antiDiagnol, n);
                cols[col] = false;
                diagnol[x] = false;
                antiDiagnol[y] = false;
            }
        }
    }
}
