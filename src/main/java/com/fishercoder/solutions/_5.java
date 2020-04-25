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
}
