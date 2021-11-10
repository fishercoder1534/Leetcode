package com.fishercoder.solutions;

public class _2063 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/nevergiveup/
         */
        public long countVowels(String word) {
            long ans = 0;
            for (int i = 0; i < word.length(); i++) {
                if (isVowel(word.charAt(i))) {
                    long left = i;
                    long right = word.length() - left - 1;
                    ans += (left + 1) * (right + 1);
                }
            }
            return ans;
        }

        private boolean isVowel(char ch) {
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }
    }
}
