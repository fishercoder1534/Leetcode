package com.fishercoder.solutions;

public class _2455 {
    public static class Solution1 {
        public int averageValue(int[] nums) {
            Long sum = 0l;
            int count = 0;
            for (int num : nums) {
                if (num % 3 == 0 && num % 2 == 0) {
                    sum += num;
                    count++;
                }
            }
            return count != 0 ? (int) (sum / count) : 0;
        }
    }
}
