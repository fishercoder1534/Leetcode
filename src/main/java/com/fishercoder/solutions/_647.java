package com.fishercoder.solutions;

/**
 * 647. Palindromic Substrings
 *
 *  Given a string, your task is to count how many palindromic substrings in this string.
 *  The substrings with different start indexes or end indexes are counted
 *  as different substrings even they consist of same characters.

 Example 1:
 Input: "abc"
 Output: 3
 Explanation: Three palindromic strings: "a", "b", "c".

 Example 2:
 Input: "aaa"
 Output: 6
 Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

 Note:
 The input string length won't exceed 1000.

 */

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
}
