package com.fishercoder.solutions;

/**
 * 186. Reverse Words in a String II

 Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.

 The input string does not contain leading or trailing spaces and the words are always separated by a single space.

 For example,
 Given s = "the sky is blue",
 return "blue is sky the".

 Could you do it in-place without allocating extra space?
 */
public class _186 {
  public static class Solution1 {
    public void reverseWords(char[] s) {
      // Three steps to reverse
      // 1, reverse the whole sentence
      reverse(s, 0, s.length - 1);
      // 2, reverse each word
      int start = 0;
      for (int i = 0; i < s.length; i++) {
        if (s[i] == ' ') {
          reverse(s, start, i - 1);
          start = i + 1;
        }
      }
      // 3, reverse the last word, if there is only one word this will solve the corner case
      reverse(s, start, s.length - 1);
    }

    private void reverse(char[] s, int start, int end) {
      while (start < end) {
        char temp = s[start];
        s[start++] = s[end];
        s[end--] = temp;
      }
    }
  }

}
