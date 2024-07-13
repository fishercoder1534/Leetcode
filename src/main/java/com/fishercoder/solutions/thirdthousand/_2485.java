package com.fishercoder.solutions.thirdthousand;

public class _2485 {
    public static class Solution1 {
        public int pivotInteger(int n) {
            int sum1 = 1;
            int sum2 = 0;
            for (int i = 1; i <= n; i++) {
                sum2 += i;
            }
            if (sum1 == sum2) {
                return n;
            }
            for (int i = 2; i <= n; i++) {
                sum1 += i;
                sum2 -= i - 1;
                if (sum1 == sum2) {
                    return i;
                }
            }
            return -1;
        }
    }
}
