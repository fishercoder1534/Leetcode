package com.fishercoder.solutions;

import java.util.Arrays;

public class _2160 {
    public static class Solution1 {
        public int minimumSum(int num) {
            int[] digits = new int[4];
            int i = 0;
            while (num != 0) {
                digits[i++] = num % 10;
                num /= 10;
            }
            Arrays.sort(digits);
            int num1 = 0;
            if (digits[0] == 0) {
                num1 = digits[3];
            } else {
                num1 = digits[0] * 10 + digits[3];
            }
            int num2 = 0;
            if (digits[1] == 0) {
                num2 = digits[2];
            } else {
                num2 = digits[1] * 10 + digits[2];
            }
            return num1 + num2;
        }
    }
}
