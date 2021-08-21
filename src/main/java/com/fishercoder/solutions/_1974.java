package com.fishercoder.solutions;

public class _1974 {
    public static class Solution1 {
        public int minTimeToType(String word) {
            int min = 0;
            char curr = 'a';
            for (int i = 0; i < word.length(); i++) {
                int diff = curr - word.charAt(i);
                curr = word.charAt(i);
                min += Math.min(diff + 26, Math.min(Math.abs(diff), 26 - diff));
                min++;
            }
            return min;
        }
    }
}
