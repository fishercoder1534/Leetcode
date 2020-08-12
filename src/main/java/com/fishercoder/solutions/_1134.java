package com.fishercoder.solutions;

public class _1134 {
    public static class Solution1 {
        public boolean isArmstrong(int N) {
            int numOfDigits = 0;
            int copyN = N;
            while (copyN > 0) {
                copyN /= 10;
                numOfDigits++;
            }
            int sum = 0;
            copyN = N;
            while (N > 0) {
                int digit = N % 10;
                sum += Math.pow(digit, numOfDigits);
                N /= 10;
            }
            return sum == copyN;
        }
    }
}
