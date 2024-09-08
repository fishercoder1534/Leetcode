package com.fishercoder.solutions.thirdthousand;

import java.util.HashMap;
import java.util.Map;

public class _2341 {
    public static class Solution1 {
        public int[] numberOfPairs(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int pairs = 0;
            int leftover = 0;
            for (int key : map.keySet()) {
                if (map.get(key) > 1) {
                    pairs += map.get(key) / 2;
                    leftover += map.get(key) % 2;
                } else {
                    leftover++;
                }
            }
            return new int[] {pairs, leftover};
        }
    }
}
