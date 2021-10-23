package com.fishercoder.solutions;

public class _153 {
    public static class Solution1 {
        /**
         * My completely original solution on 10/23/2021.
         * Again, using a pen and paper to visualize your thought process, to draw out all the possible cases helps a lot!
         */
        public int findMin(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (mid == left || mid == right) {
                    //this is to avoid infinite loop
                    break;
                }
                if (nums[mid] > nums[left] && nums[mid] > nums[right]) {
                    left = mid + 1;
                } else if (nums[mid] < nums[right] && nums[mid] > nums[left]) {
                    right = mid - 1;
                } else if (nums[mid] < nums[left] && nums[mid] < nums[right]) {
                    right = mid;
                }
            }
            return right >= 0 ? (nums[left] < nums[right] ? nums[left] : nums[right]) : nums[left];
        }
    }
}
