package com.fishercoder.solutions._1st_thousand;

/**
 * 81. Search in Rotated Sorted Array II
 * <p>
 * There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
 * Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is
 * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
 * Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.
 * You must decrease the overall operation steps as much as possible.
 * <p>
 * Example 1:
 * Input: nums = [2,5,6,0,0,1,2], target = 0
 * Output: true
 * <p>
 * Example 2:
 * Input: nums = [2,5,6,0,0,1,2], target = 3
 * Output: false
 * <p>
 * Constraints:
 * 1 <= nums.length <= 5000
 * -104 <= nums[i] <= 104
 * nums is guaranteed to be rotated at some pivot.
 * -104 <= target <= 104
 * Follow up: This problem is similar to Search in Rotated Sorted Array, but nums may contain duplicates. Would this affect the runtime complexity? How and why?
 */
public class _81 {
    public static class Solution1 {
        public boolean search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            //check each num so we will check left == right
            //We always get a sorted part and a half part
            //we can check sorted part to decide where to go next
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    return true;
                }

                if (nums[left] < nums[mid]) {
                    //if left part is sorted
                    if (target < nums[left] || target > nums[mid]) {
                        //target is in rotated part
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                } else if (nums[left] > nums[mid]) {
                    //right part is sorted
                    if (target < nums[mid] || target > nums[right]) {
                        //target is in rotated part
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    //duplicates, we know nums[mid] != target, so nums[left] != target
                    //based on current information, we can only move left pointer to skip one cell
                    //thus in the worst case, we would have target: 2, and array like 11111111, then
                    //the running time would be O(n)
                    left++;
                }
            }
            return false;
        }
    }
}
