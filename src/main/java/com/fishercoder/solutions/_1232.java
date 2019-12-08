package com.fishercoder.solutions;

/**
 * 1232. Check If It Is a Straight Line
 *
 * You are given an array coordinates, coordinates[i] = [x, y],
 * where [x, y] represents the coordinate of a point.
 * Check if these points make a straight line in the XY plane.
 *
 * Example 1:
 * Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 * Output: true
 *
 * Example 2:
 * Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
 * Output: false
 *
 * Constraints:
 * 2 <= coordinates.length <= 1000
 * coordinates[i].length == 2
 * -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
 * coordinates contains no duplicate point.
 * */
public class _1232 {
    public static class Solution1 {
        /**
         * To check if they share the same slope, we use this formula:
         *
         * check whether (y4 - y3)/(x4- x3) equals to (y2 - y1)/(x2 - x1)
         * considering denominator could be zero, we'll change it to use multiplication instead of division,
         * thus it becomes
         * check whether (y4 - y3)*(x2 - x1) equals (x4 - x3)*(y2 - y1)
         * */
        public boolean checkStraightLine(int[][] coordinates) {
            for (int i = 2; i < coordinates.length - 1; i++) {
                if ((coordinates[1][0] - coordinates[0][0]) * (coordinates[i + 1][1] - coordinates[i][1])
                        != (coordinates[1][1] - coordinates[0][1]) * (coordinates[i + 1][0] - coordinates[i][0])) {
                    return false;
                }
            }
            return true;
        }
    }
}
