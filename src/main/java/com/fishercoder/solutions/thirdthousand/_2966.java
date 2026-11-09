package com.fishercoder.solutions.thirdthousand;

import java.util.Arrays;

public class _2966 {
    public static class Solution1 {
        public int[][] divideArray(int[] nums, int k) {
            Arrays.sort(nums);
            int len = nums.length;
            boolean possible = true;
            for (int i = 0; i < len - 2; i += 3) {
                if (nums[i + 2] - nums[i] > k) {
                    possible = false;
                }
            }
            if (possible) {
                int[][] res = new int[len / 3][3];
                for (int i = 0; i < len; i++) {
                    res[i / 3][i % 3] = nums[i];
                }
                return res;
            }
            return new int[][]{};
        }
    }
}
