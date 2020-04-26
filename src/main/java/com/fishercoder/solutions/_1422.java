package com.fishercoder.solutions;

public class _1422 {
    public static class Solution1 {
        public int maxScore(String s) {
            int zeroes = s.charAt(0) == '0' ? 1 : 0;
            int ones = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    ones++;
                }
            }
            int maxScore = zeroes + ones;
            for (int i = 1; i < s.length() - 1; i++) {
                if (s.charAt(i) == '0') {
                    zeroes++;
                } else {
                    ones--;
                }
                maxScore = Math.max(maxScore, zeroes + ones);
            }
            return maxScore;
        }
    }
}
