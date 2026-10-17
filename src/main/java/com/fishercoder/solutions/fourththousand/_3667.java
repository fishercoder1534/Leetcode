package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;

public class _3667 {
    public static class Solution1 {
        public int[] sortByAbsoluteValue(int[] nums) {
            int[][] absWithIndex = new int[nums.length][2];
            for (int i = 0; i < nums.length; i++) {
                absWithIndex[i][0] = Math.abs(nums[i]);
                absWithIndex[i][1] = i;
            }
            Arrays.sort(absWithIndex, (a, b) -> a[0] - b[0]);
            int[] ans = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                ans[i] = nums[absWithIndex[i][1]];
            }
            return ans;
        }
    }
}
