package com.fishercoder.solutions;

public class _1768 {
    public static class Solution1 {
        public String mergeAlternately(String word1, String word2) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            int j = 0;
            for (; i < word1.length() && j < word2.length(); ) {
                sb.append(word1.charAt(i++));
                sb.append(word2.charAt(j++));
            }
            while (i < word1.length()) {
                sb.append(word1.charAt(i++));
            }
            while (j < word2.length()) {
                sb.append(word2.charAt(j++));
            }
            return sb.toString();
        }
    }
}
