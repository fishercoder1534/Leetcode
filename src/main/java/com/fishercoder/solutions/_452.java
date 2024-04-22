package com.fishercoder.solutions;

import java.util.Arrays;

public class _452 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/66579/java-greedy-soution/6
         */
        public int findMinArrowShots(int[][] points) {
            if (points == null || points.length == 0) {
                return 0;
            }
            // sort points based on their end point.
            Arrays.sort(points, (p1, p2) -> Integer.compare(p1[1], p2[1]));
            int currentEnd = points[0][1];
            int count = 1;
            for (int[] p : points) {
                // if the point starts after currentEnd, it means this balloons not been burst.
                // Then we shot the balloon in its end point. Otherwise, means this balloon has been burst, then ignore it.
                if (p[0] > currentEnd) {
                    count++;
                    currentEnd = p[1];
                } else {
                    continue;
                }
            }
            return count;
        }
    }

    public static class Solution2 {
        /**
         * I'm glad to have come up with this solution on my own on 10/13/2021:
         * we'll have to sort the balloons by its ending points, a counter case to this is below:
         * {{0, 6}, {0, 9}, {7, 8}}
         * if we sort by starting points, then it becomes: {0, 6}, {0, 9}, {7, 8}, this way, if we shoot 9, {0, 6} won't be burst
         * however, if we sort by ending points, then it becomes: {0, 6}, {7, 8}, {0, 9},
         * then we shoot at 6, then at 8, this gives us the result of bursting all balloons.
         */
        public int findMinArrowShots(int[][] points) {
            Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
            int minArrows = 1;
            long end = points[0][1];
            for (int i = 1; i < points.length; i++) {
                if (points[i][0] <= end) {
                    continue;
                } else {
                    minArrows++;
                    end = points[i][1];
                }
            }
            return minArrows;
        }
    }

    public static class Solution3 {
        /**
         * Another approach of mine: completely original.
         * 1. Sort the points by start first, if tie, sort by end, both ascendingly.
         * 2. While checking, we'll keep updating the ending to be the smaller one so that we don't possibly miss to burst a balloon. See test case 4 for this class.
         */

        public int findMinArrowShots(int[][] points) {
            int arrowShots = 0;
            Arrays.sort(points, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
            for (int i = 0; i < points.length; ) {
                int end = points[i][1];
                int j = i + 1;
                for (; j < points.length; j++) {
                    if (points[j][0] <= end) {
                        end = Math.min(end, points[j][1]);
                    } else {
                        break;
                    }
                }
                i = j;
                arrowShots++;
            }
            return arrowShots;
        }
    }
}
