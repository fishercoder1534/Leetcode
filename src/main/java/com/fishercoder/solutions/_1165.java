package com.fishercoder.solutions;

public class _1165 {
    public static class Solution1 {
        public int calculateTime(String keyboard, String word) {
            int time = 0;
            int fromIndex = 0;
            for (char c : word.toCharArray()) {
                int fingerMoves = Math.abs(fromIndex - keyboard.indexOf(c));
                fromIndex = keyboard.indexOf(c);
                time += fingerMoves;
            }
            return time;
        }
    }
}
