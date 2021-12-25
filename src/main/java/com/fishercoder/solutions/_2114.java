package com.fishercoder.solutions;

public class _2114 {
    public static class Solution1 {
        public int mostWordsFound(String[] sentences) {
            int max = 0;
            for (String sentence : sentences) {
                max = Math.max(max, sentence.split("\\ ").length);
            }
            return max;
        }
    }
}
