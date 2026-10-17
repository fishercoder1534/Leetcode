package com.fishercoder.solutions.fourththousand;

import java.util.*;

public class _3541 {
    public static class Solution1 {
        public int maxFreqSum(String s) {
            Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            Map<Character, Integer> vowelMap = new HashMap<>();
            Map<Character, Integer> consonantMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                if (set.contains(c)) {
                    vowelMap.put(c, vowelMap.getOrDefault(c, 0) + 1);
                } else {
                    consonantMap.put(c, consonantMap.getOrDefault(c, 0) + 1);
                }
            }
            int maxV = 0;
            for (Map.Entry<Character, Integer> entry : vowelMap.entrySet()) {
                maxV = Math.max(maxV, entry.getValue());
            }
            int maxCon = 0;
            for (Map.Entry<Character, Integer> entry : consonantMap.entrySet()) {
                maxCon = Math.max(maxCon, entry.getValue());
            }
            return maxV + maxCon;
        }
    }
}
