package com.fishercoder.solutions;

/**
 * 674. Longest Continuous Increasing Subsequence
 * Given an unsorted array of integers, find the length of longest continuous increasing subsequence.

 Example 1:
 Input: [1,3,5,4,7]
 Output: 3
 Explanation: The longest continuous increasing subsequence is [1,3,5],
 its length is 3. Even though [1,3,5,7] is also an increasing subsequence,
 it's not a continuous one where 5 and 7 are separated by 4.

 Example 2:
 Input: [2,2,2,2,2]
 Output: 1
 Explanation: The longest continuous increasing subsequence is [2], its length is 1.

 Note: Length of the array will not exceed 10,000.
 */
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
