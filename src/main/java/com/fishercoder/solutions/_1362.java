package com.fishercoder.solutions;

/**
 * 1362. Closest Divisors
 *
 * Given an integer num, find the closest two integers in absolute difference whose product equals num + 1 or num + 2.
 * Return the two integers in any order.
 *
 * Example 1:
 * Input: num = 8
 * Output: [3,3]
 * Explanation: For num + 1 = 9, the closest divisors are 3 & 3, for num + 2 = 10, the closest divisors are 2 & 5, hence 3 & 3 is chosen.
 *
 * Example 2:
 * Input: num = 123
 * Output: [5,25]
 *
 * Example 3:
 * Input: num = 999
 * Output: [40,25]
 *
 * Constraints:
 * 1 <= num <= 10^9
 * */
public class _1362 {
    public static class Solution1 {
        public int[] closestDivisors(int num) {
            int sqrt = (int) Math.sqrt(num);
            int left = sqrt + 1;
            int right = sqrt + 1;
            long product = left * right;
            while (product != (long) (num + 1) && product != (long) (num + 2)) {
                if (product < (num + 1)) {
                    left++;
                } else if (product > (num + 2)) {
                    right--;
                }
                product = left * right;
            }
            return new int[]{left, right};
        }
    }
}
