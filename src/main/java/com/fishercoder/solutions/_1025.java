package com.fishercoder.solutions;

public class _1025 {
    public static class Solution1 {
        /**
         * After writing out a few examples, beginning from n = 1, up to n = 5, the logic flows out naturally:
         * 1. when N deduced to 1, whoever plays now loses because no integers exist between 0 and 1;
         * 2. when N deduced to 2, whoever plays now wins because he/she will pick one and the next player is left with nothing to play;
         * 3. all numbers N will eventually be deduced to either 1 or 2 depending on whether its odd or even.
         */
        public boolean divisorGame(int N) {
            return N % 2 == 0;
        }
    }
}
