package com.fishercoder.solutions.fourththousand;

public class _3345 {
    public static class Solution1 {
        public int smallestNumber(int n, int t) {
            for (int num = n; ; num++) {
                int digitSum = getDigitsProduct(num);
                if (digitSum % t == 0) {
                    return num;
                }
            }
        }

        private int getDigitsProduct(int num) {
            int copy = num;
            int product = 1;
            while (copy != 0) {
                product *= copy % 10;
                copy /= 10;
            }
            return product;
        }
    }
}
