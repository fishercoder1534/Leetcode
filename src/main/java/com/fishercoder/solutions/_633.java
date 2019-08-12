package com.fishercoder.solutions;

/**
 * 633. Sum of Square Numbers
 *
 * Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.

 Example 1:
 Input: 5
 Output: True
 Explanation: 1 * 1 + 2 * 2 = 5

 Example 2:
 Input: 3
 Output: False
 */
public class _633 {
    public static class Solution1 {
        public boolean judgeSquareSum(int c) {
            if (c < 0) {
                return false;
            }
            int left = 0;
            int right = (int) (Math.sqrt(c));
            while (left <= right) {
                int curr = left * left + right * right;
                if (curr > c) {
                    right--;
                } else if (curr < c) {
                    left++;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}
