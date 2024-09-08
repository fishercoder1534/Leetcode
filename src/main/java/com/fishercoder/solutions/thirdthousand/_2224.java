package com.fishercoder.solutions.thirdthousand;

public class _2224 {
    public static class Solution1 {
        public int convertTime(String current, String correct) {
            if (current.equals(correct)) {
                return 0;
            }
            int ops = 0;
            String[] startHourAndMinute = current.split(":");
            int start =
                    60 * Integer.parseInt(startHourAndMinute[0])
                            + Integer.parseInt(startHourAndMinute[1]);
            String[] endHourAndMinute = correct.split(":");
            int end =
                    60 * Integer.parseInt(endHourAndMinute[0])
                            + Integer.parseInt(endHourAndMinute[1]);
            int[] addons = new int[] {1, 5, 15, 60};
            int index = 3;
            while (start < end) {
                if (start + addons[index] == end) {
                    return ops + 1;
                } else if (start + addons[index] < end) {
                    start += addons[index];
                    ops++;
                } else {
                    index--;
                }
            }
            return ops;
        }
    }
}
