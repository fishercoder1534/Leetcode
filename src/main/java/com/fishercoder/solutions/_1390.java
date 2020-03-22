package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 1390. Four Divisors
 *
 * Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors.
 * If there is no such integer in the array, return 0.
 *
 * Example 1:
 * Input: nums = [21,4,7]
 * Output: 32
 * Explanation:
 * 21 has 4 divisors: 1, 3, 7, 21
 * 4 has 3 divisors: 1, 2, 4
 * 7 has 2 divisors: 1, 7
 * The answer is the sum of divisors of 21 only.
 *
 * Constraints:
 * 1 <= nums.length <= 10^4
 * 1 <= nums[i] <= 10^5
 * */
public class _1390 {
    public static class Solution1 {
        public int sumFourDivisors(int[] nums) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                List<Integer> divisors = getDivisors(nums[i]);
                if (divisors.size() == 4) {
                    for (int div : divisors) {
                        sum += div;
                    }
                }
            }
            return sum;
        }

        private List<Integer> getDivisors(int num) {
            List<Integer> divisors = new ArrayList<>();
            for (int i = 1; i <= Math.sqrt(num); ++i) {
                if (num % i == 0) {
                    divisors.add(i);
                    if (num / i != i) {
                        divisors.add(num / i);
                    }
                }
            }
            return divisors;
        }
    }
}
