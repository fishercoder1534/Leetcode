package com.fishercoder.solutions.secondthousand;

public class _1529 {
    public static class Solution1 {
        /**
         * You should not try to simulate this by flipping all suffix arrays, that'll end up in TLE.
         */
        public int minFlips(String target) {
            int flips = 0;
            char currentState = '0';
            for (int i = 0; i < target.length(); i++) {
                if (target.charAt(i) != currentState) {
                    flips++;
                    currentState = target.charAt(i);
                }
            }
            return flips;
        }

    }
}
