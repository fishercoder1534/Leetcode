package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1356 {
    public static class Solution1 {
        public int[] sortByBits(int[] arr) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int num : arr) {
                int count = Integer.bitCount(num);
                if (!map.containsKey(count)) {
                    map.put(count, new ArrayList<>());
                }
                map.get(count).add(num);
            }
            int[] result = new int[arr.length];
            int i = 0;
            for (int count : map.keySet()) {
                List<Integer> list = map.get(count);
                Collections.sort(list);
                for (int num : list) {
                    result[i++] = num;
                }
            }
            return result;
        }
    }
}
