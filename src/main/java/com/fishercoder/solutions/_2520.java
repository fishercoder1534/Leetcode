package com.fishercoder.solutions;

public class _2520 {
    public static class Solution1 {
        public int countDigits(int num) {
            int original = num;
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                num /= 10;
                if (original % digit == 0) {
                    sum++;
                }
            }
            return sum;
        }
    }
}
