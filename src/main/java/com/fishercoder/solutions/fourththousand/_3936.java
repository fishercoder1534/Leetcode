package com.fishercoder.solutions.fourththousand;

public class _3936 {
    public static class Solution1 {
        /**
         * My completely original solution:
         * two pointer technique:
         * left pointer keeps looking for the zero number
         * right pointer keeps looking for the non-zero number
         * once we find a pair, increase the swap count;
         * if we don't find a pair, keep moving both pointers.
         *
         */
        public int minimumSwaps(int[] nums) {
            int minsSwaps = 0;
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                while (left < right && nums[right] == 0) {
                    right--;
                }
                if (left >= right) {
                    return minsSwaps;
                }
                while (left < right && nums[left] != 0) {
                    left++;
                }
                if (left >= right) {
                    return minsSwaps;
                }
                minsSwaps++;
                left++;
                right--;
            }
            return minsSwaps;
        }
    }
}
