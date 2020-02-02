package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 1118. Number of Days in a Month
 *
 * Given a year Y and a month M, return how many days there are in that month.
 *
 * Example 1:
 * Input: Y = 1992, M = 7
 * Output: 31
 *
 * Example 2:
 * Input: Y = 2000, M = 2
 * Output: 29
 *
 * Example 3:
 * Input: Y = 1900, M = 2
 * Output: 28
 *
 * Note:
 * 1583 <= Y <= 2100
 * 1 <= M <= 12
 * */
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
