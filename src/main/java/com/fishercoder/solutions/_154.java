package com.fishercoder.solutions;

public class _154 {
    public static class Solution1 {
        /**
         * My completely original solution on 10/23/2021.
         * Again, using a pen and paper to visualize all possible cases helps a great deal!
         */
        public int findMin(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                while (left + 1 < right && nums[left] == nums[left + 1]) {
                    left++;
                }
                while (right - 1 > left && nums[right - 1] == nums[right]) {
                    right--;
                }
                int mid = left + (right - left) / 2;
                if (mid == left || mid == right) {
                    break;
                }
                if (nums[mid] < nums[right]) {
                    right = mid;
                } else if (nums[mid] < nums[left]) {
                    left = mid;
                } else if (nums[mid] > nums[right]) {
                    left = mid + 1;
                }
            }
            return right >= 0 && nums[right] < nums[left] ? nums[right] : nums[left];
        }
    }
}
