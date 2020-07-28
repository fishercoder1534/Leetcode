package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _884 {
    public static class Solution1 {
        public String[] uncommonFromSentences(String A, String B) {
            Map<String, Integer> map = new HashMap<>();
            for (String word : A.split(" ")) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }

            for (String word : B.split(" ")) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            List<String> result = new ArrayList<>();
            for (String key : map.keySet()) {
                if (map.get(key) == 1) {
                    result.add(key);
                }
            }
            String[] strs = new String[result.size()];
            result.toArray(strs);
            return strs;
        }
    }
}
