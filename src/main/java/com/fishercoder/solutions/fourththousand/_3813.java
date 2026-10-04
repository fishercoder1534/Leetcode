package com.fishercoder.solutions.fourththousand;

import java.util.HashSet;
import java.util.Set;

public class _3813 {
    public static class Solution1 {
        public int vowelConsonantScore(String s) {
            Set<Character> vowels = new HashSet<>();
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');
            int vowelsCount = 0;
            int consonantCount = 0;
            for (char c : s.toCharArray()) {
                if (vowels.contains(c)) {
                    vowelsCount++;
                } else if (Character.isAlphabetic(c)) {
                    consonantCount++;
                }
            }
            return consonantCount != 0 ? Math.floorDiv(vowelsCount, consonantCount) : 0;
        }
    }
}
