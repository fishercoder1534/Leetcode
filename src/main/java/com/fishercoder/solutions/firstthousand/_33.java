package com.fishercoder.solutions.firstthousand;

/*
 * 33. Search in Rotated Sorted Array
 * <p>
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
 * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
 * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Example 1:
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * <p>
 * Example 2:
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 * <p>
 * Example 3:
 * Input: nums = [1], target = 0
 * Output: -1
 * <p>
 * Constraints:
 * 1 <= nums.length <= 5000
 * -104 <= nums[i] <= 104
 * All values of nums are unique.
 * nums is an ascending array that is possibly rotated.
 * -104 <= target <= 104
 */
public class _33 {

    public static class Solution1 {
        /*
         * Credit: https://leetcode.com/problems/search-in-rotated-sorted-array/editorial/
         * Approach 3 says it very well.
         */
        public int search(int[] nums, int target) {
            if (nums == null || nums.length == 0) {
                return -1;
            }
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int mid = (left + right) / 2;
                if (nums[mid] == target) {
                    return mid;
                }

                if (nums[left] <= nums[mid]) {
                    // this is for this case: [4, 5, 6, 7, 0, 1, 2], target = 4
                    // this means that the left sub-array is sorted
                    if (target >= nums[left] && target < nums[mid]) {
                        // in this case, if target exists, in must be in this left sorted sub-array
                        right = mid - 1;
                    } else {
                        // otherwise, it's in the other half
                        // e.g. this case: [4, 5, 6, 7, 0, 1, 2], target = 2
                        left = mid + 1;
                    }
                } else {
                    // this is for this case: [8, 9, 2, 3, 4], target = 9
                    // this means the right sub-array is sorted and the left sub-array is rotated at
                    // some pivot
                    if (target > nums[mid] && target <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
            return nums[left] == target ? left : -1;
        }
    }
}
