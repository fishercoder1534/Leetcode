package com.fishercoder.solutions;

public class _33 {

    public static class Solution1 {

        public int search(int[] nums, int target) {
            if (nums == null || nums.length == 0) {
                return -1;
            }
            int minIdx = findMinIdx(nums);
            if (target == nums[minIdx]) {
                return minIdx;
            }
            int m = nums.length;
            int start = (target <= nums[m - 1]) ? minIdx : 0;
            int end = (target > nums[m - 1]) ? minIdx : m - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
        }

        private int findMinIdx(int[] nums) {
            int start = 0;
            int end = nums.length - 1;

            while (start < end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] > nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
            return start;
        }
    }

    public static class Solution2 {
        public int search(int[] nums, int target) {
            if (nums == null || nums.length == 0) {
                return -1;
            }
            int lo = 0;
            int hi = nums.length - 1;
            while (lo < hi) {
                int mid = (lo + hi) / 2;
                if (nums[mid] == target) {
                    return mid;
                }

                if (nums[lo] <= nums[mid]) {
                    if (target >= nums[lo] && target < nums[mid]) {
                        hi = mid - 1;
                    } else {
                        lo = mid + 1;
                    }
                } else {
                    if (target > nums[mid] && target <= nums[hi]) {
                        lo = mid + 1;
                    } else {
                        hi = mid - 1;
                    }
                }
            }
            return nums[lo] == target ? lo : -1;
        }
    }
}
