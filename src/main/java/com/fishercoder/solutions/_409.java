package com.fishercoder.solutions;

public class _409 {
    public static class Solution1 {
        public int longestPalindrome(String s) {
            int[] counts = new int[56];
            for (char c : s.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    counts[c - 'A' + 33]++;
                } else {
                    counts[c - 'a']++;
                }
            }
            boolean hasOdd = false;
            int len = 0;
            for (int i = 0; i < 56; i++) {
                if (counts[i] % 2 != 0) {
                    hasOdd = true;
                    if (counts[i] > 1) {
                        len += counts[i] - 1;
                    }
                } else {
                    len += counts[i];
                }
            }
            return hasOdd ? len + 1 : len;
        }
    }
}
