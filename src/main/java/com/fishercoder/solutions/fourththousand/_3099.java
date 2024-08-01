package com.fishercoder.solutions.fourththousand;

public class _3099 {
    public static class Solution1 {
        public int sumOfTheDigitsOfHarshadNumber(int x) {
            int sum = 0;
            int tmp = x;
            while (tmp != 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            return x % sum == 0 ? sum : -1;
        }
    }
}
