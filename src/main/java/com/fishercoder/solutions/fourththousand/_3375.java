package com.fishercoder.solutions.fourththousand;

import java.util.TreeMap;

public class _3375 {
    public static class Solution1 {
        public int minOperations(int[] nums, int k) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            if (map.firstKey() < k) {
                return -1;
            }
            if (map.firstKey() == k) {
                return map.size() - 1;
            }
            return map.size();
        }
    }
}
