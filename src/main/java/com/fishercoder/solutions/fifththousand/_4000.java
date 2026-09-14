package com.fishercoder.solutions.fifththousand;

public class _4000 {
    public static class Solution1 {
        public int largestInteger(int n, int s) {
            for (int sum = (int) (Math.pow(10, n) - 1); sum >= 0; sum--) {
                int digitSum = computeDigitSum(sum);
                if (digitSum == s) {
                    return sum;
                }
            }
            return -1;
        }

        private int computeDigitSum(int num) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }
    }
}
