package com.fishercoder.solutions.fourththousand;

import java.util.*;

public class _3852 {
    public static class Solution1 {
        public int[] minDistinctFreqPair(int[] nums) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            List<Integer> sortedKeys = new ArrayList<>(map.keySet());
            for (int i = 0; i < sortedKeys.size() - 1; i++) {
                for (int j = i + 1; j < sortedKeys.size(); j++) {
                    if (map.get(sortedKeys.get(i)) != map.get(sortedKeys.get(j))) {
                        return new int[]{sortedKeys.get(i), sortedKeys.get(j)};
                    }
                }
            }
            return new int[]{-1, -1};
        }
    }
}
