package com.fishercoder.solutions.thirdthousand;

public class _2739 {
    public static class Solution1 {
        public int distanceTraveled(int mainTank, int additionalTank) {
            int distance = 0;
            while (mainTank >= 5) {
                distance += 5 * 10;
                mainTank -= 5;
                if (additionalTank > 0) {
                    mainTank++;
                    additionalTank--;
                }
            }
            if (mainTank > 0) {
                distance += 10 * mainTank;
            }
            return distance;
        }
    }
}
