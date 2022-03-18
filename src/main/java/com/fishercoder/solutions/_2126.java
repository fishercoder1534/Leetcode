package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _2126 {
    public static class Solution1 {
        public boolean asteroidsDestroyed(int mass, int[] asteroids) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int a : asteroids) {
                map.put(a, map.getOrDefault(a, 0) + 1);
            }
            int[] nums = new int[map.keySet().size()];
            int i = 0;
            for (int key : map.keySet()) {
                nums[i++] = key;
            }
            Arrays.sort(nums);
            int startIndex = 0;
            long sum = mass;
            int upToIndex = binarySearch(sum, nums, startIndex, nums.length - 1);
            while (upToIndex < nums.length) {
                for (i = startIndex; i <= upToIndex; i++) {
                    sum += (long) map.get(nums[i]) * nums[i];
                }
                if (upToIndex == nums.length - 1) {
                    return true;
                }
                startIndex = upToIndex + 1;
                upToIndex = binarySearch(sum, nums, startIndex, nums.length - 1);
                if (startIndex > upToIndex) {
                    return false;
                }
            }
            return true;
        }

        private int binarySearch(long sum, int[] nums, int left, int right) {
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] < sum) {
                    left = mid + 1;
                } else if (nums[mid] > sum) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            }
            return right < nums.length && nums[right] <= sum ? right : left - 1;
        }
    }
}
