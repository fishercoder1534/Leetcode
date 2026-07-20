package com.fishercoder.solutions.fourththousand;

public class _3986 {
    public static class Solution1 {
        public int secondsBetweenTimes(String startTime, String endTime) {
            String[] startTimes = startTime.split(":");
            String[] endTimes = endTime.split(":");
            int seconds =
                    60 * 60 * (Integer.parseInt(endTimes[0]) - Integer.parseInt(startTimes[0]));
            seconds += 60 * (Integer.parseInt(endTimes[1]) - Integer.parseInt(startTimes[1]));
            seconds += Integer.parseInt(endTimes[2]) - Integer.parseInt(startTimes[2]);
            return seconds;
        }
    }
}
