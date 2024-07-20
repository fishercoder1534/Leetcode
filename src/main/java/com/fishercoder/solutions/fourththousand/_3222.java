package com.fishercoder.solutions.fourththousand;

public class _3222 {
    public static class Solution1 {
        public String losingPlayer(int x, int y) {
            boolean bobsTurn = true;
            while (x >= 1 && y >= 4) {
                x--;
                y -= 4;
                bobsTurn = !bobsTurn;
            }
            return !bobsTurn ? "Alice" : "Bob";
        }
    }
}
