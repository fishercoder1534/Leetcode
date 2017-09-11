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
        public int findNumberOfLIS(int[] nums) {
            int longest = findLongestLIS(nums);
            if (longest == 1) {
                return nums.length;
            }
            int result = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i + longest > nums.length) {
                    break;
                }
            }
            return result;
        }

        private int findLongestLIS(int[] nums) {
            int longest = 0;
            for (int i = 0; i < nums.length; i++) {
                int len = 1;
                int lastNum = nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    if (lastNum < nums[j]) {
                        len++;
                        lastNum = nums[j];
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
