package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class _1743 {
    public static class Solution1 {
        public int[] restoreArray(int[][] adjacentPairs) {
            Map<Integer, Integer> map = new HashMap<>();
            Map<Integer, List<Integer>> map2 = new HashMap<>();
            for (int[] pair : adjacentPairs) {
                int num1 = pair[0];
                int num2 = pair[1];
                map.put(num1, map.getOrDefault(num1, 0) + 1);
                map.put(num2, map.getOrDefault(num2, 0) + 1);
                if (!map2.containsKey(num1)) {
                    map2.put(num1, new ArrayList<>());
                }
                map2.get(num1).add(num2);
                if (!map2.containsKey(num2)) {
                    map2.put(num2, new ArrayList<>());
                }
                map2.get(num2).add(num1);
            }
            int first = Integer.MAX_VALUE;
            for (int key : map.keySet()) {
                if (map.get(key) == 1) {
                    first = key;
                    break;
                }
            }
            int[] original = new int[map.size()];
            Set<Integer> set = new HashSet<>();
            original[0] = first;
            set.add(first);
            for (int i = 1; i < map.size(); i++) {
                int prev = original[i - 1];
                List<Integer> connected = map2.get(prev);
                for (int conn : connected) {
                    if (set.add(conn)) {
                        original[i] = conn;
                        break;
                    }
                }
            }
            return original;
        }
    }
}
