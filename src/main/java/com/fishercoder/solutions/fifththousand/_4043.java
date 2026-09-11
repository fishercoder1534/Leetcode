package com.fishercoder.solutions.fifththousand;

public class _4043 {
    public static class Solution1 {
        public int countRotations(String s, int k) {
            int count = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                sb.setLength(0);
                sb.append(s.substring(i));
                sb.append(s.substring(0, i));
                count += computeScore(sb.toString(), k);
            }
            return count;
        }

        private int computeScore(String string, int k) {
            int score = 0;
            for (int i = 0; i < string.length() - 1; i++) {
                if (string.charAt(i) == string.charAt(i + 1)) {
                    score++;
                }
            }
            return score == k ? 1 : 0;
        }
    }
}
