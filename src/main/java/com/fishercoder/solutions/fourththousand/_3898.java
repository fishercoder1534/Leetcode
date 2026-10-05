package com.fishercoder.solutions.fourththousand;

public class _3898 {
    public static class Solution1 {
        public int[] findDegrees(int[][] matrix) {
            int[] ans = new int[matrix.length];
            for (int i = 0; i < matrix.length; i++){
                for (int j = 0; j < matrix[0].length; j++){
                    ans[i] += matrix[i][j];
                }
            }
            return ans;
        }
    }
}
