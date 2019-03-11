package com.fishercoder.solutions;

/**
 * 409. Longest Palindrome
 *
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 *
 * Note:
 * Assume the length of given string will not exceed 1,010.
 *
 * Example:
 * Input:
 * "abccccdd"
 *
 * Output:
 * 7
 *
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class _409 {
  public static class Solution1 {
    public int longestPalindrome(String s) {
      int[] counts = new int[56];
      for (char c : s.toCharArray()) {
        if (Character.isUpperCase(c)) {
          counts[c - 'A' + 33]++;
        } else {
          counts[c - 'a']++;
        }
      }
      boolean hasOdd = false;
      int len = 0;
      for (int i = 0; i < 56; i++) {
        if (counts[i] % 2 != 0) {
          hasOdd = true;
          if (counts[i] > 1) {
            len += counts[i] - 1;
          }
        } else {
          len += counts[i];
        }
      }
      return hasOdd ? len + 1 : len;
    }
  }
}
