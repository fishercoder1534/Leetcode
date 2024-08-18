package com.fishercoder.solutions.secondthousand;

import java.util.HashSet;
import java.util.Set;

public class _1062 {
    public static class Solution1 {
        /*
         * My completely original solution, although kind of brute-force, on 1/20/2022.
         * Two pointer technique:
         * j starts from the right, i starts from the left,
         * as soon as we are able to find a repeated substring, we return.
         */
        public int longestRepeatingSubstring(String s) {
            Set<String> seen = new HashSet<>();
            for (int j = s.length() - 1; j > 0; j--) {
                for (int i = 0; i + j <= s.length(); i++) {
                    if (!seen.add(s.substring(i, i + j))) {
                        return j;
                    }
                }
                seen.clear();
            }
            return 0;
        }
    }
}
