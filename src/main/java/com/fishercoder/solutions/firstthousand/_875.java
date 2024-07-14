package com.fishercoder.solutions.firstthousand;

public class _875 {
    public static class Solution1 {
        public int minEatingSpeed(int[] piles, int h) {
            long left = Long.MAX_VALUE;
            long right = Long.MIN_VALUE;
            for (int pile : piles) {
                left = Math.min(left, pile);
                right = Math.max(right, pile);
            }
            left /= h;
            while (left + 1 < right) {
                long mid = left + (right - left) / 2;
                if (possibleSpeed((int) mid, piles, h)) {
                    right = mid;
                } else {
                    left = mid;
                }
            }
            return possibleSpeed((int) left, piles, h) ? (int) left : (int) (left + 1);
        }

        private boolean possibleSpeed(int speed, int[] piles, int hour) {
            if (speed <= 0) {
                return false;
            }
            long usedHours = 0;
            for (int pile : piles) {
                if (pile <= speed) {
                    usedHours++;
                } else {
                    usedHours += pile / speed;
                    pile %= speed;
                    usedHours += pile > 0 ? 1 : 0;
                }
            }
            return usedHours <= hour;
        }
    }
}
