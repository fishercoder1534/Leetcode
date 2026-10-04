package com.fishercoder.solutions.fifththousand;

public class _4070 {
    public static class Solution1 {
        public int minRotations(String s) {
            int r = 0;
            for (int i = -1; i < s.length() - 1; i++) {
                int from = i == -1 ? 0 : Character.getNumericValue(s.charAt(i));
                int to = Character.getNumericValue(s.charAt(i + 1));
                int bigger = 0;
                int smaller = 0;
                if (from > to) {
                    bigger = from;
                    smaller = to;
                } else if (from < to) {
                    bigger = to;
                    smaller = from;
                }
                r += Math.min(bigger - smaller, Math.abs(10 - bigger + smaller));
            }
            return r;
        }
    }
}
