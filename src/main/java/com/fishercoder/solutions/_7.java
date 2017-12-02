package com.fishercoder.solutions;

/**
 * 7. Reverse Integer
 *
 * Reverse digits of an integer.

 Example1: x = 123, return 321

 Example2: x = -123, return -321

 */
public class _7 {

    public static class Solution1 {
        public int reverse(int x) {
            long rev = 0;
            while (x != 0) {
                rev = rev * 10 + x % 10;
                x /= 10;
                if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                    return 0;
                }
            }
            return (int) rev;
        }
    }
}