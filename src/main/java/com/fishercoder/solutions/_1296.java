package com.fishercoder.solutions;

import java.util.TreeMap;

public class _1296 {
    public static class Solution1 {
        public boolean isPossibleDivide(int[] nums, int k) {
            if (nums.length % k != 0) {
                return false;
            }
            TreeMap<Integer, Integer> treeMap = new TreeMap();
            int min = nums[0];
            for (int num : nums) {
                treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
                min = Math.min(min, num);
            }
            while (!treeMap.isEmpty()) {
                if (!isConsecutiveK(treeMap, min, k)) {
                    return false;
                }
                min = findNextMin(treeMap);
                if (min == Integer.MIN_VALUE) {
                    break;
                }
            }
            return true;
        }

        private int findNextMin(TreeMap<Integer, Integer> treeMap) {
            return treeMap.isEmpty() ? Integer.MIN_VALUE : treeMap.entrySet().iterator().next().getKey();
        }

        private boolean isConsecutiveK(TreeMap<Integer, Integer> treeMap, int min, int k) {
            int count = treeMap.get(min);
            treeMap.remove(min);
            for (int i = 1; i < k; i++) {
                int key = min + i;
                if (!treeMap.containsKey(key) || treeMap.get(key) < count) {
                    return false;
                } else if (treeMap.get(key) > count) {
                    treeMap.put(key, treeMap.get(key) - count);
                } else {
                    treeMap.remove(key);
                }
            }
            return true;
        }
    }
}
