package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _2287 {
    public static class Solution1 {
        public int rearrangeCharacters(String s, String target) {
            Map<Character, Integer> targetMap = new HashMap<>();
            for (char c : target.toCharArray()) {
                targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
            }
            Map<Character, Integer> sMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                sMap.put(c, sMap.getOrDefault(c, 0) + 1);
            }
            int result = Integer.MAX_VALUE;
            for (char c : targetMap.keySet()) {
                int targetCount = targetMap.get(c);
                result = Math.min(result, sMap.getOrDefault(c, 0) / targetCount);
            }
            return result;
        }
    }
}
