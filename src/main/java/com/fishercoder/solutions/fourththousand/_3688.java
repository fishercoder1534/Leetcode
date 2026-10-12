package com.fishercoder.solutions.fourththousand;

public class _3688 {
    public static class Solution1 {
        public int evenNumberBitwiseORs(int[] nums) {
            int result = 0;
            for (int num : nums) {
                if (num % 2 == 0) {
                    result |= num;
                }
            }
            return result;
        }
    }
}
