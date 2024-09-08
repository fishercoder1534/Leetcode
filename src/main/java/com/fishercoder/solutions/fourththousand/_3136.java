package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _3136 {
    public static class Solution1 {
        public boolean isValid(String word) {
            if (word.length() < 3) {
                return false;
            }
            Set<Character> vowels =
                    new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
            boolean containsVowel = false;
            boolean containsConsonant = false;
            for (char c : word.toCharArray()) {
                if (vowels.contains(c)) {
                    containsVowel = true;
                } else if (Character.isAlphabetic(c)) {
                    containsConsonant = true;
                } else if (!Character.isDigit(c)) {
                    return false;
                }
            }
            return containsVowel && containsConsonant;
        }
    }
}
