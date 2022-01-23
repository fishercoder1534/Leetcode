package com.fishercoder.solutions;

import java.util.TreeMap;

public class _2148 {
    public static class Solution1 {
        public int countElements(int[] nums) {
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            for (int num : nums) {
                treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
            }
            int ans = 0;
            int i = 0;
            int len = treeMap.size();
            for (int key : treeMap.keySet()) {
                if (i != 0 && i != len - 1) {
                    ans += treeMap.get(key);
                }
                i++;
            }
            return ans;
        }
    }
}
