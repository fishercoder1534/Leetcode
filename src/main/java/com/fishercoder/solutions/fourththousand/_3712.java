package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3712 {
    public static class Solution1 {
        public int sumDivisibleByK(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int sum = 0;
            for (int key : map.keySet()) {
                if (map.get(key) % k == 0) {
                    sum += map.get(key) * key;
                }
            }
            return sum;
        }
    }
}
