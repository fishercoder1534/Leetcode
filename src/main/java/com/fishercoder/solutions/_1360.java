package com.fishercoder.solutions;

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
