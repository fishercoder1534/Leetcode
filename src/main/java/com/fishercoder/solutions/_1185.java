package com.fishercoder.solutions;

/**
 * 1185. Day of the Week
 *
 * Given a date, return the corresponding day of the week for that date.
 * The input is given as three integers representing the day, month and year respectively.
 * Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.
 *
 * Example 1:
 * Input: day = 31, month = 8, year = 2019
 * Output: "Saturday"
 *
 * Example 2:
 * Input: day = 18, month = 7, year = 1999
 * Output: "Sunday"
 *
 * Example 3:
 * Input: day = 15, month = 8, year = 1993
 * Output: "Sunday"
 *
 * Constraints:
 * The given dates are valid dates between the years 1971 and 2100.
 * */
public class _1185 {
    public static class Solution1 {
        /**
         * Time: O(1)
         * Space: O(1)
         *
         * Plain and simple algorithm:
         * based on the fact that 1/1/1971 is a Friday and calculate the given day.
         * */
        public String dayOfTheWeek(int day, int month, int year) {
            String[] daysInTheWeek = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            int[] daysInTheMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int numberOfDays = 0;
            for (int i = 1971; i < year; i++) {
                numberOfDays += i % 4 == 0 ? 366 : 365;
            }
            if (year % 4 == 0) {
                daysInTheMonth[1] = 29;
            }
            for (int i = 0; i < month - 1; i++) {
                numberOfDays += daysInTheMonth[i];
            }
            numberOfDays += day - 1;
            return daysInTheWeek[(numberOfDays + 5) % 7];
        }
    }
}
