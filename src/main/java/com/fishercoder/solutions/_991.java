package com.fishercoder.solutions;

public class _991 {
    public static class Solution1 {
        public int brokenCalc(int X, int Y) {
            int ops = 0;
            while (Y > X) {
                ops++;
                if (Y % 2 != 0) {
                    Y++;
                } else {
                    Y /= 2;
                }
            }
            return ops + X - Y;
        }
    }
}
