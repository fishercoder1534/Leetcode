package com.fishercoder.solutions.thirdthousand;

import java.util.Arrays;

public class _2501 {
    public static class Solution1 {
        /**
         * Based on the constraints, we know the longest square streak is 5: 2, 4, 16, 256, 65536 or
         * 3, 9, 81, 6561, 43046721 (> 10 to the power of 5 already)
         */
        public int longestSquareStreak(int[] nums) {
            Arrays.sort(nums);
            int ans = -1;
            for (int i = 0; i < nums.length; i++) {
                int times = 1;
                int square = (int) Math.pow(nums[i], 2);
                while (square <= nums[nums.length - 1]) {
                    if (exists(nums, square)) {
                        square = (int) Math.pow(square, 2);
                        times++;
                    } else {
                        break;
                    }
                }
                if (times > 1) {
                    ans = Math.max(ans, times);
                }
            }
            return ans;
        }

        private boolean exists(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    return true;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return left == right ? nums[left] == target ? true : false : false;
        }
    }
}
