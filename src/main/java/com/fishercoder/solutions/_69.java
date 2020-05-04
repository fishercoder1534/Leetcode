package com.fishercoder.solutions;

public class _69 {
    public static class Solution1 {
        /**
         * A few key points:
         * 1. all variable use long type, otherwise overflow, just cast to int before returning
         * 2. left start from 0, not 1
         * 3. right start from x/2 + 1, not from x
         */
        public int mySqrt(int x) {
            long left = 0;
            long right = x / 2 + 1;
            while (left <= right) {
                long mid = left + (right - left) / 2;
                long result = mid * mid;
                if (result == (long) x) {
                    return (int) mid;
                } else if (result > x) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return (int) right;
        }
    }
}
