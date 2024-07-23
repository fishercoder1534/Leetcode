package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.Arrays;
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

    public static class Solution2 {

        public int[] frequencySort(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int[][] pairs = new int[map.size()][2];
            int i = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                pairs[i][0] = entry.getKey();
                pairs[i++][1] = entry.getValue();
            }
            Arrays.sort(pairs, (a, b) -> a[1] != b[1] ? a[1] - b[1] : b[0] - a[0]);
            int[] result = new int[nums.length];
            i = 0;
            for (int[] pair : pairs) {
                int count = pair[1];
                while (count-- > 0) {
                    result[i++] = pair[0];
                }
            }
            return result;
        }
    }
}
