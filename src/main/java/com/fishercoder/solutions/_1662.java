package com.fishercoder.solutions;

public class _1662 {
    public static class Solution1 {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            StringBuilder sb1 = new StringBuilder();
            for (String word : word1) {
                sb1.append(word);
            }
            StringBuilder sb2 = new StringBuilder();
            for (String word : word2) {
                sb2.append(word);
            }
            return sb1.toString().equals(sb2.toString());
        }
    }
}
