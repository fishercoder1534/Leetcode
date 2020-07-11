package com.fishercoder.solutions;

public class _1143 {
    public static class Solution1 {
        public int longestCommonSubsequence(String text1, String text2) {
            String shorter = text1.length() < text2.length() ? text1 : text2;
            String longer = shorter.equals(text1) ? text2 : text1;
            return -1;
        }
    }
}
