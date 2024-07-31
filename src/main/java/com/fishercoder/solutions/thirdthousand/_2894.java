package com.fishercoder.solutions.thirdthousand;

public class _2894 {
    public static class Solution1 {
        public int differenceOfSums(int n, int m) {
            int sum1 = 0;
            int sum2 = 0;
            for (int num = 1; num <= n; num++) {
                if (num % m != 0) {
                    sum1 += num;
                } else {
                    sum2 += num;
                }
            }
            return sum1 - sum2;
        }
    }
}
