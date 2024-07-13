package com.fishercoder.solutions.thirdthousand;

import java.util.HashSet;
import java.util.Set;

public class _2965 {
    public static class Solution1 {
        public int[] findMissingAndRepeatedValues(int[][] grid) {
            Set<Integer> set = new HashSet<>();
            int[] result = new int[2];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (!set.add(grid[i][j])) {
                        result[0] = grid[i][j];
                    }
                }
            }
            for (int i = 1; i <= grid.length * grid.length; i++) {
                if (!set.contains(i)) {
                    result[1] = i;
                }
            }
            return result;
        }
    }
}
