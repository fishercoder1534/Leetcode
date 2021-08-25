package com.fishercoder.solutions;

public class _1781 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/sum-of-beauty-of-all-substrings/discuss/1096380/Java-or-T%3A-O(N2)-or-S%3A-O(1)-Get-the-beauty-of-all-substrings-and-sum-them
         */
        public int beautySum(String s) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                int[] charCount = new int[26];
                for (int j = i; j < s.length(); j++) {
                    charCount[s.charAt(j) - 'a']++;
                    //get beauty of s.substring(i, j)
                    int beauty = getMaxCount(charCount) - getMinCount(charCount);
                    sum += beauty;
                }
            }
            return sum;
        }

        private int getMinCount(int[] charCount) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < 26; i++) {
                if (charCount[i] != 0) {
                    min = Math.min(min, charCount[i]);
                }
            }
            return min;
        }

        private int getMaxCount(int[] charCount) {
            int max = 0;
            for (int i = 0; i < 26; i++) {
                if (charCount[i] != 0) {
                    max = Math.max(max, charCount[i]);
                }
            }
            return max;
        }
    }
}
