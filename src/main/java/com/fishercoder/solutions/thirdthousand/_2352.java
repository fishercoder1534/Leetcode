package com.fishercoder.solutions.thirdthousand;

import java.util.*;

public class _2352 {
    public static class Solution1 {
        /** Time: O(n^2) Space: O(n^2) */
        public int equalPairs(int[][] grid) {
            Map<List<Integer>, Integer> rowMap = new HashMap<>();
            for (int i = 0; i < grid.length; i++) {
                List<Integer> rowList = new ArrayList<>();
                for (int j = 0; j < grid[0].length; j++) {
                    rowList.add(grid[i][j]);
                }
                rowMap.put(rowList, rowMap.getOrDefault(rowList, 0) + 1);
            }
            Map<List<Integer>, Integer> columnMap = new HashMap<>();
            for (int j = 0; j < grid[0].length; j++) {
                List<Integer> columnList = new ArrayList<>();
                for (int i = 0; i < grid.length; i++) {
                    columnList.add(grid[i][j]);
                }
                columnMap.put(columnList, columnMap.getOrDefault(columnList, 0) + 1);
            }
            int pairs = 0;
            for (List<Integer> rowList : rowMap.keySet()) {
                if (columnMap.containsKey(rowList)) {
                    pairs += rowMap.get(rowList) * columnMap.get(rowList);
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
