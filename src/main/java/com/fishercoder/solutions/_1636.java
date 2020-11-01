package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class _1636 {
    public static class Solution1 {
        public int[] frequencySort(int[] nums) {
            Map<Integer, Integer> count = new HashMap<>();
            for (int num : nums) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }
            TreeMap<Integer, List<Integer>> map = new TreeMap<>();
            for (int num : count.keySet()) {
                int freq = count.get(num);
                if (!map.containsKey(freq)) {
                    map.put(freq, new ArrayList<>());
                }
                List<Integer> list = map.get(freq);
                list.add(num);
                map.put(freq, list);
            }
            int[] result = new int[nums.length];
            int i = 0;
            for (int num : map.keySet()) {
                List<Integer> list = map.get(num);
                Collections.sort(list, Collections.reverseOrder());
                int k = num;
                for (int j = 0; j < list.size(); j++, k = num) {
                    while (k-- > 0) {
                        result[i++] = list.get(j);
                    }
                }
            }
            return result;
        }
    }
}
