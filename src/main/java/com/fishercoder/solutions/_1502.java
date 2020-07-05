package com.fishercoder.solutions;

import java.util.Arrays;

public class _1502 {
    public static class Solution1 {
        public boolean canMakeArithmeticProgression(int[] arr) {
            Arrays.sort(arr);
            for (int i = 0; i < arr.length - 2; i++) {
                if (arr[i + 1] - arr[i] != arr[i + 2] - arr[i + 1]) {
                    return false;
                }
            }
            return true;
        }
    }
}
