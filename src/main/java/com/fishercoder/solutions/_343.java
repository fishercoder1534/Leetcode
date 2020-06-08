package com.fishercoder.solutions;

public class _343 {
    public static class Solution1 {
        public int integerBreak(int n) {
            if (n == 2) {
                return 1;
            } else if (n == 3) {
                return 2;
            } else if (n % 3 == 0) {
                return (int) Math.pow(3, n / 3);
            } else if (n % 3 == 1) {
                return 2 * 2 * (int) Math.pow(3, (n - 4) / 3);
            } else {
                return 2 * (int) Math.pow(3, n / 3);
            }
        }
    }
}
