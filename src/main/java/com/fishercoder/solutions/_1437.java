package com.fishercoder.solutions;

public class _1437 {
    public static class Solution1 {
        public boolean kLengthApart(int[] nums, int k) {
            int lastOneIndex = nums[0] == 1 ? 0 : -1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == 1) {
                    if (i - lastOneIndex <= k) {
                        return false;
                    } else {
                        lastOneIndex = i;
                    }
                }
            }
            return true;
        }
    }
}
