package com.fishercoder.solutions.fourththousand;

public class _3895 {
    public static class Solution1 {
        public int countDigitOccurrences(int[] nums, int digit) {
            int count = 0;
            for (int num : nums) {
                count += digitCount(num, digit);
            }
            return count;
        }

        private int digitCount(int num, int digit) {
            int count = 0;
            while (num > 0) {
                int n = num % 10;
                if (n == digit) {
                    count++;
                }
                num /= 10;
            }
            return count;
        }
    }
}
