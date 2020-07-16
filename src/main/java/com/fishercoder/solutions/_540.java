package com.fishercoder.solutions;

public class _540 {
    public static class Solution1 {
        public int singleNonDuplicate(int[] nums) {
            int result = 0;
            for (int i = 0; i < nums.length; i++) {
                result ^= nums[i];
            }
            return result;
        }
    }

    public static class Solution2 {
        public int singleNonDuplicate(int[] nums) {
            int start = 0;
            int end = nums.length - 1;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                    return nums[mid];
                } else if (nums[mid] == nums[mid + 1] && mid % 2 == 0) {
                    start = mid + 1;
                } else if (nums[mid] == nums[mid - 1] && mid % 2 == 1) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return nums[start];
        }
    }
}
