package com.fishercoder.solutions.thirdthousand;

import java.util.Arrays;

public class _2946 {
    public static class Solution1 {
        public boolean areSimilar(int[][] mat, int k) {
            int m = mat.length;
            int n = mat[0].length;
            k %= n;
            if (k == 0) {
                return true;
            }
            int[][] updated = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    // regardless i is even or odd, it's the same formula below!
                    updated[i][(j + k) % n] = mat[i][j];
                }
            }
            for (int i = 0; i < m; i++) {
                if (!Arrays.equals(mat[i], updated[i])) {
                    return false;
                }
            }
            return true;
        }
    }
}
