package com.fishercoder.solutions;

public class _674 {
    public static class Solution1 {
        public int findLengthOfLCIS(int[] nums) {
            int longest = 0;
            for (int i = 0; i < nums.length; i++) {
                int len = 1;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j - 1] < nums[j]) {
                        len++;
                        continue;
                    } else {
                        break;
                    }
                }
                longest = Math.max(longest, len);
            }
            return longest;
        }
    }
}
