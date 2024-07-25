package com.fishercoder.solutions.thirdthousand;

public class _2651 {
    public static class Solution1 {
        public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
            return (arrivalTime + delayedTime) % 24;
        }
    }
}
