package com.fishercoder.solutions.fifththousand;

import java.util.HashSet;
import java.util.Set;

public class _4084 {
    public static class Solution1 {
        public int[] lastVisitedCell(char[][] grid) {
            Set<Integer> visited = new HashSet<>();
            int n = grid.length > 0 ? grid[0].length : 0;
            int row = 0;
            int col = 0;
            int lastRow = 0;
            int lastCol = 0;
            while (!visited.contains(row * n + col)) {
                char nextMove = grid[row][col];
                visited.add(row * n + col);
                lastRow = row;
                lastCol = col;
                if (nextMove == 'R') {
                    col++;
                } else if (nextMove == 'L') {
                    col--;
                } else if (nextMove == 'U') {
                    row--;
                } else {
                    row++;
                }
                if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) {
                    break;
                }
            }
            return new int[]{lastRow, lastCol};
        }
    }
}
