package com.fishercoder.solutions.secondthousand;

import java.util.Arrays;

public class _1433 {
    public static class Solution1 {
        /**
         * My completely original solution!
         * 1. Sort the two strings first
         * 2. Greedy: each position should be breaking its corresponding one in the other string
         * In this problem, "breaking" simply means the letter comes after the other in the alphabet.
         */
        public boolean checkIfCanBreak(String s1, String s2) {
            String sortedS1 = getSorted(s1);
            String sortedS2 = getSorted(s2);
            return canBeat(sortedS1, sortedS2) || canBeat(sortedS2, sortedS1);
        }

        private boolean canBeat(String s1, String s2) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) < s2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }

        private String getSorted(String str) {
            char[] chars1 = str.toCharArray();
            Arrays.sort(chars1);
            return new String(chars1);
        }
    }
}
