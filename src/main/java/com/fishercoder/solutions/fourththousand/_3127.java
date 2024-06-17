package com.fishercoder.solutions.fourththousand;

public class _3127 {
    public static class Solution1 {
        public boolean canMakeSquare(char[][] grid) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (isPossible(grid, i, j, 'B') || isPossible(grid, i, j, 'W')) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean isPossible(char[][] grid, int startI, int startJ, char color) {
            int count = 0;
            for (int i = startI; i < startI + 2; i++) {
                for (int j = startJ; j < startJ + 2; j++) {
                    if (grid[i][j] == color) {
                        count++;
                    }
                }
            }
            return count >= 3;
        }
    }
}
