package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _296 {
    public static class Solution1 {
        /**
         * Credit: https://leetcode.com/problems/best-meeting-point/solution/ Approach 3
         */
        public int minTotalDistance(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            List<Integer> rows = new ArrayList<>();
            List<Integer> cols = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        rows.add(i);
                        cols.add(j);
                    }
                }
            }
            int rowMedian = rows.get(rows.size() / 2);
            Collections.sort(cols);
            int colMedian = cols.get(cols.size() / 2);
            return minDistance1D(rows, rowMedian) + minDistance1D(cols, colMedian);
        }

        private int minDistance1D(List<Integer> points, int median) {
            int distance = 0;
            for (int i : points) {
                distance += Math.abs(i - median);
            }
            return distance;
        }

    }
}
