package com.fishercoder.solutions.secondthousand;

public class _1701 {
    public static class Solution1 {
        /*
         * A simple one-pass, just simulate what the problem describes.
         */
        public double averageWaitingTime(int[][] customers) {
            long totalWaitTime = customers[0][1];
            int chefFinishTime = customers[0][0] + customers[0][1];
            for (int i = 1; i < customers.length; i++) {
                int arrival = customers[i][0];
                int prep = customers[i][1];
                if (chefFinishTime < arrival) {
                    chefFinishTime = arrival;
                }
                chefFinishTime += prep;
                totalWaitTime += chefFinishTime - arrival;
            }
            return (double) totalWaitTime / customers.length;
        }
    }
}
