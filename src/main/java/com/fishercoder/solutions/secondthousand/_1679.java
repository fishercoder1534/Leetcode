package com.fishercoder.solutions.secondthousand;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1679 {
    public static class Solution1 {
        public int maxOperations(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            int ops = 0;
            for (int num : nums) {
                if (map.containsKey(k - num)) {
                    map.put(k - num, map.get(k - num) - 1);
                    ops++;
                    if (map.get(k - num) == 0) {
                        map.remove(k - num);
                    }
                } else {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
            }
            return ops;
        }
    }

    public static class Solution2 {
        public int maxOperations(int[] nums, int k) {
            int ops = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            Set<Integer> visited = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] + nums[i] == k) {
                    int count = map.get(nums[i]);
                    ops += count / 2;
                    map.put(nums[i], map.get(nums[i]) - (count / 2) * 2);
                    visited.add(nums[i]);
                }
                if (visited.add(nums[i])) {
                    if (map.containsKey(k - nums[i])) {
                        int keyCount = map.get(nums[i]);
                        int valueCount = map.get(k - nums[i]);
                        int min = Math.min(keyCount, valueCount);
                        ops += min;
                        map.put(nums[i], map.get(nums[i]) - min);
                        map.put(k - nums[i], map.get(k - nums[i]) - min);
                    }
                }
            }
            return ops;
        }
    }
}
