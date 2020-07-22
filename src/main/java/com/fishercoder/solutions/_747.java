package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _747 {

    public static class Solution1 {
        public int dominantIndex(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            int max;
            int secondMax;
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            Arrays.sort(nums);
            max = nums[nums.length - 1];
            secondMax = nums[nums.length - 2];
            if (max >= 2 * secondMax) {
                return map.get(max);
            } else {
                return -1;
            }
        }
    }

    public static class Solution2 {
        public int dominantIndex(int[] nums) {
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    maxIndex = i;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] * 2 > max && i != maxIndex) {
                    return -1;
                }
            }
            return maxIndex;
        }
    }
}
