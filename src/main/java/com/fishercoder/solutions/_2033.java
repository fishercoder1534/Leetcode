package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2033 {
    public static class Solution1 {
        public int minOperations(int[][] grid, int x) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    list.add(grid[i][j]);
                }
            }
            if (list.size() <= 1) {
                return 0;
            }
            Collections.sort(list);
            int median = list.get(list.size() / 2);
            int ops = 0;
            for (int i = 0; i < list.size(); i++) {
                int diff = Math.abs(list.get(i) - median);
                if (diff % x != 0) {
                    return -1;
                }
                ops += diff;
            }
            return ops / x;
        }
    }
}
