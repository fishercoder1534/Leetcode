package com.fishercoder.solutions;

/**
 * 1037. Valid Boomerang
 *
 * A boomerang is a set of 3 points that are all distinct and not in a straight line.
 *
 * Given a list of three points in the plane, return whether these points are a boomerang.
 *
 * Example 1:
 * Input: [[1,1],[2,3],[3,2]]
 * Output: true
 *
 * Example 2:
 * Input: [[1,1],[2,2],[3,3]]
 * Output: false
 *
 * Note:
 * points.length == 3
 * points[i].length == 2
 * 0 <= points[i][j] <= 100
 * */
public class _1037 {
    public static class Solution1 {
        public boolean isBoomerang(int[][] points) {
            return (points[1][1] - points[0][1]) * (points[2][0] - points[0][0]) != (points[2][1] - points[0][1]) * (points[1][0] - points[0][0]);
        }
    }
}
