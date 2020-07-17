package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _594 {
    public static class Solution1 {
        public int findLHS(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i] + 1)) {
                    max = Math.max(max, map.get(nums[i]) + map.get(nums[i] + 1));
                }
            }
            return max;
        }
    }
}
