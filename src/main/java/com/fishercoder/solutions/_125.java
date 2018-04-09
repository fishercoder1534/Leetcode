package com.fishercoder.solutions;

/**
 * 125. Valid Palindrome

 Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.

 Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.
 For the purpose of this problem, we define empty string as valid palindrome.
 */

public class _125 {

  public static class Solution1 {
    public boolean isPalindrome(String s) {
      int i = 0;
      int j = s.length() - 1;
      char[] chars = s.toCharArray();
      while (i < j) {
        while (i < j && !Character.isLetterOrDigit(chars[i])) {
          i++;
        }
        while (i < j && !Character.isLetterOrDigit(chars[j])) {
          j--;
        }
        if (Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[j])) {
          return false;
        }
        i++;
        j--;
      }
      return true;
    }
  }
}
