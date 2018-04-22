package com.fishercoder.solutions;

import java.util.TreeSet;

/**
 * 821. Shortest Distance to a Character

  Given a string S and a character C,
  return an array of integers representing the shortest distance from the character C in the string.

 Example 1:

 Input: S = "loveleetcode", C = 'e'
 Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]

 Note:

 S string length is in [1, 10000].
 C is a single character, and guaranteed to be in string S.
 All letters in S and C are lowercase.

 */
public class _821 {

  public static class Solution1 {
    public int[] shortestToChar(String S, char C) {
      int[] result = new int[S.length()];
      TreeSet<Integer> cIndices = new TreeSet();
      for (int i = 0; i < S.length(); i++) {
        if (S.charAt(i) == C) {
          cIndices.add(i);
        }
      }
      for (int i = 0; i < S.length(); i++) {
        int leftDist = Integer.MAX_VALUE;
        if (cIndices.floor(i) != null) {
          leftDist = Math.abs(cIndices.floor(i) - i);
        }
        int rightDist = Integer.MAX_VALUE;
        if (cIndices.ceiling(i) != null) {
          rightDist = Math.abs(cIndices.ceiling(i) - i);
        }
        result[i] = Math.min(leftDist, rightDist);
      }
      return result;
    }
  }
}
