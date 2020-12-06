package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

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
}
