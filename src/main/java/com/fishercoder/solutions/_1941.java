package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _1941 {
    public static class Solution {
        public boolean areOccurrencesEqual(String s) {
            int[] counts = new int[26];
            char[] charArray = s.toCharArray();
            for (char c : charArray) {
                counts[c - 'a']++;
            }
            return Arrays.stream(counts).filter(i -> i != 0).boxed().collect(Collectors.toSet()).size() == 1;
        }
    }
}
