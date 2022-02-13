package com.fishercoder.solutions;

public class _2169 {
    public static class Solution1 {
        public int countOperations(int num1, int num2) {
            int ops = 0;
            while (true) {
                if (num1 == 0 || num2 == 0) {
                    return ops;
                }
                if (num1 >= num2) {
                    num1 -= num2;
                } else {
                    num2 -= num1;
                }
                ops++;

            }
        }
    }
}
