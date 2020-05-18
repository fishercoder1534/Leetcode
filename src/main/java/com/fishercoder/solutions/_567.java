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
}
