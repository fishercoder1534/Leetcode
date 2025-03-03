package com.fishercoder.solutions.fourththousand;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class _3471 {
    public static class Solution1 {
        public int largestInteger(int[] nums, int k) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int num : nums) {
                map.put(num, 0);
            }
            for (int i = 0; i <= nums.length - k; i++) {
                Set<Integer> set = new HashSet<>();
                for (int j = i; j < i + k; j++) {
                    if (set.add(nums[j])) {
                        map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
                    }
                }
            }
            int ans = -1;
            for (int key : map.keySet()) {
                if (map.get(key) == 1) {
                    ans = key;
                }
            }
            return ans;
        }
    }
}
