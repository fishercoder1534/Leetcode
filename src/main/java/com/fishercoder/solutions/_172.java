package com.fishercoder.solutions;

/**
 * 172. Factorial Trailing Zeroes
 *
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * Example 1:
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 *
 * Example 2:
 * Input: 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 * Note: Your solution should be in logarithmic time complexity.
 */
public class _172 {

    public static class Solution1 {
        public int trailingZeroes(int n) {
            int result = 0;
            while (n > 4) {
                n /= 5;
                result += n;
            }
            return result;
        }
    }
}
