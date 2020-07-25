package com.fishercoder.solutions;

public class _1525 {
    public static class Solution1 {
        public int numSplits(String s) {
            int goodSplits = 0;
            int[] left = new int[26];
            int[] right = new int[26];
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                right[c - 'a']++;
            }
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                left[c - 'a']++;
                int distinctCharOnTheLeft = getDistinct(left);
                right[c - 'a']--;
                int distinctCharOnTheRight = getDistinct(right);
                if (distinctCharOnTheLeft == distinctCharOnTheRight) {
                    goodSplits++;
                }
            }
            return goodSplits;
        }

        private int getDistinct(int[] count) {
            int c = 0;
            for (int i : count) {
                if (i != 0) {
                    c++;
                }
            }
            return c;
        }
    }
}
