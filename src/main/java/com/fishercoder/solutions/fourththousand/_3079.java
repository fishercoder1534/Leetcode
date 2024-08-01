package com.fishercoder.solutions.fourththousand;

public class _3079 {
    public static class Solution1 {
        public int sumOfEncryptedInt(int[] nums) {
            int sum = 0;
            for (int num : nums) {
                sum += encrypt(num);
            }
            return sum;
        }

        private int encrypt(int num) {
            int max = 0;
            int digits = 0;
            while (num != 0) {
                max = Math.max(max, num % 10);
                num /= 10;
                digits++;
            }
            int ans = 0;
            int base = 1;
            while (digits > 0) {
                ans += base * max;
                digits--;
                base *= 10;
            }
            return ans;
        }
    }
}
