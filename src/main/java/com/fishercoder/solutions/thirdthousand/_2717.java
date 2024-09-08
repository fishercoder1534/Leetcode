package com.fishercoder.solutions.thirdthousand;

public class _2717 {
    public static class Solution1 {
        public int semiOrderedPermutation(int[] nums) {
            int[] max = new int[] {nums[0], 0};
            int[] min = new int[] {nums[0], 0};
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max[0]) {
                    max[0] = nums[i];
                    max[1] = i;
                }
                if (nums[i] < min[0]) {
                    min[0] = nums[i];
                    min[1] = i;
                }
            }
            if (max[1] > min[1]) {
                return nums.length - max[1] - 1 + min[1];
            }
            return nums.length - max[1] - 1 + min[1] - 1;
        }
    }
}
