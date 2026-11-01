package com.fishercoder.solutions.fifththousand;

public class _4097 {
    public static class Solution1 {
        public int minMergedInteger(int[] nums) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length - 1; i += 2) {
                min = Math.min(min, merge(nums[i], nums[i + 1]));
            }
            return min;
        }

        private int merge(int num1, int num2) {
            StringBuilder sb = new StringBuilder();
            sb.append(num2);
            int size = sb.length();
            while (size-- > 0) {
                num1 *= 10;
            }
            return num1 + num2;
        }

    }
}
