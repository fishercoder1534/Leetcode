package com.fishercoder.solutions.fourththousand;

import java.util.HashSet;
import java.util.Set;

public class _3803 {
    public static class Solution1 {
        public int residuePrefixes(String s) {
            int count = 0;
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
                if (s.substring(0, i + 1).length() % 3 == set.size()) {
                    count++;
                }
            }
            return count;
        }
    }
}
