package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _2133 {
    public static class Solution1 {
        public boolean checkValid(int[][] matrix) {
            int n = matrix.length;
            Set<Integer> set = new HashSet<>();
            for (int i = 1; i <= n; i++) {
                set.add(i);
            }
            for (int i = 0; i < n; i++) {
                Set<Integer> copy = new HashSet<>(set);
                for (int j = 0; j < n; j++) {
                    if (!copy.remove(matrix[i][j])) {
                        return false;
                    }
                }
            }
            for (int j = 0; j < n; j++) {
                Set<Integer> copy = new HashSet<>(set);
                for (int i = 0; i < n; i++) {
                    if (!copy.remove(matrix[i][j])) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
