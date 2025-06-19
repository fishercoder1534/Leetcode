package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _3450 {
    public static class Solution1 {
        public int maxStudentsOnBench(int[][] students) {
            Map<Integer, Set<Integer>> map = new HashMap<>();
            for (int[] student : students) {
                Set<Integer> set = map.getOrDefault(student[1], new HashSet<>());
                set.add(student[0]);
                map.put(student[1], set);
            }
            int result = 0;
            for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
                result = Math.max(result, entry.getValue().size());
            }
            return result;
        }
    }
}
