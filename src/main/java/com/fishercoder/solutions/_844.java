package com.fishercoder.solutions;

/**
 * 844. Backspace String Compare
 *
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 *
 * Example 1:
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 *
 *  Example 2:
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 *
 *  Example 3:
 * Input: S = "a##c", T = "#a#c"
 * Output: true
 * Explanation: Both S and T become "c".
 *
 * Example 4:
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 * Note:
 *
 * 1 <= S.length <= 200
 * 1 <= T.length <= 200
 * S and T only contain lowercase letters and '#' characters.
 * Follow up:
 *
 * Can you solve it in O(N) time and O(1) space?
 */
public class _844 {
  public static class Solution1 {
    public boolean backspaceCompare(String S, String T) {
      String processedS = process(S);
      String processedT = process(T);
      return processedS.equals(processedT);
    }

    private String process(String str) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == '#') {
          if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
          }
        } else {
          sb.append(str.charAt(i));
        }
      }
      return sb.reverse().toString();
    }
  }
}
