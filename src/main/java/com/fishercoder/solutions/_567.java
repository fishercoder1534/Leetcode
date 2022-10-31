package com.fishercoder.solutions;

public class _567 {

    public static class Solution1 {
        /**
         * credit: sliding window: https://discuss.leetcode.com/topic/87845/java-solution-sliding-window
         */
        public boolean checkInclusion(String s1, String s2) {
            int len1 = s1.length();
            int len2 = s2.length();
            if (len1 > len2) {
                return false;
            }

            int[] count = new int[26];
            for (int i = 0; i < len1; i++) {
                count[s1.charAt(i) - 'a']++;
                count[s2.charAt(i) - 'a']--;
            }

            if (allZeroes(count)) {
                return true;
            }

            for (int i = len1; i < len2; i++) {
                count[s2.charAt(i) - 'a']--;
                count[s2.charAt(i - len1) - 'a']++;
                if (allZeroes(count)) {
                    return true;
                }
            }

            return false;
        }

        private boolean allZeroes(int[] count) {
            for (int i : count) {
                if (i != 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static class Solution2 {
        /**
         * A classic sliding window problem.
         * I came up with below solution independently on 9/17/2021.
         * <p>
         * A few pointers that led me to the sliding window approach:
         * 1. if it's a valid permutation, the substring from S2 must have equal length as of s1;
         * 2. I don't want to repeatedly calculate each and every possible substring of s2, if s1 is really long, this could mean lots of redundant calculation.
         * So sliding window to the rescue!
         */
        public boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return false;
            }
            int[] count = new int[26];
            for (char c : s1.toCharArray()) {
                count[c - 'a']++;
            }
            for (int i = 0; i < s1.length(); i++) {
                count[s2.charAt(i) - 'a']--;
            }
            for (int i = s1.length(), j = 0; i < s2.length(); i++, j++) {
                if (isPermutation(count)) {
                    return true;
                } else {
                    count[s2.charAt(j) - 'a']++;
                    count[s2.charAt(i) - 'a']--;
                }
            }
            return isPermutation(count);
        }

        private boolean isPermutation(int[] count) {
            for (int c : count) {
                if (c != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
