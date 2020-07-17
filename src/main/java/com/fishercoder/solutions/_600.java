package com.fishercoder.solutions;

public class _600 {

    public static class Solution1 {
        /**
         * Credit: https://leetcode.com/articles/non-negative-integers-without-consecutive-ones/#approach-3-using-bit-manipulation-accepted
         */
        public int findIntegers(int num) {
            int[] f = new int[32];
            f[0] = 1;
            f[1] = 2;
            for (int i = 2; i < f.length; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }
            int i = 30;
            int sum = 0;
            int prevBit = 0;
            while (i >= 0) {
                if ((num & (1 << i)) != 0) {
                    sum += f[i];
                    if (prevBit == 1) {
                        sum--;
                        break;
                    }
                    prevBit = 1;
                } else {
                    prevBit = 0;
                }
                i--;
            }
            return sum + 1;
        }
    }

}
