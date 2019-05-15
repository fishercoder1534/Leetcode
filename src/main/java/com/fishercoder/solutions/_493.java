package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 493. Reverse Pairs
 *
 * Given an array nums, we call (i, j) an important reverse pair if i < j and nums[i] > 2*nums[j].

 You need to return the number of important reverse pairs in the given array.

 Example1:

 Input: [1,3,2,3,1]
 Output: 2
 Example2:

 Input: [2,4,3,5,1]
 Output: 3

 Note:
 The length of the given array will not exceed 50,000.
 All the numbers in the input array are in the range of 32-bit integer.
 */
public class _493 {

    public static class Solution1 {

        /**
         * reference: https://discuss.leetcode.com/topic/78933/very-short-and-clear-mergesort-bst-java-solutions
         */
        public int reversePairs(int[] nums) {
            return mergeSort(nums, 0, nums.length - 1);
        }

        private int mergeSort(int[] nums, int start, int end) {
            if (start >= end) {
                return 0;
            }
            int mid = start + (end - start) / 2;
            int cnt = mergeSort(nums, start, mid) + mergeSort(nums, mid + 1, end);
            for (int i = start, j = mid + 1; i <= mid; i++) {
                /**it has to be 2.0 instead of 2, otherwise it's going to stack overflow, i.e. test3 is going to fail*/
                while (j <= end && nums[i] > nums[j] * 2.0) {
                    j++;
                }
                cnt += j - (mid + 1);
            }
            Arrays.sort(nums, start, end + 1);
            return cnt;
        }
    }
}
