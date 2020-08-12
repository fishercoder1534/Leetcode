package com.fishercoder.solutions;

import java.util.TreeMap;

public class _1133 {
    public static class Solution1 {
        public int largestUniqueNumber(int[] A) {
            TreeMap<Integer, Integer> treeMap = new TreeMap<>((a, b) -> b - a);
            for (int num : A) {
                treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
            }
            for (int key : treeMap.keySet()) {
                if (treeMap.get(key) == 1) {
                    return key;
                }
            }
            return -1;
        }
    }

    public static class Solution2 {
        public int largestUniqueNumber(int[] A) {
            int[] count = new int[1001];
            for (int num : A) {
                count[num]++;
            }
            for (int i = 1000; i >= 0; i--) {
                if (count[i] == 1) {
                    return i;
                }
            }
            return -1;
        }
    }
}
