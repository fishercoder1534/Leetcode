package com.fishercoder.solutions;

public class _365 {

    public static class Solution1 {
        public boolean canMeasureWater(int x, int y, int z) {
            if (x + y < z) {
                return false;
            }
            if (x == z || y == z || x + y == z) {
                return true;
            }
            return z % gcd(x, y) == 0;
        }

        int gcd(int x, int y) {
            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }
            return x;
        }
    }
}
