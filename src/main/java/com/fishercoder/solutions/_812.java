package com.fishercoder.solutions;

public class _812 {
    public static class Solution1 {
        /**
         * reference: https://www.mathopenref.com/coordtrianglearea.html
         */
        public double largestTriangleArea(int[][] points) {
            double largestArea = 0.0;
            for (int i = 0; i < points.length - 2; i++) {
                for (int j = i + 1; j < points.length - 1; j++) {
                    for (int k = j + 1; k < points.length; k++) {
                        double area = Math.abs(points[i][0] * (points[j][1] - points[k][1]) + points[j][0] * (points[k][1] - points[i][1]) + points[k][0] * (points[i][1] - points[j][1])) / 2.0;
                        largestArea = Math.max(largestArea, area);

                    }
                }
            }
            return largestArea;
        }
    }
}
