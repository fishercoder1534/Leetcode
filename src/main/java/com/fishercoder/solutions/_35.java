package com.fishercoder.solutions;

public class _35 {

    public static class Solution1 {
        public int searchInsert(int[] nums, int target) {
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                if (target <= nums[i]) {
                    return i;
                }
            }
            return len;
        }
    }

}
