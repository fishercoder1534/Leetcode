package com.fishercoder.solutions.fourththousand;

public class _3658 {
    public static class Solution1 {
        public int gcdOfOddEvenSums(int n) {
            long oddSum = 0;
            int odd = 1;
            long evenSum = 0;
            int even = 2;
            for (int i = 0; i < n; i++) {
                oddSum += odd;
                odd += 2;

                evenSum += even;
                even += 2;
            }
            return gcd(oddSum, evenSum);
        }

        private int gcd(long oddSum, long evenSum) {
            while (evenSum != 0) {
                long tmp = evenSum;
                evenSum = oddSum % evenSum;
                oddSum = tmp;
            }
            return (int) oddSum;
        }
    }
}
