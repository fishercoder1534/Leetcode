package com.fishercoder.solutions.fourththousand;

import java.util.Set;

public class _3856 {
    public static class Solution1 {
        public String trimTrailingVowels(String s) {
            Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
            StringBuilder sb = new StringBuilder();
            int i = s.length() - 1;
            for (; i >= 0; i--) {
                if (!vowels.contains(s.charAt(i))) {
                    return s.substring(0, i + 1);
                }
            }
            return sb.toString();
        }
    }
}
