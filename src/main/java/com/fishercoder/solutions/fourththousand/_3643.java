package com.fishercoder.solutions.fourththousand;

public class _3643 {
    public static class Solution1 {
        public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
            int top = x;
            int bottom = x + k - 1;
            int rightBoundary = y + k - 1;
            while (top < bottom) {
                int left = y;
                while (left <= rightBoundary) {
                    int temp = grid[top][left];
                    grid[top][left] = grid[bottom][left];
                    grid[bottom][left] = temp;
                    left++;
                }
                top++;
                bottom--;
            }
            return grid;
        }
    }
}
