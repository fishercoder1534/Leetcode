package com.fishercoder.solutions.thirdthousand;

import java.util.List;

public class _2859 {
    public static class Solution1 {
        public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
            int sum = 0;
            for (int i = 0; i < nums.size(); i++) {
                if (setbit(i, k)) {
                    sum += nums.get(i);
                }
            }
            return sum;
        }

        private boolean setbit(int num, int k) {
            String bin = Integer.toBinaryString(num);
            int ones = 0;
            for (char c : bin.toCharArray()) {
                if (c == '1') {
                    ones++;
                }
            }
            return ones == k;
        }
    }
}
