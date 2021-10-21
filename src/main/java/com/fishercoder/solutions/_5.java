package com.fishercoder.solutions;

public class _5 {

    public static class Solution1 {
        private int low;
        private int maxLen;

        public String longestPalindrome(String s) {
            int len = s.length();
            if (len < 2) {
                return s;
            }

            for (int i = 0; i < len - 1; i++) {
                extendPalindrome(s, i, i); // assume odd length, try to extend Palindrome as possible
                extendPalindrome(s, i, i + 1); // assume even length.
            }
            return s.substring(low, low + maxLen);
        }

        private void extendPalindrome(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            if (maxLen < right - left - 1) {
                low = left + 1;
                maxLen = right - left - 1;
            }
        }
    }

    public static class Solution2 {
        /**
         * Same sliding window idea, but without using global variables.
         * Credit: https://leetcode.com/problems/longest-palindromic-substring/solution/
         */
        public String longestPalindrome(String s) {
            int start = 0;
            int end = 0;
            for (int i = 0; i < s.length(); i++) {
                int len1 = expand(s, i, i);
                int len2 = expand(s, i, i + 1);
                int len = Math.max(len1, len2);
                if (len > end - start) {
                    start = i - (len - 1) / 2;
                    end = i + len / 2;
                }
            }
            return s.substring(start, end + 1);
        }

        private int expand(String s, int left, int right) {
            int l = left;
            int r = right;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            return r - l - 1;
        }

    }
}
