package com.fishercoder.solutions.thirdthousand;

import java.util.HashSet;
import java.util.Set;

public class _2351 {
    public static class Solution1 {
        public char repeatedCharacter(String s) {
            Set<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                if (!set.add(c)) {
                    return c;
                }
            }
            return ' ';
        }
    }
}
