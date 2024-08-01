package com.fishercoder.solutions.fourththousand;

public class _3000 {
    public static class Solution1 {
        public int areaOfMaxDiagonal(int[][] dimensions) {
            int ans = 0;
            double maxDiagonal = 0.0;
            for (int i = 0; i < dimensions.length; i++) {
                int length = dimensions[i][0];
                int width = dimensions[i][1];
                double diagonal = Math.sqrt(length * length + width * width);
                if (diagonal > maxDiagonal) {
                    maxDiagonal = diagonal;
                    ans = length * width;
                } else if (diagonal == maxDiagonal && length * width > ans) {
                    ans = length * width;
                }
            }
            return ans;
        }
    }
}
