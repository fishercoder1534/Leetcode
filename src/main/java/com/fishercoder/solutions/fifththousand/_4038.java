package com.fishercoder.solutions.fifththousand;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _4038 {
    public static class Solution1 {
        public int countSpecialIntegers(int[] nums) {
            int count = 0;
            Map<Integer, Integer> countMap = new HashMap<>();
            for (int num : nums) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
            Map<Integer, int[]> indexMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int[] index = indexMap.getOrDefault(nums[i], new int[] {nums.length - 1, 0});
                index[0] = Math.min(index[0], i);
                index[1] = Math.max(index[1], i);
                indexMap.put(nums[i], index);
            }
            Set<Integer> visited = new HashSet<>();
            for (int key : countMap.keySet()) {
                if (visited.add(key)) {
                    int[] index = indexMap.get(key);
                    if (index[1] - index[0] + 1 == countMap.get(key)) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
