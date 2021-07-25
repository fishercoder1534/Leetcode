package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _1941 {
    public static class Solution {
        public boolean areOccurrencesEqual(String s) {
            int[] counts = new int[26];
            for (char c : s.toCharArray()) {
                counts[c - 'a']++;
            }
            Set<Integer> set = new HashSet<>();
            for (int i : counts) {
                if (i != 0) {
                    set.add(i);
                }
            }
            return set.size() == 1;
        }
    }
}
