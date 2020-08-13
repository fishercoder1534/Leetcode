package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _1260 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/shift-2d-grid/discuss/431102/JavaPython-3-simple-code-using-mod
         */
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            int m = grid.length;
            int n = grid[0].length;
            int totalNumbers = m * n;
            int start = totalNumbers - k % totalNumbers;
            LinkedList<List<Integer>> result = new LinkedList<>();
            for (int i = start; i < totalNumbers + start; i++) {
                int moveIndex = i % totalNumbers;
                int moveRow = moveIndex / n;
                int moveColumn = moveIndex % n;
                if ((i - start) % n == 0) {
                    result.add(new ArrayList<>());
                }
                result.peekLast().add(grid[moveRow][moveColumn]);
            }
            return result;
        }
    }
}
