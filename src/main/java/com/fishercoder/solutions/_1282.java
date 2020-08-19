package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1282 {
    public static class Solution1 {
        public List<List<Integer>> groupThePeople(int[] groupSizes) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < groupSizes.length; i++) {
                List<Integer> list = map.getOrDefault(groupSizes[i], new ArrayList<>());
                list.add(i);
                map.put(groupSizes[i], list);
            }
            List<List<Integer>> result = new ArrayList<>();
            for (int key : map.keySet()) {
                List<Integer> list = map.get(key);
                int i = 0;
                do {
                    result.add(list.subList(i, i + key));
                    i += key;
                } while (i + key <= list.size());
            }
            return result;
        }
    }
}
