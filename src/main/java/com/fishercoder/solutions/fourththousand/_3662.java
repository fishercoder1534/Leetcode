package com.fishercoder.solutions.fourththousand;

public class _3662 {
    public static class Solution1 {
        public String filterCharacters(String s, int k) {
            int[] freq = new int[26];
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (freq[s.charAt(i) - 'a'] < k) {
                    sb.append(s.charAt(i));
                }
            }
            return sb.toString();
        }
    }
}
