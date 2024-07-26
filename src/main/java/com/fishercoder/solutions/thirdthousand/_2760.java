package com.fishercoder.solutions.thirdthousand;

public class _2760 {
    public static class Solution1 {
        public int longestAlternatingSubarray(int[] nums, int threshold) {
            int longest = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0 && nums[i] <= threshold) {
                    int start = i;
                    int j = i;
                    for (; j < nums.length - 1; j++) {
                        if (nums[j] % 2 != nums[j + 1] % 2 && nums[j] <= threshold && nums[j + 1] <= threshold) {
                            continue;
                        } else {
                            break;
                        }
                    }
                    longest = Math.max(longest, j - start + 1);
                }
            }
            return longest;
        }
    }
}
