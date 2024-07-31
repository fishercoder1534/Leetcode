package com.fishercoder.solutions.thirdthousand;

import java.util.HashSet;
import java.util.Set;

public class _2923 {
    public static class Solution1 {
        public int findChampion(int[][] grid) {
            int n = grid.length;
            Set<Integer> beat = new HashSet<>();
            int champion = -1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j && grid[i][j] == 1) {
                        if (beat.add(j)) {
                            champion = i;
                        }
                    }
                }
            }
            return champion;
        }
    }
}
