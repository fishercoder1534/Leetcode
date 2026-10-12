package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _3692 {
    public static class Solution1 {
        public String majorityFrequencyGroup(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            Map<Integer, Set<Character>> groups = new HashMap<>();
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                Set set = groups.getOrDefault(entry.getValue(), new HashSet());
                set.add(entry.getKey());
                groups.put(entry.getValue(), set);
            }
            Set<Character> set = new HashSet<>();
            int freq = 0;
            for (Map.Entry<Integer, Set<Character>> entry : groups.entrySet()) {
                if (entry.getValue().size() > set.size()) {
                    set.clear();
                    set.addAll(entry.getValue());
                    freq = entry.getKey();
                } else if (entry.getValue().size() == set.size()) {
                    if (entry.getKey() > freq) {
                        set.clear();
                        set.addAll(entry.getValue());
                        freq = entry.getKey();
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (Character c : set) {
                sb.append(c);
            }
            return sb.toString();
        }
    }
}
