package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3396 {
    public static class Solution1 {
        public int minimumOperations(int[] nums) {
            int ops = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int i = 0;
            while (!allDistinct(map)) {
                ops++;
                int target = i + 3;
                for (; i < target && i < nums.length; i++) {
                    map.put(nums[i], map.get(nums[i]) - 1);
                }
            }
            return ops;
        }

        private boolean allDistinct(Map<Integer, Integer> map) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    return false;
                }
            }
            return true;
        }
    }
}
