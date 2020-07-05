package com.fishercoder.solutions;

public class _461 {
    public static class Solution1 {
        public int hammingDistance(int x, int y) {
            int n = x ^ y;
            int count = 0;
            while (n != 0) {
                count++;
                n &= (n - 1);
            }
            return count;
        }
    }
}
