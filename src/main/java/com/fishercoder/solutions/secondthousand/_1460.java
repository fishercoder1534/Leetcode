package com.fishercoder.solutions.secondthousand;

import java.util.HashMap;
import java.util.Map;

public class _1460 {
    public static class Solution1 {
        public boolean canBeEqual(int[] target, int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : target) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) - 1);
            }
            for (int key : map.keySet()) {
                if (map.get(key) != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
