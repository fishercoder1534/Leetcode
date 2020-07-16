package com.fishercoder.solutions;

public class _521 {
    public static class Solution1 {
        /**
         * The gotcha point of this question is:
         * 1. if a and b are identical, then there will be no common subsequence, return -1
         * 2. else if a and b are of equal length, then any one of them will be a subsequence of the other string
         * 3. else if a and b are of different length, then the longer one is a required subsequence because the longer string cannot be a subsequence of the shorter one
         * Or in other words, when a.length() != b.length(), no subsequence of b will be equal to a, so return Math.max(a.length(), b.length())
         */
        public int findLUSlength(String a, String b) {
            if (a.equals(b)) {
                return -1;
            }
            return Math.max(a.length(), b.length());
        }
    }
}
