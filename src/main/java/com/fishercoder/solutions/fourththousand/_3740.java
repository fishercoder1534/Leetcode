package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _3740 {
    public static class Solution1 {
        public int minimumDistance(int[] nums) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                List<Integer> list = map.getOrDefault(nums[i], new ArrayList<>());
                list.add(i);
                map.put(nums[i], list);
            }
            int minDistance = Integer.MAX_VALUE;
            for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
                List<Integer> list = entry.getValue();
                if (list.size() >= 3) {
                    for (int i = 0; i < list.size() - 2; i++) {
                        for (int j = i + 1; j < list.size() - 1; j++) {
                            for (int k = j + 1; k < list.size(); k++) {
                                int distance = list.get(k) - list.get(i) + (list.get(k) - list.get(j)) + (list.get(j) - list.get(i));
                                minDistance = Math.min(minDistance, distance);
                            }
                        }
                    }
                }
            }
            return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
        }
    }
}
