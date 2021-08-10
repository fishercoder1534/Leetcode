package com.fishercoder.solutions;

import java.util.Arrays;

public class _1752 {
    public static class Solution1 {
        public boolean check(int[] nums) {
            int[] copy = Arrays.copyOf(nums, nums.length);
            Arrays.sort(copy);
            for (int i = 1; i <= nums.length; i++) {
                int[] rotated = rotate(nums, i);
                if (Arrays.equals(rotated, copy)) {
                    return true;
                }
            }
            return false;
        }

        private int[] rotate(int[] nums, int start) {
            int[] rotated = new int[nums.length];
            int j = 0;
            for (int i = start; i < nums.length; i++, j++) {
                rotated[j] = nums[i];
            }
            for (int i = 0; i < start; i++) {
                rotated[j++] = nums[i];
            }
            return rotated;
        }
    }
}
