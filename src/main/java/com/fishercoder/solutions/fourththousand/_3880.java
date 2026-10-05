package com.fishercoder.solutions.fourththousand;

public class _3880 {
    public static class Solution1 {
        public int minAbsoluteDifference(int[] nums) {
            int minAbsDiff = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    int left = i - 1;
                    int right = i + 1;
                    while (left >= 0) {
                        if (nums[left] == 2) {
                            minAbsDiff = Math.min(minAbsDiff, Math.abs(i - left));
                            break;
                        }
                        left--;
                    }
                    while (right < nums.length) {
                        if (nums[right] == 2) {
                            minAbsDiff = Math.min(minAbsDiff, Math.abs(right - i));
                            break;
                        }
                        right++;
                    }
                }
            }
            return minAbsDiff == Integer.MAX_VALUE ? -1 : minAbsDiff;
        }
    }
}
