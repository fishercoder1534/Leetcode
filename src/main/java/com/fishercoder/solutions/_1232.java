package com.fishercoder.solutions;
/**
 * 1232. Check if it is a Straight Line
 *
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
 * Check if these points make a straight line in the XY plane.
 * Example 1:
 * Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 * Output: true
 * Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
 *
 * Example 2:
 * Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
 * Output: false
 *
 *
 * Constraints:
 * 2 <= coordinates.length <= 1000
 * coordinates[i].length == 2
 * -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
 * coordinates contains no duplicate point.
 * */
public class _1232 {
    class Solution {
        public boolean checkStraightLine(int[][] coordinates) {
            int x0 = coordinates[0][0];
            int y0 = coordinates[0][1];
            int x1 = coordinates[1][0];
            int y1 = coordinates[1][1];
            int dx = x1 - x0, dy = y1 - y0;
            for (int[] co : coordinates) {
                int x = co[0], y = co[1];
                if (dx * (y - y1) != dy * (x - x1))
                    return false;
            }
            return true;
        }
    }
}