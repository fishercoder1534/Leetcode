package com.fishercoder.solutions;

/**
 * 673. Number of Longest Increasing Subsequence
 * Given an unsorted array of integers, find the number of longest increasing subsequence.

 Example 1:

 Input: [1,3,5,4,7]
 Output: 2
 Explanation: The two longest increasing subsequence are [1, 3, 4, 7] and [1, 3, 5, 7].

 Example 2:

 Input: [2,2,2,2,2]
 Output: 5
 Explanation: The length of longest continuous increasing subsequence is 1,
 and there are 5 subsequences' length is 1, so output 5.

 Note: Length of the given array will be not exceed 2000 and the answer is guaranteed to be fit in 32-bit signed int.
 */
public class _673 {
    public static class Solution1 {
        /**
         * Reference: https://discuss.leetcode.com/topic/103020/java-c-simple-dp-solution-with-explanation
         */
        public int findNumberOfLIS(int[] nums) {
            int n = nums.length;
            int[] cnt = new int[n];
            int[] len = new int[n];
            int max = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                len[i] = cnt[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) {
                        if (len[i] == len[j] + 1) {
                            cnt[i] += cnt[j];
                        }
                        if (len[i] < len[j] + 1) {
                            len[i] = len[j] + 1;
                            cnt[i] = cnt[j];
                        }
                    }
                }

                if (max == len[i]) {
                    count += cnt[i];
                }

                if (len[i] > max) {
                    max = len[i];
                    count = cnt[i];
                }
            }
            return count;
        }
    }
}
