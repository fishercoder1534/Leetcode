package com.fishercoder.solutions;

public class _2027 {
    public static class Solution1 {
        public int minimumMoves(String s) {
            int moves = 0;
            for (int i = 0; i < s.length(); ) {
                if (s.charAt(i) == 'O') {
                    i++;
                    continue;
                }
                String candidate = i + 3 <= s.length() ? s.substring(i, i + 3) : s.substring(i);
                if (candidate.contains("X")) {
                    moves++;
                    i += 3;
                } else {
                    i++;
                }
            }
            return moves;
        }

    }
}
