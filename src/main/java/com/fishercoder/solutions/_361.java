package com.fishercoder.solutions;

public class _361 {

    public static class Solution1 {
        public int maxKilledEnemies(char[][] grid) {
            int m = grid.length;
            if (grid == null || m == 0) {
                return 0;
            }
            int n = grid[0].length;

            int[][] max = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (grid[i][j] == '0') {
                        int count = 0;

                        //count all possible hits in its upward direction
                        for (int k = j - 1; k >= 0; k--) {
                            if (grid[i][k] == 'E') {
                                count++;
                            } else if (grid[i][k] == 'W') {
                                break;
                            }
                        }

                        //count all possible hits in its downward direction
                        for (int k = j + 1; k < n; k++) {
                            if (grid[i][k] == 'E') {
                                count++;
                            } else if (grid[i][k] == 'W') {
                                break;
                            }
                        }

                        //count all possible hits in its right direction
                        for (int k = i + 1; k < m; k++) {
                            if (grid[k][j] == 'E') {
                                count++;
                            } else if (grid[k][j] == 'W') {
                                break;
                            }
                        }

                        //count all possible hits in its left direction
                        for (int k = i - 1; k >= 0; k--) {
                            if (grid[k][j] == 'E') {
                                count++;
                            } else if (grid[k][j] == 'W') {
                                break;
                            }
                        }

                        max[i][j] = count;
                    }
                }
            }

            int result = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (max[i][j] > result) {
                        result = max[i][j];
                    }
                }
            }
            return result;
        }
    }
}
