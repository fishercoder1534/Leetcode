package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3866 {
    public static class Solution1 {
        public int firstUniqueEven(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (int num : nums) {
                if (map.get(num) == 1 && num % 2 == 0) {
                    return num;
                }
            }
            return -1;
        }
    }
}
