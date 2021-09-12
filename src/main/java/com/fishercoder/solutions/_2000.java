package com.fishercoder.solutions;

public class _2000 {
    public static class Solution1 {
        public String reversePrefix(String word, char ch) {
            int end = word.length();
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ch) {
                    end = i;
                    break;
                }
            }
            if (end == word.length()) {
                return word;
            }
            StringBuilder sb = new StringBuilder(word.substring(0, end + 1));
            sb.reverse();
            sb.append(word.substring(end + 1));
            return sb.toString();
        }
    }
}
