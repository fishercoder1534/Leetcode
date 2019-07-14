package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 581. Shortest Unsorted Continuous Subarray
 *
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

 You need to find the shortest such subarray and output its length.

 Example 1:
 Input: [2, 6, 4, 8, 10, 9, 15]
 Output: 5
 Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.

 Note:
 Then length of the input array is in range [1, 10,000].
 The input array may contain duplicates, so ascending order here means <=.

 */
public class _581 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/89282/java-o-n-time-o-1-space
         * Use start and end to keep track of the minimum subarray nums[start...end] which must be sorted for the entire array nums.
         * If start < end < 0 at the end of the for loop, then the array is already fully sorted.
         *
         * Time: O(n)
         * Space: O(1)
         */
        public int findUnsortedSubarray(int[] nums) {
            int n = nums.length;
            int start = -1;
            int end = -2;
            int min = nums[n - 1];
            int max = nums[0];
            for (int i = 1; i < n; i++) {
                max = Math.max(max, nums[i]);
                min = Math.min(min, nums[n - 1 - i]);
                if (nums[i] < max) {
                    end = i;
                }
                if (nums[n - 1 - i] > min) {
                    start = n - 1 - i;
                }
            }
            return end - start + 1;
        }
    }

    public static class Solution2 {
        /**
         * Time: O(nlogn)
         * Space: O(n)
         */
        public int findUnsortedSubarray(int[] nums) {
            int[] clones = nums.clone();
            Arrays.sort(clones);
            int start = nums.length;
            int end = 0;
            for (int i = 0; i < nums.length; i++) {
                if (clones[i] != nums[i]) {
                    start = Math.min(start, i);
                    end = Math.max(end, i);
                }
            }
            return (end - start > 0) ? end - start + 1 : 0;
        }
    }

}
