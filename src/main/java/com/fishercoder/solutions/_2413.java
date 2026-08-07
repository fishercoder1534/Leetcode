package com.fishercoder.solutions;

public class _2413 {

    public static class Solution1 {
        public int smallestEvenMultiple(int n) {
            int maxNo = 2 * n;
            int smallestMultiple = -1;
            for(int i = 2; i <= maxNo; i += 2) {
                if (i % n == 0 && i % 2 == 0) {
                    smallestMultiple = i;
                    break;
                }
            }
            return smallestMultiple;
        }
    }
}
