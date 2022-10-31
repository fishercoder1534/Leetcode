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
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int mid = (left + right) / 2;
                if (nums[mid] == target) {
                    return mid;
                }

                if (nums[left] <= nums[mid]) {
                    if (target >= nums[left] && target < nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
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

    public static class Solution3 {
        /**
         * My completely original solution on 10/23/2021, although spaghetti code.
         */
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] == target) {
                    return left;
                } else if (nums[right] == target) {
                    return right;
                }
                int mid = left + (right - left) / 2;
                if (left == mid || right == mid) {
                    break;
                }
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target && nums[right] > target && nums[left] > target) {
                    if (nums[right] < nums[mid]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                } else if (nums[mid] > target && nums[right] < target) {
                    right = mid - 1;
                } else if (nums[mid] < target && nums[right] > target) {
                    left = mid + 1;
                } else if (nums[mid] < target && nums[right] < target && nums[left] < target) {
                    if (nums[mid] < nums[left] && nums[mid] < nums[right]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else if (nums[mid] > target && nums[left] < target) {
                    right = mid;
                } else if (nums[mid] < target && nums[right] < target && nums[left] > target) {
                    right = mid - 1;
                }
            }
            return (right >= 0 && nums[right] == target) ? right : (nums[left] == target) ? left : -1;
        }
    }
}
