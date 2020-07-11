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
                // if the point starts after currentEnd, it means this balloons not been bursted. Then we shot the balloon in its end point. Otherwise, means this balloon has been bursted, then ignore it.
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
}
