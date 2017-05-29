package com.fishercoder.solutions;

/**
 * 154. Find Minimum in Rotated Sorted Array II
 *
 * Follow up for "Find Minimum in Rotated Sorted Array":
 What if duplicates are allowed?

 Would this affect the run-time complexity? How and why?
 Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 Find the minimum element.

 The array may contain duplicates.
 */
public class _154 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        if (nums[left] < nums[right]) return nums[left];
        int min = nums[0];
        while (left + 1 < right) {
            int mid = left + (right-left)/2;
            min = Math.min(min, nums[mid]);
            if (nums[mid] > nums[left]) {
                min = Math.min(nums[left], min);
                left = mid+1;
            } else if (nums[mid] < nums[left]) {
                right = mid-1;
            } else {
                left++;
            }
        }
        min = Math.min(min, Math.min(nums[left], nums[right]));
        return min;
    }
}
