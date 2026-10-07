package com.fishercoder.solutions.secondthousand;

public class _1979 {
    public static class Solution1 {
        public int findGCD(int[] nums) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int num : nums) {
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
            return getGcd(min, max);
        }

        private int getGcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }
}
