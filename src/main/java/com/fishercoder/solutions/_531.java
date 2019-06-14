package com.fishercoder.solutions;

/**
 * 531. Lonely Pixel I
 *
 * Given a picture consisting of black and white pixels, find the number of black lonely pixels.
 * The picture is represented by a 2D char array consisting of 'B' and 'W', which means black and white pixels respectively.
 * A black lonely pixel is character 'B' that located at a specific position where the same row and same column don't have any other black pixels.

 Example:
 Input:
 [['W', 'W', 'B'],
 ['W', 'B', 'W'],
 ['B', 'W', 'W']]

 Output: 3
 Explanation: All the three 'B's are black lonely pixels.

 Note:
 The range of width and height of the input 2D array is [1,500].
 */
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
