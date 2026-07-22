package com.fishercoder.solutions.fourththousand;

public class _3959 {
    public static class Solution1 {
        public boolean checkGoodInteger(int n) {
            long squareSum = 0;
            long digitSum = 0;
            while (n != 0) {
                int digit = n % 10;
                squareSum += digit * digit;
                digitSum += digit;
                n = n / 10;
            }
            return (squareSum - digitSum) >= 50;
        }
    }
}
