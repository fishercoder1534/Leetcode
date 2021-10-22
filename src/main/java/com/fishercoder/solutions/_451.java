package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class _451 {

    public static class Solution1 {
        public String frequencySort(String s) {
            Map<Character, Integer> map = new HashMap();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, (o1, o2) -> (o2.getValue() - o1.getValue()));
            StringBuilder stringBuilder = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : list) {
                for (int i = 0; i < entry.getValue(); i++) {
                    stringBuilder.append(entry.getKey());
                }
            }
            return stringBuilder.toString();
        }
    }

    public static class Solution2 {
        public String frequencySort(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            TreeMap<Integer, List<Character>> reverseMap = new TreeMap<>(Collections.reverseOrder());
            for (char c : map.keySet()) {
                int freq = map.get(c);
                if (!reverseMap.containsKey(freq)) {
                    reverseMap.put(freq, new ArrayList<>());
                }
                reverseMap.get(freq).add(c);
            }
            StringBuilder sb = new StringBuilder();
            for (int freq : reverseMap.keySet()) {
                List<Character> list = reverseMap.get(freq);
                for (char c : list) {
                    for (int i = 0; i < freq; i++) {
                        sb.append(c);
                    }
                }
            }
            return sb.toString();
        }
    }
}
