package com.fishercoder.solutions.fourththousand;

public class _3707 {
    public static class Solution1 {
        public boolean scoreBalance(String s) {
            int score1 = s.charAt(0) - 'a' + 1;//has to add one to it, otherwise 'a' - 'a' becomes a zero which will yield incorrect values.
            int score2 = 0;
            for (int i = s.length() - 1; i >= 1; i--) {
                score2 += s.charAt(i) - 'a' + 1;
            }
            for (int i = 1; i < s.length(); i++) {
                if (score1 == score2) {
                    return true;
                }
                int score = s.charAt(i) - 'a' + 1;
                score1 += score;
                score2 -= score;
            }
            return false;
        }
    }
}
