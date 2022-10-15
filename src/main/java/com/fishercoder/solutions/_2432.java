package com.fishercoder.solutions;

public class _2432 {
    public static class Solution1 {
        public int hardestWorker(int n, int[][] logs) {
            int startTime = 0;
            int maxDuration = 0;
            int result = 0;
            for (int i = 0; i < logs.length; i++) {
                int duration = logs[i][1] - startTime;
                startTime = logs[i][1];
                if (duration > maxDuration) {
                    result = logs[i][0];
                    maxDuration = duration;
                } else if (duration == maxDuration) {
                    if (logs[i][0] < result) {
                        result = logs[i][0];
                    }
                }
            }
            return result;
        }
    }
}
