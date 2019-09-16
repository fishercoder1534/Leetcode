package com.fishercoder.solutions;

import java.util.stream.IntStream;

/**
 * 1137. N-th Tribonacci Number
 *
 * The Tribonacci sequence Tn is defined as follows:
 *
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 *
 * Given n, return the value of Tn.
 *
 * Example 1:
 * Input: n = 4
 * Output: 4
 *
 * Explanation:
 * T_3 = 0 + 1 + 1 = 2
 * T_4 = 1 + 1 + 2 = 4
 *
 * Example 2:
 * Input: n = 25
 * Output: 1389537
 *
 * Constraints:
 * 0 <= n <= 37
 * The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.
 * */
public class _1137 {
    public static class Solution1 {
        public int tribonacci(int n) {
            if (n <= 1) {
                return n;
            }
            int[] numbers = new int[n + 1];
            numbers[0] = 0;
            numbers[1] = 1;
            numbers[2] = 1;
            IntStream.rangeClosed(3, n).forEach(i -> numbers[i] = numbers[i - 1] + numbers[i - 2] + numbers[i - 3]);
            return numbers[n];
        }
    }
}
