package com.fishercoder.solutions;

public class _1232 {
    public static class Solution1 {
        /**
         * To check if they share the same slope, we use this formula:
         * <p>
         * check whether (y4 - y3)/(x4- x3) equals to (y2 - y1)/(x2 - x1)
         * considering denominator could be zero, we'll change it to use multiplication instead of division,
         * thus it becomes
         * check whether (y4 - y3)*(x2 - x1) equals (x4 - x3)*(y2 - y1)
         */
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
