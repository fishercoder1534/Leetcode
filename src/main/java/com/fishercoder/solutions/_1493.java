package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1493 {
    public static class Solution1 {
        public int longestSubarray(int[] nums) {
            List<int[]> brackets = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    int right = i + 1;
                    while (right < nums.length && nums[right] == 1) {
                        right++;
                    }
                    if (right < nums.length && nums[right] == 1) {
                        brackets.add(new int[]{i, right});
                    } else {
                        brackets.add(new int[]{i, right - 1});
                    }
                    i = right;
                }
            }
            int longest = 0;
            for (int[] bracket : brackets) {
                if (bracket[1] == nums.length - 1 && bracket[0] == 0) {
                    return nums.length - 1;
                }
                longest = Math.max(bracket[1] - bracket[0] + 1, longest);
            }
            for (int i = 0; i < brackets.size() - 1; i++) {
                int[] first = brackets.get(i);
                int[] second = brackets.get(i + 1);
                if (first[1] + 2 == second[0]) {
                    int connected = (first[1] - first[0] + 1) + (second[1] - second[0] + 1);
                    longest = Math.max(longest, connected);
                }
            }
            return longest;
        }
    }

    public static class Solution2 {
        /**
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
