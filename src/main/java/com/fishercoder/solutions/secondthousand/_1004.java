package com.fishercoder.solutions.secondthousand;

public class _1004 {
    public static class Solution1 {
        /*
         * Two pointer technique, a.k.a sliding window.
         */
        public int longestOnes(int[] nums, int k) {
            int result = 0;
            int left = 0;
            for (int right = 0; right < nums.length; right++) {
                if (nums[right] == 0) {
                    k--;
                }
                while (k < 0) {
                    // in this case, we'll move the left pointer to the right
                    if (nums[left] == 0) {
                        k++;
                    }
                    left++;
                }
                result = Math.max(result, right - left + 1);
            }
            return result;
        }
    }
}
