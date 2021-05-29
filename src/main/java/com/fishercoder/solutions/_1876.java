package com.fishercoder.solutions;

public class _1876 {
    public static class Solution1 {
        public int countGoodSubstrings(String s) {
            int count = 0;
            for (int i = 0; i < s.length() - 2; i++) {
                String candidate = s.substring(i, i + 3);
                if (candidate.charAt(0) != candidate.charAt(1) && candidate.charAt(0) != candidate.charAt(2) && candidate.charAt(1) != candidate.charAt(2)) {
                    count++;
                }
            }
            return count;
        }
    }
}
