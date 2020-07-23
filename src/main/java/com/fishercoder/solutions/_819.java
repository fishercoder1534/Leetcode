package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _819 {
    public static class Solution1 {
        public String mostCommonWord(String paragraph, String[] banned) {
            Set<String> bannedSet = new HashSet(Arrays.asList(banned));
            String[] words = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
            Map<String, Integer> map = new HashMap<>();
            Arrays.stream(words)
                    .filter(word -> !bannedSet.contains(word))
                    .forEach(word -> map.put(word, map.getOrDefault(word, 0) + 1));
            String result = "";
            int freq = 0;
            for (String key : map.keySet()) {
                if (map.get(key) > freq) {
                    result = key;
                    freq = map.get(key);
                }
            }
            return result;
        }
    }
}
