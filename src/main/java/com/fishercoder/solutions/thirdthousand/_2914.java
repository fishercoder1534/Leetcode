package com.fishercoder.solutions.thirdthousand;

public class _2914 {
    public static class Solution1 {
        /**
         * My completely original solution!
         * A seemingly no-clue problem! But drawing it out on a piece of paper with a pen for a few examples gave me a good clue on how to solve it!
         * The idea is: greedy:
         * 1. whenever encounter a char that's different from its left neighbor,
         * 2. if the current sameCharCount is even, then it's safe to ignore (partition this left substring off),
         * 3. if it's odd, then we'll have to toggle it and then increment by one to move off of this char.
         */
        public int minChanges(String s) {
            int changes = 0;
            int sameCharCount = 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i - 1) == s.charAt(i)) {
                    sameCharCount++;
                } else {
                    if (sameCharCount % 2 == 0) {
                        sameCharCount = 1;
                        continue;
                    } else {
                        changes++;
                        i++;
                    }
                    sameCharCount = 1;
                }
            }
            return changes;
        }
    }
}
