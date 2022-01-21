package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _1062 {
    public static class Solution1 {
        /**
         * My completely original, although brute-force solution, on 1/20/2022.
         */
        public int longestRepeatingSubstring(String s) {
            Set<String> seen = new HashSet<>();
            for (int j = s.length() - 1; j > 0; j--) {
                int len = j;
                for (int i = 0; i <= s.length() - j; i++) {
                    if (!seen.add(s.substring(i, i + len))) {
                        return len;
                    }
                }
                seen.clear();
            }
            return 0;
        }
    }
}
