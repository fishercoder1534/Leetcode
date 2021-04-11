package com.fishercoder.solutions;

public class _1822 {
    public static class Solution1 {
        public int arraySign(int[] nums) {
            int negativeCount = 0;
            for (int num : nums) {
                if (num == 0) {
                    return 0;
                } else if (num < 0) {
                    negativeCount++;
                }
            }
            return negativeCount % 2 == 0 ? 1 : -1;
        }
    }
}
