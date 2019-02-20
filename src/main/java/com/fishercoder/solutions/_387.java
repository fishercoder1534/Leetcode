package com.fishercoder.solutions;

/**
 * 387. First Unique Character in a String Given a string, find the first non-repeating character in
 * it and return it's index. If it doesn't exist, return -1.
 *
 * Examples:
 *
 * s = "leetcode" return 0.
 *
 * s = "loveleetcode", return 2. Note: You may assume the string contain only lowercase letters.
 */

public class _387 {
  public static class Solution1 {
    public static int firstUniqChar(String s) {
      int[] freq = new int[26];
      for (int i = 0; i < s.length(); i++) {
        freq[s.charAt(i) - 'a']++;
      }
      for (int i = 0; i < s.length(); i++) {
        if (freq[s.charAt(i) - 'a'] == 1) {
          return i;
        }
      }
      return -1;
    }
  }
}
