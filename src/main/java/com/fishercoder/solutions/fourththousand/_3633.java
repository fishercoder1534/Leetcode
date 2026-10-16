package com.fishercoder.solutions.fourththousand;


public class _3633 {
    public static class Solution1 {
        public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
            int earliest = Integer.MAX_VALUE;

            //Land first
            for (int i = 0; i < landStartTime.length; i++) {
                int landFinish = landStartTime[i] + landDuration[i];
                for (int j = 0; j < waterDuration.length; j++) {
                    int waterStart = Math.max(waterStartTime[j], landFinish);
                    int waterFinish = waterStart + waterDuration[j];
                    earliest = Math.min(earliest, waterFinish);
                }
            }

            //Water first
            for (int i = 0; i < waterStartTime.length; i++) {
                int waterFinish = waterStartTime[i] + waterDuration[i];
                for (int j = 0; j < landDuration.length; j++) {
                    int landStart = Math.max(landStartTime[j], waterFinish);
                    int landFinish = landStart + landDuration[j];
                    earliest = Math.min(earliest, landFinish);
                }
            }
            return earliest;
        }
    }
}
