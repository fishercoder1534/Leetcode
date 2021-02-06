package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1748 {
    public static class Solution1 {
        public int sumOfUnique(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            int sum = 0;
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (int num : map.keySet()) {
                if (map.get(num) == 1) {
                    sum += num;
                }
            }
            return sum;
        }
    }
}
