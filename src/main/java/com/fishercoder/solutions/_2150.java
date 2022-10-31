package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class _2150 {
    public static class Solution1 {
        public List<Integer> findLonely(int[] nums) {
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            for (int num : nums) {
                treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
            }
            List<Integer> ans = new ArrayList<>();
            for (int key : treeMap.keySet()) {
                if (treeMap.get(key) > 1) {
                    continue;
                } else {
                    if (!treeMap.containsKey(key - 1) && !treeMap.containsKey(key + 1)) {
                        ans.add(key);
                    }
                }
            }
            return ans;
        }
    }
}
