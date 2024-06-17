package com.fishercoder.solutions.thirdthousand;

public class _2544 {
    public static class Solution1 {
        public int alternateDigitSum(int n) {
            int result = 0;
            int original = n;
            int digits = 0;
            while (n != 0) {
                n /= 10;
                digits++;
            }
            boolean plus = digits % 2 != 0;
            while (original != 0) {
                int lastDigit = original % 10;
                if (plus) {
                    result += lastDigit;
                } else {
                    result -= lastDigit;
                }
                plus = !plus;
                original /= 10;
            }
            return result;
        }
    }
}
