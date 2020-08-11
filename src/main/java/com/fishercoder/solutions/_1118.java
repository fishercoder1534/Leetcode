package com.fishercoder.solutions;

public class _1118 {
    public static class Solution1 {
        public int numberOfDays(int Y, int M) {
            int[] map = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (isLeapYear(Y) && M == 2) {
                return 29;
            } else {
                return map[M];
            }
        }

        private boolean isLeapYear(int year) {
            return year % 4 == 0 && ((year % 100 == 0 && year % 400 == 0) || year % 100 != 0);
        }
    }
}
