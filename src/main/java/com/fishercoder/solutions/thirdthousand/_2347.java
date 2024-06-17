package com.fishercoder.solutions.thirdthousand;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _2347 {
    public static class Solution1 {
        public String bestHand(int[] ranks, char[] suits) {
            Set<Character> set = new HashSet<>();
            for (char c : suits) {
                set.add(c);
            }
            if (set.size() == 1) {
                return "Flush";
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int i : ranks) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() >= 3) {
                    return "Three of a Kind";
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 2) {
                    return "Pair";
                }
            }
            return "High Card";
        }
    }
}
