package com.fishercoder.solutions;

public class _370 {
    public static class Solution1 {
        public int[] getModifiedArray(int length, int[][] updates) {
            int[] nums = new int[length];
            int k = updates.length;
            for (int i = 0; i < k; i++) {
                int start = updates[i][0];
                int end = updates[i][1];
                int inc = updates[i][2];
                nums[start] += inc;
                if (end < length - 1) {
                    nums[end + 1] -= inc;
                }
            }

            int sum = 0;
            for (int i = 0; i < length; i++) {
                sum += nums[i];
                nums[i] = sum;
            }
            return nums;
        }
    }

    public static class Solution2 {
        public int[] getModifiedArray(int length, int[][] updates) {
            int[] result = new int[length];
            for (int[] update : updates) {
                for (int i = update[0]; i <= update[1]; i++) {
                    result[i] += update[2];
                }
            }
            return result;
        }
    }
}
