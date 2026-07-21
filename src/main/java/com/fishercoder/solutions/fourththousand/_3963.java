package com.fishercoder.solutions.fourththousand;

public class _3963 {
    public static class Solution1 {
        public String[] createGrid(int m, int n) {
            String[] grid = new String[m];
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                builder.append('.');
            }
            grid[0] = builder.toString();
            for (int i = 1; i < m; i++) {
                builder.setLength(0);
                for (int j = 0; j < n - 1; j++) {
                    builder.append('#');
                }
                builder.append('.');
                grid[i] = builder.toString();
            }
            return grid;
        }
    }
}
