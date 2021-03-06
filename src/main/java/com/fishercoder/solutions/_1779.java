package com.fishercoder.solutions;

public class _1779 {
    public static class Solution1 {
        public int nearestValidPoint(int x, int y, int[][] points) {
            int nearestManDistance = Integer.MAX_VALUE;
            int result = -1;
            for (int i = 0; i < points.length; i++) {
                int[] point = points[i];
                if (point[0] == x || point[1] == y) {
                    int distance = Math.abs(point[0] - x) + Math.abs(point[1] - y);
                    if (distance < nearestManDistance) {
                        result = i;
                        nearestManDistance = distance;
                    }
                }
            }
            return result;
        }
    }
}
