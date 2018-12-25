package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 859. Buddy Strings
 *
 * Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A so that the result equals B.
 *
 *
 *
 * Example 1:
 *
 * Input: A = "ab", B = "ba"
 * Output: true
 * Example 2:
 *
 * Input: A = "ab", B = "ab"
 * Output: false
 * Example 3:
 *
 * Input: A = "aa", B = "aa"
 * Output: true
 * Example 4:
 *
 * Input: A = "aaaaaaabc", B = "aaaaaaacb"
 * Output: true
 * Example 5:
 *
 * Input: A = "", B = "aa"
 * Output: false
 *
 *
 * Note:
 *
 * 0 <= A.length <= 20000
 * 0 <= B.length <= 20000
 * A and B consist only of lowercase letters.
 */
public class _859 {
  public static class Solution1 {
    public boolean buddyStrings(String A, String B) {
      if (A.length() != B.length()) {
        return false;
      }
      Character c1 = null;
      Character c2 = null;
      Set<Character> set = new HashSet<>();
      int count = 0;
      for (int i = 0; i < A.length(); i++) {
        if (A.charAt(i) != B.charAt(i)) {
          if (count > 2) {
            return false;
          }
          if (c1 == null) {
            c1 = B.charAt(i);
            c2 = A.charAt(i);
            count++;
            continue;
          }
          if (c1 != A.charAt(i) || c2 != B.charAt(i)) {
            return false;
          }
          count++;
        }
        set.add(A.charAt(i));
      }
      return count == 2 || (count == 0 && set.size() < A.length());
    }
  }
}
