package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3005 {
    public static class Solution1 {
        public int maxFrequencyElements(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int maxFreq = 0;
            for (int key : map.keySet()) {
                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                }
            }
            int result = 0;
            for (int key : map.keySet()) {
                if (map.get(key) == maxFreq) {
                    result += map.get(key);
                }
            }
            return result;
        }
    }
}
