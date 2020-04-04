package com.fishercoder.solutions;

/**
 * 1401. Circle and Rectangle Overlapping
 *
 * Given a circle represented as (radius, x_center, y_center) and an axis-aligned rectangle represented as (x1, y1, x2, y2), where (x1, y1) are the coordinates of the bottom-left corner, and (x2, y2) are the coordinates of the top-right corner of the rectangle.
 * Return True if the circle and rectangle are overlapped otherwise return False.
 * In other words, check if there are any point (xi, yi) such that belongs to the circle and the rectangle at the same time.
 *
 * Example 1:
 * Input: radius = 1, x_center = 0, y_center = 0, x1 = 1, y1 = -1, x2 = 3, y2 = 1
 * Output: true
 * Explanation: Circle and rectangle share the point (1,0)
 *
 * Example 2:
 * Input: radius = 1, x_center = 0, y_center = 0, x1 = -1, y1 = 0, x2 = 0, y2 = 1
 * Output: true
 *
 * Example 3:
 * Input: radius = 1, x_center = 1, y_center = 1, x1 = -3, y1 = -3, x2 = 3, y2 = 3
 * Output: true
 *
 * Example 4:
 * Input: radius = 1, x_center = 1, y_center = 1, x1 = 1, y1 = -3, x2 = 2, y2 = -1
 * Output: false
 *
 * Constraints:
 * 1 <= radius <= 2000
 * -10^4 <= x_center, y_center, x1, y1, x2, y2 <= 10^4
 * x1 < x2
 * y1 < y2
 * */
public class _1401 {
    public static class Solution1 {
        public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
            if (x1 <= xCenter && x2 >= xCenter && y1 <= yCenter && y2 >= yCenter) {
                return true;
            }
            int circleDistance = radius * radius;
            for (int x = x1; x <= x2; x++) {
                if (dist(x, y1, xCenter, yCenter) <= circleDistance) {
                    return true;
                }
            }

            for (int x = x1; x <= x2; x++) {
                if (dist(x, y2, xCenter, yCenter) <= circleDistance) {
                    return true;
                }
            }

            for (int y = y1; y <= y2; y++) {
                if (dist(x1, y, xCenter, yCenter) <= circleDistance) {
                    return true;
                }
            }

            for (int y = y1; y <= y2; y++) {
                if (dist(x2, y, xCenter, yCenter) <= circleDistance) {
                    return true;
                }
            }
            return false;
        }

        private int dist(int x1, int y1, int x2, int y2) {
            return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        }
    }
}
