package com.fishercoder.solutions;

/**
 * 69. Sqrt(x)
 * Implement int sqrt(int x).
 * Compute and return the square root of x.
 */

public class _69 {
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
