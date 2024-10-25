package com.fishercoder.solutions.fourththousand;

public class _3300 {
    public static class Solution1 {
        public int minElement(int[] nums) {
            int min = Integer.MAX_VALUE;
            for (int num : nums) {
                min = Math.min(min, findSum(num));
            }
            return min;
        }

        private int findSum(int num) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }
    }
}
