package com.fishercoder.solutions;

public class _1011 {
    public static class Solution1 {
        public int daysToShip(int[] weights, int capacity) {
            int days = 0;
            int currentShip = 0;

            for (int k : weights) {
                if (currentShip + k > capacity) {
                    currentShip = 0;
                    days += 1;
                }
                currentShip += k;
            }

            return days + 1;
        }

        public int shipWithinDays(int[] weights, int D) {

            int sum = 0;
            int max = 0;

            for (int k : weights) {
                sum += k;
                max = Math.max(max, k);
            }

            // Minimum possible capacity needs to be as much as the heaviest package
            int lower = max;
            // Maximum possible capacity is the total weight of all packages
            int upper = sum;

            if (daysToShip(weights, lower) <= D) {
                return lower;
            }

            // Guess is for capacity
            int currentGuess;
            int bestGuess = -1;

            // Binary search
            while (lower <= upper) {
                currentGuess = (upper + lower) / 2;
                if (daysToShip(weights, currentGuess) <= D) {
                    bestGuess = currentGuess;
                    upper = currentGuess - 1;
                } else {
                    lower = currentGuess + 1;
                }
            }

            return bestGuess;
        }
    }
}
