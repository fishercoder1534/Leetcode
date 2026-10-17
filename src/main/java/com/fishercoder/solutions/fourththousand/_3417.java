package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.List;

public class _3417 {
    public static class Solution1 {
        public List<Integer> zigzagTraversal(int[][] grid) {
            List<Integer> list = new ArrayList<>();
            int m = grid.length;
            int n = grid[0].length;
            boolean leftToRight = true;
            int skip = 0;
            for (int i = 0; i < m; i++) {
                if (leftToRight) {
                    for (int j = 0; j < n; j++) {
                        if (skip == 0) {
                            list.add(grid[i][j]);
                            skip++;
                        } else {
                            skip--;
                        }
                    }
                } else {
                    for (int j = n - 1; j >= 0; j--) {
                        if (skip == 0) {
                            list.add(grid[i][j]);
                            skip++;
                        } else {
                            skip--;
                        }
                    }
                }
                leftToRight = !leftToRight;
            }
            return list;
        }
    }
}
