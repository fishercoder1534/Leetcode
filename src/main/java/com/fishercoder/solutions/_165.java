package com.fishercoder.solutions;
/**
 * 165. Compare Version Numbers

 Compare two version numbers version1 and version2.
 If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

 You may assume that the version strings are non-empty and contain only digits and the . character.
 The . character does not represent a decimal point and is used to separate number sequences.
 For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

 Here is an example of version numbers ordering:

 0.1 < 1.1 < 1.2 < 13.37
 */

public class _165 {
  public static class Solution1 {
    public int compareVersion(String version1, String version2) {
      String[] v1s = version1.split(
          "\\.");//escaping it is very important! Otherwise, it's not going to work as expected!
      String[] v2s = version2.split("\\.");
      int len = (v1s.length < v2s.length) ? v2s.length : v1s.length;
      for (int i = 0; i < len; i++) {
        if (v1s.length == i) {
          while (i < len) {
            if (Integer.parseInt(v2s[i]) > 0) {
              return -1;
            }
            i++;
          }
        } else if (v2s.length == i) {
          while (i < len) {
            if (Integer.parseInt(v1s[i]) > 0) {
              return 1;
            }
            i++;
          }
        } else {
          if (Integer.parseInt(v1s[i]) > Integer.parseInt(v2s[i])) {
            return 1;
          } else if (Integer.parseInt(v2s[i]) > Integer.parseInt(v1s[i])) {
            return -1;
          }
        }
      }
      return 0;
    }
  }
}
