package com.fishercoder.solutions;

/**
 * 264. Ugly Number II
 *
 * Write a program to find the n-th ugly number.

 Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.

 Note that 1 is typically treated as an ugly number, and n does not exceed 1690.
 */
public class _264 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/21791/o-n-java-solution
         */
        public int nthUglyNumber(int n) {
            int[] ugly = new int[n];
            ugly[0] = 1;
            int index2 = 0;
            int index3 = 0;
            int index5 = 0;
            int factor2 = 2;
            int factor3 = 3;
            int factor5 = 5;
            for (int i = 1; i < n; i++) {
                int min = Math.min(Math.min(factor2, factor3), factor5);
                ugly[i] = min;
                if (factor2 == min) {
                    factor2 = 2 * ugly[++index2];
                }
                if (factor3 == min) {
                    factor3 = 3 * ugly[++index3];
                }
                if (factor5 == min) {
                    factor5 = 5 * ugly[++index5];
                }
            }
            return ugly[n - 1];
        }
    }
}
