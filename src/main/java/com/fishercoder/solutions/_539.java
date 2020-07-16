package com.fishercoder.solutions;

import java.util.List;

public class _539 {

    public static class Soluiton1 {

        public int findMinDifference(List<String> timePoints) {
            /**there are in total 24*60 = 1440 possible time points*/
            final int ALL_POSSIBLE_TIMEPOINTS = 1440;
            boolean[] allTimePoints = new boolean[ALL_POSSIBLE_TIMEPOINTS];
            for (String eachTime : timePoints) {
                String[] timeParts = eachTime.split(":");
                int hour = Integer.valueOf(timeParts[0]);
                int minute = Integer.valueOf(timeParts[1]);
                int value = hour * 60 + minute;
                if (allTimePoints[value]) {
                    return 0;
                }
                allTimePoints[value] = true;
            }

            int min = Integer.MAX_VALUE;
            int prev = 0;
            int first = Integer.MAX_VALUE;
            int last = Integer.MIN_VALUE;
            for (int i = 0; i < ALL_POSSIBLE_TIMEPOINTS; i++) {
                if (allTimePoints[i]) {
                    if (first != Integer.MAX_VALUE) {
                        min = Math.min(min, i - prev);
                    }
                    first = Math.min(first, i);
                    last = Math.max(last, i);
                    prev = i;
                }
            }
            min = Math.min(min, (ALL_POSSIBLE_TIMEPOINTS - last + first));
            return min;
        }
    }

}
