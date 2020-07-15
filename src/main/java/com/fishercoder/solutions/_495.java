package com.fishercoder.solutions;

public class _495 {

    public static class Solution1 {
        public int findPoisonedDuration(int[] timeSeries, int duration) {
            if (timeSeries == null || timeSeries.length == 0 || duration == 0) {
                return 0;
            }
            int totalDuration = 0;
            for (int i = 0; i < timeSeries.length - 1; i++) {
                if ((timeSeries[i + 1] - timeSeries[i]) >= duration) {
                    totalDuration += duration;
                } else {
                    totalDuration += (timeSeries[i + 1] - timeSeries[i]);
                }
            }
            totalDuration += duration;//plus the last one duration
            return totalDuration;
        }
    }

}
