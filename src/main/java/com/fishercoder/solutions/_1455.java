package com.fishercoder.solutions;

public class _1455 {
    public static class Solution1 {
        public int isPrefixOfWord(String sentence, String searchWord) {
            String[] words = sentence.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].startsWith(searchWord)) {
                    return i + 1;
                }
            }
            return -1;
        }
    }
}
