package com.fishercoder.solutions;

import java.util.Arrays;

public class _1968 {
    public static class Solution1 {
        public int[] rearrangeArray(int[] nums) {
            Arrays.sort(nums);
            int[] result = new int[nums.length];
            int j = 1;
            for (int i = 0; i < nums.length / 2; i++) {
                result[j] = nums[i];
                j += 2;
            }
            j = 0;
            for (int i = nums.length / 2; i < nums.length; i++) {
                result[j] = nums[i];
                j += 2;
            }
            return result;
        }
    }
}
