package com.fishercoder.solutions;

public class _478 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/generate-random-point-in-a-circle/discuss/154037/Polar-Coordinates-10-lines
         * and
         * https://leetcode.com/problems/generate-random-point-in-a-circle/discuss/155650/Explanation-with-Graphs-why-using-Math.sqrt()
         */
        double radius;
        double xCenter;
        double yCenter;

        public Solution1(double radius, double xCenter, double yCenter) {
            this.radius = radius;
            this.xCenter = xCenter;
            this.yCenter = yCenter;
        }

        public double[] randPoint() {
            double len = Math.sqrt(Math.random()) * radius;
            double degree = Math.random() * 2 * Math.PI;
            double x = xCenter + len * Math.cos(degree);
            double y = yCenter + len * Math.sin(degree);
            return new double[]{x, y};
        }
    }

    public static class Solution2 {
        /**
         * How to know one point is within a circle:
         * https://www.geeksforgeeks.org/find-if-a-point-lies-inside-or-on-circle/
         */
        double top;
        double bottom;
        double left;
        double right;
        double rad;
        double xCenter;
        double yCenter;

        public Solution2(double radius, double xCenter, double yCenter) {
            this.rad = radius;
            this.top = yCenter + radius;
            this.bottom = yCenter - radius;
            this.left = xCenter - radius;
            this.right = xCenter + radius;
            this.xCenter = xCenter;
            this.yCenter = yCenter;
        }

        public double[] randPoint() {
            double[] result = new double[2];
            result[0] = (Math.random() * (right - left)) + left;
            result[1] = (Math.random() * (top - bottom)) + bottom;
            while (Math.pow(result[0] - xCenter, 2.0) + Math.pow(result[1] - yCenter, 2.0) > Math.pow(rad, 2.0)) {
                result[0] = (Math.random() * (right - left)) + left;
                result[1] = (Math.random() * (top - bottom)) + bottom;
            }
            return result;
        }
    }
}
