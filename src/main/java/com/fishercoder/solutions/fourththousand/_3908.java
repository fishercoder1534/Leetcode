package com.fishercoder.solutions.fourththousand;

public class _3908 {
    public static class Solution1 {
        public boolean validDigit(int n, int x) {
            int count = 0;
            while (n != 0) {
                int lastDigit = n % 10;
                if (lastDigit == x) {
                    count++;
                }
                int prev = n;
                n /= 10;
                if (n == 0) {
                    if (prev != x && count > 0) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
