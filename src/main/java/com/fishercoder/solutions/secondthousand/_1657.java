package com.fishercoder.solutions.secondthousand;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _1657 {
    public static class Solution1 {
        public boolean closeStrings(String word1, String word2) {
            int[] count1 = new int[26];
            int[] count2 = new int[26];
            Set<Character> set1 = new HashSet<>();
            Set<Character> set2 = new HashSet<>();
            for (char c : word1.toCharArray()) {
                count1[c - 'a']++;
                set1.add(c);
            }
            Arrays.sort(count1);
            for (char c : word2.toCharArray()) {
                count2[c - 'a']++;
                set2.add(c);
            }
            Arrays.sort(count2);
            return set1.equals(set2) && Arrays.equals(count1, count2);
        }
    }
}
