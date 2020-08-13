package com.fishercoder.solutions;

public class _1266 {
    public static class Solution1 {
        /**
         * Time: O(n)
         * Space: O(1)
         * <p>
         * credit: https://leetcode.com/problems/minimum-time-visiting-all-points/discuss/436142/Sum-of-Chebyshev-distance-between-two-consecutive-points
         */
        public int minTimeToVisitAllPoints(int[][] points) {
            int minTime = 0;
            for (int i = 0; i < points.length - 1; i++) {
                minTime += chebyshevDistance(points[i], points[i + 1]);
            }
            return minTime;
        }

        private int chebyshevDistance(int[] pointA, int[] pointB) {
            return Math.max(Math.abs(pointA[0] - pointB[0]), Math.abs(pointA[1] - pointB[1]));
        }
    }
}
