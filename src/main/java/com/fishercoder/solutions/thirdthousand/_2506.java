package com.fishercoder.solutions.thirdthousand;

public class _2506 {
    public static class Solution1 {
        public int similarPairs(String[] words) {
            String[] symbols = new String[words.length];
            for (int i = 0; i < words.length; i++) {
                symbols[i] = compress(words[i]);
            }
            int pairs = 0;
            for (int i = 0; i < symbols.length - 1; i++) {
                for (int j = i + 1; j < symbols.length; j++) {
                    if (symbols[i].equals(symbols[j])) {
                        pairs++;
                    }
                }
            }
            return pairs;
        }

        private String compress(String word) {
            int[] count = new int[26];
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    sb.append(i + 'a');
                }
            }
            return sb.toString();
        }
    }
}
