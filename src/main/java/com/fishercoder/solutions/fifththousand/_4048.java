package com.fishercoder.solutions.fifththousand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _4048 {
    public static class Solution1 {
        public int countSpecialIntegers(int[] nums) {
            int count = 0;
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                List<Integer> list = map.getOrDefault(nums[i], new ArrayList<>());
                list.add(i);
                map.put(nums[i], list);
            }
            for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
                if (entry.getValue().size() == 3) {
                    List<Integer> list = entry.getValue();
                    if (list.get(1) - list.get(0) == list.get(2) - list.get(1)) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
