package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _187 {
    public static class Solution1 {
        public List<String> findRepeatedDnaSequences(String s) {
            Map<String, Integer> map = new HashMap();
            for (int i = 0; i < s.length() - 9; i++) {
                String sequence = s.substring(i, i + 10);
                map.put(sequence, map.getOrDefault(sequence, 0) + 1);
            }
            List<String> repeatedSequences = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    repeatedSequences.add(entry.getKey());
                }
            }
            return repeatedSequences;
        }
    }
}
