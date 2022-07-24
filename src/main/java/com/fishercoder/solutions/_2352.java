package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2352 {
    public static class Solution1 {
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
}
