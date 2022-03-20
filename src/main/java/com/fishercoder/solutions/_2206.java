package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _2206 {
    public static class Solution1 {
        public boolean divideArray(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (int key : map.keySet()) {
                if (map.get(key) % 2 != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
