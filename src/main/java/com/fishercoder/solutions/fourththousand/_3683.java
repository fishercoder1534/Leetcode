package com.fishercoder.solutions.fourththousand;

public class _3683 {
    public static class Solution1 {
        public int earliestTime(int[][] tasks) {
            int earliestTime = Integer.MAX_VALUE;
            for (int[] task : tasks) {
                earliestTime = Math.min(earliestTime, task[0] + task[1]);
            }
            return earliestTime;
        }
    }
}
