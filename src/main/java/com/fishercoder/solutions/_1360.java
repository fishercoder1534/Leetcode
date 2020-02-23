package com.fishercoder.solutions;

/**
 * 1360. Number of Days Between Two Dates
 *
 * Write a program to count the number of days between two dates.
 * The two dates are given as strings, their format is YYYY-MM-DD as shown in the examples.
 *
 * Example 1:
 * Input: date1 = "2019-06-29", date2 = "2019-06-30"
 * Output: 1
 *
 * Example 2:
 * Input: date1 = "2020-01-15", date2 = "2019-12-31"
 * Output: 15
 *
 * Constraints:
 * The given dates are valid dates between the years 1971 and 2100.
 * */
public class _1360 {
    public static class Solution1 {
        public int daysBetweenDates(String date1, String date2) {
            String[] strings1 = date1.split("-");
            String[] strings2 = date2.split("-");
            return Math.abs(julianDay(Integer.parseInt(strings1[0]), Integer.parseInt(strings1[1]), Integer.parseInt(strings1[2]))
                    - julianDay(Integer.parseInt(strings2[0]), Integer.parseInt(strings2[1]), Integer.parseInt(strings2[2])));
        }

        public int julianDay(int year, int month, int day) {
            int a = (14 - month) / 12;
            int y = year + 4800 - a;
            int m = month + 12 * a - 3;
            int jdn = day + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;
            return jdn;
        }
    }
}
