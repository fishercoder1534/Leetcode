package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _3046 {
    public static class Solution1 {
        public boolean isPossibleToSplit(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                if (map.get(num) > 2) {
                    return false;
                }
            }
            return true;
        }
    }
}
