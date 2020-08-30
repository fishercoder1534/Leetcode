package com.fishercoder.solutions;

public class _1567 {
    public static class Solution1 {
        public int getMaxLen(int[] nums) {
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums.length - i <= max) {
                    return max;
                }
                if (nums[i] != 0) {
                    int negatives = nums[i] > 0 ? 0 : 1;
                    max = Math.max(max, nums[i] > 0 ? 1 : 0);
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[j] < 0) {
                            negatives++;
                        } else if (nums[j] == 0) {
                            break;
                        }
                        if (negatives % 2 == 0) {
                            max = Math.max(max, j - i + 1);
                        }
                    }
                }
            }
            return max;
        }
    }
}
