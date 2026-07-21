package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3978 {
    public static class Solution1 {
        public boolean isMiddleElementUnique(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            return map.get(nums[(nums.length - 1) / 2]) == 1;
        }
    }
}
