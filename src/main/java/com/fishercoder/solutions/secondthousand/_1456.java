package com.fishercoder.solutions.secondthousand;

import java.util.HashSet;
import java.util.Set;

public class _1456 {
    public static class Solution1 {
        public int maxVowels(String s, int k) {
            Set<Character> set = new HashSet<>();
            set.add('a');
            set.add('e');
            set.add('i');
            set.add('o');
            set.add('u');
            int max = Integer.MIN_VALUE;
            int i = 0;
            int vowels = 0;
            for (; i < k; i++) {
                if (set.contains(s.charAt(i))) {
                    vowels++;
                }
            }
            max = Math.max(max, vowels);
            for (; i < s.length(); i++) {
                if (set.contains(s.charAt(i))) {
                    vowels++;
                }
                if (set.contains(s.charAt(i - k))) {
                    vowels--;
                }
                max = Math.max(max, vowels);
            }
            return max;
        }
    }
}
