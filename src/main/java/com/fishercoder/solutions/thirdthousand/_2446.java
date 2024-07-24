package com.fishercoder.solutions.thirdthousand;

public class _2446 {
    public static class Solution1 {
        public boolean haveConflict(String[] event1, String[] event2) {
            int startMinute1 = getAbsoluteMinute(event1[0]);
            int endMinute1 = getAbsoluteMinute(event1[1]);
            int startMinute2 = getAbsoluteMinute(event2[0]);
            int endMinute2 = getAbsoluteMinute(event2[1]);
            for (int h = 0; h <= 23; h++) {
                for (int m = 0; m <= 59; m++) {
                    int currentTime = h * 60 + m;
                    if (inTime(currentTime, startMinute1, endMinute1) && inTime(currentTime, startMinute2, endMinute2)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean inTime(int currentMinute, int startMinute, int endMinute) {
            if (currentMinute >= startMinute && currentMinute <= endMinute) {
                return true;
            }
            return false;
        }

        private int getAbsoluteMinute(String eventStart) {
            String[] startParts = eventStart.split(":");
            String startHour = startParts[0];
            String startMinute = startParts[1];
            int startHourInt = Integer.parseInt(startHour);
            int startMinuteInt = Integer.parseInt(startMinute);
            return startHourInt * 60 + startMinuteInt;
        }
    }
}
