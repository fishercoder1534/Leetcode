package com.fishercoder.solutions.fourththousand;

public class _3516 {
    public static class Solution1 {
        public int findClosest(int x, int y, int z) {
            if (Math.abs(z - y) == Math.abs(z - x)) {
                return 0;
            } else if (Math.abs(z - x) > Math.abs(z - y)) {
                return 2;
            } else {
                return 1;
            }
        }
    }
}
