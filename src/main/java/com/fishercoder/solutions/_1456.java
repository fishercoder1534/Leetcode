package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1456 {
    public static class Solution1 {
        public int maxVowels(String s, int k) {
            Map<Character, Integer> vowels = new HashMap<>();
            Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            int left = 0;
            for (; left < k; left++) {
                if (set.contains(s.charAt(left))) {
                    vowels.put(s.charAt(left), vowels.getOrDefault(s.charAt(left), 0) + 1);
                }
            }
            int max = 0;
            for (char c : vowels.keySet()) {
                max += vowels.get(c);
            }
            int right = left;
            left = 0;
            for (; right < s.length(); right++, left++) {
                char leftChar = s.charAt(left);
                if (set.contains(leftChar) && vowels.containsKey(leftChar) && vowels.get(leftChar) > 0) {
                    vowels.put(leftChar, vowels.get(leftChar) - 1);
                }
                char rightChar = s.charAt(right);
                if (set.contains(rightChar)) {
                    vowels.put(rightChar, vowels.getOrDefault(rightChar, 0) + 1);
                }
                int thisMax = 0;
                for (char c : vowels.keySet()) {
                    thisMax += vowels.get(c);
                }
                max = Math.max(max, thisMax);
            }
            return max;
        }
    }
}
