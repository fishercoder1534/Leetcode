package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2451 {
    public static class Solution1 {
        public String oddString(String[] words) {
            Map<List<Integer>, List<String>> map = new HashMap<>();
            for (String word : words) {
                List<Integer> diffs = computeDiff(word);
                List<String> list = map.getOrDefault(diffs, new ArrayList<>());
                list.add(word);
                map.put(diffs, list);
            }
            for (Map.Entry<List<Integer>, List<String>> entry : map.entrySet()) {
                if (entry.getValue().size() == 1) {
                    return entry.getValue().get(0);
                }
            }
            return null;
        }

        private List<Integer> computeDiff(String word) {
            List<Integer> diffs = new ArrayList<>();
            for (int i = 0; i < word.length() - 1; i++) {
                diffs.add(word.charAt(i + 1) - word.charAt(i));
            }
            return diffs;
        }
    }
}
