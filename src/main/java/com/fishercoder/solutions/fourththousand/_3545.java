package com.fishercoder.solutions.fourththousand;

import java.util.*;

public class _3545 {
    public static class Solution1 {
        public int minDeletion(String s, int k) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            List<Integer> frequencies = new ArrayList<>();
            for (char c : map.keySet()) {
                frequencies.add(map.get(c));
            }
            if (frequencies.size() <= k) {
                return 0;
            }
            Collections.sort(frequencies);
            int deletions = 0;
            for (int i = 0; i < frequencies.size() && (frequencies.size() - i) > k; i++) {
                deletions += frequencies.get(i);
            }
            return deletions;
        }
    }
}
