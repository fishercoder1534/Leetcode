package com.fishercoder.solutions.thirdthousand;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _2586 {
    public static class Solution1 {
        public int vowelStrings(String[] words, int left, int right) {
            int count = 0;
            for (int i = left; i <= right; i++) {
                if (isVowelString(words[i])) {
                    count++;
                }
            }
            return count;
        }

        private boolean isVowelString(String word) {
            Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            if (set.contains(word.charAt(0)) && set.contains(word.charAt(word.length() - 1))) {
                return true;
            }
            return false;
        }
    }
}
