package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _1572 {
    public static class Solution1 {
        public int diagonalSum(int[][] mat) {
            int m = mat.length;
            Set<Integer> added = new HashSet<>();
            int sum = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (i == j) {
                        added.add(i * m + j);
                        sum += mat[i][j];
                    }
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = m - 1; j >= 0; j--) {
                    if (i + j == m - 1 && added.add(i * m + j)) {
                        sum += mat[i][j];
                    }
                }
            }
            return sum;
        }
    }
}
