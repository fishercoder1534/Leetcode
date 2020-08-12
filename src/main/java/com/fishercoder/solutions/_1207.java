package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1207 {
    public static class Solution1 {
        public boolean uniqueOccurrences(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            Arrays.stream(arr).forEach(num -> {
                map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
            });
            Set<Integer> set = new HashSet<>();
            return map.keySet().stream().mapToInt(key -> key).allMatch(key -> set.add(map.get(key)));
        }
    }
}
