package com.fishercoder.solutions;

public class _1935 {
    public static class Solution1 {
        public int canBeTypedWords(String text, String brokenLetters) {
            String[] words = text.split(" ");
            int count = 0;
            for (String word : words) {
                boolean broken = false;
                for (char c : word.toCharArray()) {
                    if (brokenLetters.indexOf(c) != -1) {
                        broken = true;
                        break;
                    }
                }
                if (!broken) {
                    count++;
                }
            }
            return count;
        }
    }
}
