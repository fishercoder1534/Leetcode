package com.fishercoder.solutions;

/**
 * Implement int sqrt(int x).

 Compute and return the square root of x.

 * Created by fishercoder on 1/25/17.
 */
public class _69 {
    public int mySqrt(int x) {
        long i = 0, j = x / 2 + 1;
        while (i <= j) {
            long mid = (i + j) / 2;
            long result = mid * mid;
            if (result == (long) x) {
                return (int) mid;
            } else if (result > x) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
            System.out.println(mid + " * " + mid + " = " + result + "\ti = " + i + "\tj = " + j);
        }
        return (int) j;
    }
}
