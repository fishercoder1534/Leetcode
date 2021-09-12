package com.fishercoder.solutions;

public class _704 {
    public static class Solution1 {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            if (target < nums[left] || target > nums[right]) {
                return -1;
            }
            if (nums[left] == target) {
                return left;
            } else if (nums[right] == target) {
                return right;
            }
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (target == nums[mid]) {
                    return mid;
                } else if (target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }
    }

    public static class Solution2 {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return nums[left] == target ? left : (right >= 0 && nums[right] == target) ? right : -1;
        }
    }
}
