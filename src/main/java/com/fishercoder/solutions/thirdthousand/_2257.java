package com.fishercoder.solutions.thirdthousand;

public class _2257 {
    public static class Solution1 {
        public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
            char[][] grid = new char[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = 'i'; // just to initialize each cell
                }
            }
            for (int i = 0; i < guards.length; i++) {
                grid[guards[i][0]][guards[i][1]] = 'G';
            }
            for (int i = 0; i < walls.length; i++) {
                grid[walls[i][0]][walls[i][1]] = 'W';
            }
            //now traverse the grid, whenever we encounter 'G', mark all of its four directions to be 'G'
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 'G') {
                        markGuarded(grid, i, j, m, n);
                    }
                }
            }
            int ans = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 'i') {
                        ans++;
                    }
                }
            }
            return ans;
        }

        private void markGuarded(char[][] grid, int i, int j, int m, int n) {
            //go north
            for (int x = i - 1; x >= 0; x--) {
                if (grid[x][j] == 'i') {
                    grid[x][j] = 'm'; // use a different letter to mark it as guarded, you cannot use 'G' to mark this one, otherwise, you are basically adding way more guards along the way!
                } else if (grid[x][j] == 'W' || grid[x][j] == 'G') {
                    break;
                }
            }

            //go south
            for (int x = i + 1; x < m; x++) {
                if (grid[x][j] == 'i') {
                    grid[x][j] = 'm';
                } else if (grid[x][j] == 'W' || grid[x][j] == 'G') {
                    break;
                }
            }

            //go west
            for (int y = j - 1; y >= 0; y--) {
                if (grid[i][y] == 'i') {
                    grid[i][y] = 'm';
                } else if (grid[i][y] == 'W' || grid[i][y] == 'G') {
                    break;
                }
            }

            //go east
            for (int y = j + 1; y < n; y++) {
                if (grid[i][y] == 'i') {
                    grid[i][y] = 'm';
                } else if (grid[i][y] == 'W' || grid[i][y] == 'G') {
                    break;
                }
            }
        }

    }
}
