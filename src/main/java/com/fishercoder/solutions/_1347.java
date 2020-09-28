package com.fishercoder.solutions;

import java.util.Arrays;

public class _1347 {
    public static class Solution1 {
        public int minSteps(String s, String t) {
            int[] counts = new int[26];
            for (char c : s.toCharArray()) {
                counts[c - 'a']++;
            }
            for (char c : t.toCharArray()) {
                if (counts[c - 'a'] > 0) {
                    counts[c - 'a']--;
                }
            }
            return Arrays.stream(counts).sum();
        }
    }
}
