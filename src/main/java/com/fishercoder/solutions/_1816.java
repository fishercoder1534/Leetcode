package com.fishercoder.solutions;

public class _1816 {
    public static class Solution1 {
        public String truncateSentence(String s, int k) {
            String[] words = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < k; i++) {
                sb.append(words[i]);
                sb.append(" ");
            }
            return sb.substring(0, sb.toString().length() - 1);
        }
    }
}
