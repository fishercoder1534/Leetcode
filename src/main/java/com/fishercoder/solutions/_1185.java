package com.fishercoder.solutions;

public class _1185 {
    public static class Solution1 {
        /**
         * Time: O(1)
         * Space: O(1)
         * <p>
         * Plain and simple algorithm:
         * based on the fact that 1/1/1971 is a Friday and calculate the given day.
         */
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
