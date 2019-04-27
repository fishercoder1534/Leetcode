package com.fishercoder.solutions;

/**
 * 1011. Capacity To Ship Packages Within D Days
 *
 * A conveyor belt has packages that must be shipped from one port to another within D days.
 *
 * The i-th package on the conveyor belt has a weight of weights[i].
 * Each day, we load the ship with packages on the conveyor belt (in the order given by weights).
 * We may not load more weight than the maximum weight capacity of the ship.
 *
 * Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within D days.
 *
 * Note:
 *  * 1 <= D <= weights.length <= 50000
 *  * 1 <= weights[i] <= 500
 */

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
