package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 1295. Find Numbers with Even Number of Digits
 *
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 * Example 1:
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 *
 * Example 2:
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:
 * Only 1771 contains an even number of digits.
 *
 * Constraints:
 * 1 <= nums.length <= 500
 * 1 <= nums[i] <= 10^5
 * */
public class _1295 {
    public static class Solution1 {
        public int findNumbers(int[] nums) {
            int count = 0;
            for (int num : nums) {
                if (String.valueOf(num).length() % 2 == 0) {
                    count++;
                }
            }
            return count;
        }
    }

    public static class Solution2 {
        public int findNumbers(int[] nums) {
            return (int) Arrays.stream(nums).filter(num -> String.valueOf(num).length() % 2 == 0).count();
        }
    }
}
