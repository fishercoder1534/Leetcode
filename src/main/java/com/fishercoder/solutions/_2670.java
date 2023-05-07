package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _2670 {
    public static class Solution1 {
        public int[] distinctDifferenceArray(int[] nums) {
            Map<Integer, Integer> prefix = new HashMap<>();
            prefix.put(nums[0], 1);
            Map<Integer, Integer> suffix = new HashMap<>();
            for (int i = 1; i < nums.length; i++) {
                suffix.put(nums[i], suffix.getOrDefault(nums[i], 0) + 1);
            }
            int[] result = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                result[i] = prefix.size() - suffix.size();
                if (i + 1 < nums.length) {
                    prefix.put(nums[i + 1], prefix.getOrDefault(nums[i + 1], 0) + 1);
                    if (suffix.containsKey(nums[i + 1]) && suffix.get(nums[i + 1]) == 1) {
                        suffix.remove(nums[i + 1]);
                    } else {
                        suffix.put(nums[i + 1], suffix.getOrDefault(nums[i + 1], 0) - 1);
                    }
                }
            }
            return result;
        }
    }
}
