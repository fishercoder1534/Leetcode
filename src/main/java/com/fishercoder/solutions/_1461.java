package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _1461 {
    public static class Solution1 {
        /**
         * inspired by https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/discuss/660505/Java-4-lines-solution
         */
        public boolean hasAllCodes(String s, int k) {
            Set<String> set = new HashSet<>();
            for (int i = 0; i <= s.length() - k; i++) {
                set.add(s.substring(i, i + k));
            }
            return set.size() == 1 << k;
        }
    }
}
