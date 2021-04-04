package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class _1817 {
    public static class Solution1 {
        public int[] findingUsersActiveMinutes(int[][] logs, int k) {
            Map<Integer, Set<Integer>> map = new HashMap<>();
            for (int[] log : logs) {
                int user = log[0];
                if (!map.containsKey(user)) {
                    map.put(user, new HashSet<>());
                }
                Set<Integer> set = map.get(user);
                set.add(log[1]);
            }
            int[] result = new int[k];
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            for (int key : map.keySet()) {
                int uam = map.get(key).size();
                treeMap.put(uam, treeMap.getOrDefault(uam, 0) + 1);
            }
            for (int key : treeMap.keySet()) {
                result[key - 1] = treeMap.get(key);
            }
            return result;
        }
    }
}
