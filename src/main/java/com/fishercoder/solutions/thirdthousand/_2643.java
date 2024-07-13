package com.fishercoder.solutions.thirdthousand;

public class _2643 {
    public static class Solution1 {
        public int[] rowAndMaximumOnes(int[][] mat) {
            int maxOnes = 0;
            int[] result = new int[2];
            for (int i = 0; i < mat.length; i++) {
                int count = 0;
                for (int j = 0; j < mat[0].length; j++) {
                    count += mat[i][j];
                }
                if (count > maxOnes) {
                    result[0] = i;
                    result[1] = count;
                    maxOnes = count;
                }
            }
            return result;
        }
    }
}
