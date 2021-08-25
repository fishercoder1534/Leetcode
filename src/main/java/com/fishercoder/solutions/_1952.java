package com.fishercoder.solutions;

public class _1952 {
    public static class Solution1 {
        public boolean isThree(int n) {
            int divisors = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    divisors++;
                }
            }
            return divisors == 3;
        }
    }
}
