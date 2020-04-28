package com.fishercoder.solutions;

public class _28 {

  public static class Solution1 {
    public int strStr(String haystack, String needle) {
      if (haystack == null || needle == null || haystack.length() < needle.length()) {
        return -1;
      }

      for (int i = 0; i <= haystack.length() - needle.length(); i++) {
        if (haystack.substring(i, i + needle.length()).equals(needle)) {
          return i;
        }
      }
      return -1;
    }
  }

}
