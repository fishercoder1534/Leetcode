package com.fishercoder.solutions;

import java.util.Arrays;

public class _167 {
    public static class Solution1 {
        /**
         * This is an amazing solution!
         * Time: O(logn)
         */
        public int[] twoSum(int[] numbers, int target) {
            int left = 0;
            int right = numbers.length - 1;
            while (left < right) {
                long sum = numbers[left] + numbers[right];
                if (sum > target) {
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    return new int[]{left + 1, right + 1};
                }
            }
            return new int[]{-1, -1};
        }
    }

    public static class Solution2 {
        /**
         * Time: O(nlogn)
         */
        public int[] twoSum(int[] numbers, int target) {
            for (int i = 0; i < numbers.length - 1; i++) {
                int index = exists(Arrays.copyOfRange(numbers, i + 1, numbers.length), target - numbers[i]);
                if (index >= 0) {
                    return new int[]{i + 1, index + 2 + i};
                }
            }
            return null;
        }

        private int exists(int[] nums, int target) {
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

    public static class Solution3 {
        /**
         * Time: O(nlogn)
         */
        public int[] twoSum(int[] numbers, int target) {
            for (int i = 0; i < numbers.length - 1; i++) {
                int[] ans = new int[2];
                ans[0] = i + 1;
                int index = Arrays.binarySearch(Arrays.copyOfRange(numbers, i, numbers.length), target - numbers[i]);
                if (index > 0) {
                    ans[1] = index + 1 + i;
                    return ans;
                } else if (index == 0) {
                    ans[1] = index + 2 + i;
                    return ans;
                }
            }
            return null;
        }
    }
}
