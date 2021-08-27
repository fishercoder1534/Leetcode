package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1726 {
    public static class Solution1 {
        public int tupleSameProduct(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            int count = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    int product = nums[i] * nums[j];
                    count += 8 * map.getOrDefault(product, 0);
                    map.put(product, map.getOrDefault(product, 0) + 1);
                }
            }
            return count;
        }
    }

    public static class Solution2 {
        public int tupleSameProduct(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    int product = nums[i] * nums[j];
                    map.put(product, map.getOrDefault(product, 0) + 1);
                }
            }
            int count = 0;
            for (int key : map.keySet()) {
                if (map.get(key) > 1) {
                    int freq = map.get(key);
                    count += (freq * (freq - 1) / 2) * 8;
                }
            }
            return count;
        }

    }
}
