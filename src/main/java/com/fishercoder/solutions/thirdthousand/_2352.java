package com.fishercoder.solutions.thirdthousand;

import java.util.*;

public class _2352 {
    public static class Solution1 {
        /** Time: O(n^2) Space: O(n^2) */
        public int equalPairs(int[][] grid) {
            Map<List<Integer>, Integer> rows = new HashMap<>();
            for (int i = 0; i < grid.length; i++) {
                List<Integer> row = new ArrayList<>();
                for (int j = 0; j < grid[0].length; j++) {
                    row.add(grid[i][j]);
                }
                rows.put(row, rows.getOrDefault(row, 0) + 1);
            }
            Map<List<Integer>, Integer> columns = new HashMap<>();
            for (int j = 0; j < grid[0].length; j++) {
                List<Integer> column = new ArrayList<>();
                for (int i = 0; i < grid.length; i++) {
                    column.add(grid[i][j]);
                }
                columns.put(column, columns.getOrDefault(column, 0) + 1);
            }
            int pairs = 0;
            for (List<Integer> row : rows.keySet()) {
                if (columns.containsKey(row)) {
                    pairs += rows.get(row) * columns.get(row);
                }
            }
            return pairs;
        }
    }

    public static class Solution2 {
        /** Time: O(n^3) Space: O(n^2) */
        public int equalPairs(int[][] grid) {
            int m = grid.length;
            int[][] columns = new int[m][m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    columns[j][i] = grid[i][j];
                }
            }
            int ans = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (Arrays.equals(columns[i], grid[j])) {
                        ans++;
                    }
                }
            }
            return ans;
        }
    }
}
