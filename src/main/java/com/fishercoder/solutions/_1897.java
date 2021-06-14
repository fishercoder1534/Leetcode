package com.fishercoder.solutions;

public class _1897 {
    public static class Solution1 {
        public boolean makeEqual(String[] words) {
            int len = words.length;
            int[] counts = new int[26];
            for (String word : words) {
                for (char c : word.toCharArray()) {
                    counts[c - 'a']++;
                }
            }
            for (int c : counts) {
                if (c % len != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
