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

  public static class Solution2 {
    public int strStr(String haystack, String needle) {

      int n = needle.length();
      int h = haystack.length();

      for(int i = 0; i <= h - n; i++) {
        for(int j = 0; j < n && haystack.charAt(i + j) == needle.charAt(j); j++) {
          if(j == n - 1) return i;
        }
      }

      return -1;
    }
  }

}
