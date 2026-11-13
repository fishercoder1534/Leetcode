package com.fishercoder.solutions.thirdthousand;

public class _2383 {
    public static class Solution1 {
        /**
         * My completely original solution.
         */
        public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
            int minHoursNeeded = 0;
            for (int i = 0; i < energy.length; i++) {
                initialEnergy -= energy[i];
            }
            minHoursNeeded += Math.max(0, -initialEnergy + 1);
            for (int i = 0; i < experience.length; i++) {
                if (initialExperience <= experience[i]) {
                    int delta = experience[i] - initialExperience + 1;
                    minHoursNeeded += delta;
                    initialExperience += delta;
                    i--; // this line is critical to bring it back by one step to re-measure! I'm so glad that I figured this out completely on my own!
                } else {
                    initialExperience += experience[i];
                }
            }
            return minHoursNeeded;
        }
    }
}
