package com.fishercoder.solutions;

public class _154 {
    public static class Solution1 {
        public int findMin(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            if (nums[left] < nums[right]) {
                return nums[left];
            }
            int min = nums[0];
            while (left + 1 < right) {
                int mid = left + (right - left) / 2;
                min = Math.min(min, nums[mid]);
                if (nums[mid] > nums[left]) {
                    min = Math.min(nums[left], min);
                    left = mid + 1;
                } else if (nums[mid] < nums[left]) {
                    right = mid - 1;
                } else {
                    left++;
                }
            }
            min = Math.min(min, Math.min(nums[left], nums[right]));
            return min;
        }
    }
}
