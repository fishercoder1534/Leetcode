package com.fishercoder.solutions;

public class _1754 {
    public static class Solution1 {
        public String largestMerge(String word1, String word2) {
            int i = 0;
            int j = 0;
            StringBuilder sb = new StringBuilder();
            while (i < word1.length() && j < word2.length()) {
                if (word1.substring(i).compareTo(word2.substring(j)) > 0) {
                    sb.append(word1.charAt(i++));
                } else {
                    sb.append(word2.charAt(j++));
                }
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
