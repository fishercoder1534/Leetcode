package com.fishercoder.solutions;

public class _2185 {
    public static class Solution1 {
        public int prefixCount(String[] words, String pref) {
            int count = 0;
            for (String word : words) {
                if (word.startsWith(pref)) {
                    count++;
                }
            }
            return count;
        }
    }
}
