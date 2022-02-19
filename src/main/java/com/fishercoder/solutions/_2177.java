package com.fishercoder.solutions;

public class _2177 {
    public static class Solution1 {
        public long[] sumOfThree(long num) {
            long remainder = num % 3;
            long ave = num / 3;
            if (remainder == 0) {
                return new long[]{ave - 1, ave, ave + 1};
            } else {
                return new long[]{};
            }
        }
    }
}
