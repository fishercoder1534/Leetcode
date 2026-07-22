package com.fishercoder.solutions.secondthousand;

public class _1493 {
    public static class Solution1 {
        public int longestSubarray(int[] nums) {
            boolean hasZero = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    hasZero = true;
                    break;
                }
            }
            if (!hasZero) {
                // this is for this case: {1, 1, 1} => 2, since you have to delete one item
                return nums.length - 1;
            }

            int zero = 0;
            int left = 0;
            int ans = 0;
            // sliding window solution
            for (int right = 0; right < nums.length; right++) {
                if (nums[right] == 0) {
                    zero++;
                }
                while (zero > 1) {
                    if (nums[left] == 0) {
                        zero--;
                    }
                    left++;
                }
                ans = Math.max(ans, right - left + 1 - zero);
            }
            return ans;
        }
    }

    public static class Solution2 {
        /*
         * Sliding window solution
         * Credit: https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/discuss/708112/JavaC%2B%2BPython-Sliding-Window-at-most-one-0
         * <p>
         * we initialize k to be one, meaning we could have at most one zero in the sliding window
         * i is the left pointer
         * j is the right pointer
         * when j encounters a zero, we'll decrement k by one;
         * and once k becomes negative, that means we have more than one zeroes in the sliding window,
         * so we'll have to move left pointer to the right until k becomes not negative;
         * along this process, we use result to hold the max length of this sliding window
         */
        public int longestSubarray(int[] nums) {
            int i = 0;
            int k = 1;
            int result = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == 0) {
                    k--;
                }
                while (k < 0) {
                    if (nums[i] == 0) {
                        k++;
                    }
                    i++;
                }
                result = Math.max(result, j - i);
            }
            return result;
        }
    }
}
