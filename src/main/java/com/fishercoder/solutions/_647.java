package com.fishercoder.solutions;

public class _647 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/96819/java-solution-8-lines-extendpalindrome
         */
        public int countSubstrings(String s) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                count += extendPalindrome(s, i, i);//odd length
                count += extendPalindrome(s, i, i + 1);//even length
            }
            return count;
        }

        private int extendPalindrome(String s, int left, int right) {
            int count = 0;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
            return count;
        }
    }

    public static class Solution2 {
        /**
         * Simple brute force solution is accepted as well, although not ideal in terms of time complexity: O(n^2)
         */
        public int countSubstrings(String s) {
            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    if (isPal(s.substring(i, j))) {
                        result++;
                    }
                }
            }
            return result;
        }

        private boolean isPal(String str) {
            int i = 0;
            int j = str.length() - 1;
            while (i < j) {
                if (str.charAt(i++) != str.charAt(j--)) {
                    return false;
                }
            }
            return true;
        }
    }
}
