package com.fishercoder.solutions;

import java.util.Arrays;

/**
 *452. Minimum Number of Arrows to Burst Balloons
 *
 * There are a number of spherical balloons spread in two-dimensional space.
 * For each balloon, provided input is the start and end coordinates of the horizontal diameter.
 * Since it's horizontal, y-coordinates don't matter and hence the x-coordinates of start and end of the diameter suffice.
 * Start is always smaller than end. There will be at most 104 balloons.
 *
 * An arrow can be shot up exactly vertically from different points along the x-axis.
 * A balloon with xstart and xend bursts by an arrow shot at x if xstart ≤ x ≤ xend.
 * There is no limit to the number of arrows that can be shot.
 * An arrow once shot keeps travelling up infinitely.
 * The problem is to find the minimum number of arrows that must be shot to burst all balloons.

 Example:

 Input:
 [[10,16], [2,8], [1,6], [7,12]]

 Output:
 2

 Explanation:
 One way is to shoot one arrow for example at x = 6 (bursting the balloons [2,8] and [1,6]) and another arrow at x = 11 (bursting the other two balloons).
 */
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
