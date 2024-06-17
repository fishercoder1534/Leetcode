package com.fishercoder.solutions.thirdthousand;

import java.util.HashSet;
import java.util.Set;

public class _2716 {
    public static class Solution1 {
        public int minimizedStringLength(String s) {
            StringBuilder sb = new StringBuilder();
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                if (set.add(s.charAt(i))) {
                    sb.append(s.charAt(i));
                }
            }
            return sb.length();
        }
    }
}
