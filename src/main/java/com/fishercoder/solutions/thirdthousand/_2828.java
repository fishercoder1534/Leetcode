package com.fishercoder.solutions.thirdthousand;

import java.util.List;

public class _2828 {
    public static class Solution1 {
        public boolean isAcronym(List<String> words, String s) {
            if (words.size() != s.length()) {
                return false;
            }
            int i = 0;
            for (String word : words) {
                if (word.charAt(0) != s.charAt(i++)) {
                    return false;
                }
            }
            return true;
        }
    }
}
