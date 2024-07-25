package com.fishercoder.solutions.thirdthousand;

public class _2652 {
    public static class Solution1 {
        public int sumOfMultiples(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }
}
