package com.fishercoder.solutions.fifththousand;

public class _4006 {
    public static class Solution1 {
        public int countValidPrefixes(String s) {
            int count = 0;
            int ones = 0;
            int zeroes = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    ones++;
                } else {
                    zeroes++;
                }
                if (Math.abs(ones - zeroes) <= 1) {
                    count++;
                }
            }
            return count;
        }
    }
}
