package com.fishercoder.solutions;

public class _1550 {
    public static class Solution1 {
        public boolean threeConsecutiveOdds(int[] arr) {
            for (int i = 0; i < arr.length - 2; i++) {
                if (arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1) {
                    return true;
                }
            }
            return false;
        }
    }
}
