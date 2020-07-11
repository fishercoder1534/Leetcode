package com.fishercoder.solutions;

public class _477 {
    public static class Solution1 {
        public int totalHammingDistance(int[] nums) {
            int r = 0;
            for (int i = 0; i < 32; i++) {
                int one = 0;
                int zero = 0;
                int bit = 1 << i;
                for (int n : nums) {
                    if ((n & bit) != 0) {
                        one++;
                    } else {
                        zero++;
                    }
                }
                r += one * zero;
            }
            return r;
        }
    }

}
