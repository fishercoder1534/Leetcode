package com.fishercoder.solutions;

public class _34 {

    public static class Solution1 {
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

    public static class Solution2 {
        public int[] searchRange(int[] nums, int target) {
            int[] result = new int[]{-1, -1};
            if (nums == null || nums.length == 0) {
                return result;
            }
            if (nums[0] > target) {
                return result;
            }
            if (nums[nums.length - 1] < target) {
                return result;
            }
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    while (mid - 1 >= 0 && nums[mid] == nums[mid - 1]) {
                        mid--;
                    }
                    result[0] = mid;
                    while (mid + 1 < nums.length && nums[mid] == nums[mid + 1]) {
                        mid++;
                    }
                    result[1] = mid;
                    return result;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return result;
        }
    }
}
