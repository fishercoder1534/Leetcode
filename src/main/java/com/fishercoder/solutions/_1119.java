package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _1119 {
    public static class Solution1 {
        public String removeVowels(String S) {
            Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : S.toCharArray()) {
                if (!vowels.contains(c)) {
                    stringBuilder.append(c);
                }
            }
            return stringBuilder.toString();
        }
    }

    public static class Solution2 {
        public String removeVowels(String S) {
            return S.replaceAll("[aeiou]", "");
        }
    }
}
