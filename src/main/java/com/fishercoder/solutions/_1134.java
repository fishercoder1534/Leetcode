package com.fishercoder.solutions;

/**
 * 1134. Armstrong Number
 *
 * The k-digit number N is an Armstrong number if and only if the k-th power of each digit sums to N.
 * Given a positive integer N, return true if and only if it is an Armstrong number.
 *
 * Example 1:
 * Input: 153
 * Output: true
 * Explanation:
 * 153 is a 3-digit number, and 153 = 1^3 + 5^3 + 3^3.
 *
 * Example 2:
 * Input: 123
 * Output: false
 * Explanation:
 * 123 is a 3-digit number, and 123 != 1^3 + 2^3 + 3^3 = 36.
 *
 * Note:
 * 1 <= N <= 10^8
 * */
public class _1134 {
    public static class Solution1 {
        public boolean isArmstrong(int N) {
            int numOfDigits = 0;
            int copyN = N;
            while (copyN > 0) {
                copyN /= 10;
                numOfDigits++;
            }
            int sum = 0;
            copyN = N;
            while (N > 0) {
                int digit = N % 10;
                sum += Math.pow(digit, numOfDigits);
                N /= 10;
            }
            return sum == copyN;
        }
    }
}
