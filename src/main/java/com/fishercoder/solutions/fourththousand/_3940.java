package com.fishercoder.solutions.fourththousand;

import java.util.*;

public class _3940 {
    public static class Solution1 {
        public int[] limitOccurrences(int[] nums, int k) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            List<Integer> list = new ArrayList<>();
            for (int key : map.keySet()) {
                for (int i = 0; i < Math.min(k, map.get(key)); i++) {
                    list.add(key);
                }
            }
            return list.stream().mapToInt(i -> i).toArray();
        }
    }
}
