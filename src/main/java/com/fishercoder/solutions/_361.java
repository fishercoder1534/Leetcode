package com.fishercoder.solutions;

/**
 * 361. Bomb Enemy
 *
 * Given a 2D grid, each cell is either a wall 'W', an enemy 'E' or empty '0' (the number zero), return the maximum enemies you can kill using one bomb.
 The bomb kills all the enemies in the same row and column from the planted point until it hits the wall since the wall is too strong to be destroyed.
 Note that you can only put the bomb at an empty cell.

 Example:
 For the given grid

 0 E 0 0
 E 0 W E
 0 E 0 0

 return 3. (Placing a bomb at (1,1) kills 3 enemies)
 */
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
