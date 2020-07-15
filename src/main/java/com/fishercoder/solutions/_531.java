package com.fishercoder.solutions;

public class _531 {

    public static class Solution1 {
        public int findLonelyPixel(char[][] picture) {
            int m = picture.length;
            int n = picture[0].length;
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (picture[i][j] == 'B' && isLonely(i, j, picture, m, n)) {
                        count++;
                    }
                }
            }
            return count;
        }

        private boolean isLonely(int row, int col, char[][] picture, int m, int n) {
            for (int i = 0; i < m; i++) {
                if (i != row) {
                    if (picture[i][col] == 'B') {
                        return false;
                    }
                }
            }

            for (int j = 0; j < n; j++) {
                if (j != col) {
                    if (picture[row][j] == 'B') {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
