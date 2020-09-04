package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1297 {
    public static class Solution1 {
        public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
            int maxFreq = 0;
            for (int size = minSize; size <= maxSize; size++) {
                maxFreq = Math.max(maxFreq, getMaxFreqWithThisSize(s, maxLetters, size));
            }
            return maxFreq;
        }

        private int getMaxFreqWithThisSize(String str, int maxLetters, int size) {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i <= str.length() - size; i++) {
                String substring = str.substring(i, i + size);
                Set<Character> set = new HashSet<>();
                for (int j = 0; j < substring.length(); j++) {
                    set.add(substring.charAt(j));
                    if (set.size() > maxLetters) {
                        break;
                    }
                }
                if (set.size() <= maxLetters) {
                    map.put(substring, map.getOrDefault(substring, 0) + 1);
                }
            }
            int max = 0;
            for (String key : map.keySet()) {
                max = Math.max(max, map.get(key));
            }
            return max;
        }
    }
}
