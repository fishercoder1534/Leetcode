package com.fishercoder.solutions;

/**
 * 34. Search for a Range
 *
 * Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].

 For example,
 Given [5, 7, 7, 8, 8, 10] and target value 8,
 return [3, 4].

 */
public class _34 {

    public int[] searchRange(int[] nums, int target) {
        int[] range = new int[2];
        range[0] = -1;
        range[1] = -1;
        if (nums == null || nums.length == 0) {
            return range;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                int left = mid;
                while (left - 1 >= 0 && nums[left] == nums[left - 1]) {
                    left--;
                }
                range[0] = left;
                int right = mid;
                while (right + 1 < nums.length && nums[right] == nums[right + 1]) {
                    right++;
                }
                range[1] = right;
                break;
            } else if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (nums[start] == target) {
            range[0] = start;
            while (start + 1 < nums.length && nums[start] == nums[start + 1]) {
                start++;
            }
            range[1] = start;
        } else if (nums[end] == target) {
            range[1] = end;
            while (end - 1 >= 0 && nums[end] == nums[end - 1]) {
                end--;
            }
            range[0] = end;
        }
        return range;
    }
}
