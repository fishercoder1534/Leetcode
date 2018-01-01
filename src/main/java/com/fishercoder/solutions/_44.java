package com.fishercoder.solutions;

/**
 * 44. Wildcard Matching
 * Implement wildcard pattern matching with support for '?' and '*'.

 '?' Matches any single character.
 '*' Matches any sequence of characters (including the empty sequence).

 The matching should cover the entire input string (not partial).

 The function prototype should be:
 bool isMatch(const char *s, const char *p)

 Some examples:
 isMatch("aa","a") → false
 isMatch("aa","aa") → true
 isMatch("aaa","aa") → false
 isMatch("aa", "*") → true
 isMatch("aa", "a*") → true
 isMatch("ab", "?*") → true
 isMatch("aab", "c*a*b") → false
 */
public class _44 {

  public static class Solution1 {
    public boolean isMatch(String s, String p) {
      boolean[][] match = new boolean[s.length() + 1][p.length() + 1];
      match[s.length()][p.length()] = true;
      for (int i = p.length() - 1; i >= 0; i--) {
        if (p.charAt(i) != '*') {
          break;
        } else {
          match[s.length()][i] = true;
        }
      }

      for (int i = s.length() - 1; i >= 0; i--) {
        for (int j = p.length() - 1; j >= 0; j--) {
          if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
            match[i][j] = match[i + 1][j + 1];
          } else if (p.charAt(j) == '*') {
            match[i][j] = match[i + 1][j] || match[i][j + 1];
          } else {
            match[i][j] = false;
          }
        }
      }
      return match[0][0];
    }
  }
}
