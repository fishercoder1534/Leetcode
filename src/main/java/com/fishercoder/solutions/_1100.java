package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _1100 {
    public static class Solution1 {
        public int numKLenSubstrNoRepeats(String S, int K) {
            int count = 0;
            Set<Character> set = new HashSet<>();
            for (int i = 0; i <= S.length() - K; i++) {
                String string = S.substring(i, i + K);
                boolean invalid = false;
                for (char c : string.toCharArray()) {
                    if (!set.add(c)) {
                        invalid = true;
                        break;
                    }
                }
                count += invalid ? 0 : 1;
                set.clear();
            }
            return count;
        }
    }
}
