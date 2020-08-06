package com.fishercoder.solutions;

public class _1037 {
    public static class Solution1 {
        public boolean isBoomerang(int[][] points) {
            return (points[1][1] - points[0][1]) * (points[2][0] - points[0][0]) != (points[2][1] - points[0][1]) * (points[1][0] - points[0][0]);
        }
    }
}
