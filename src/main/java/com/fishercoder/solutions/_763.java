package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 763. Partition Labels
 *
 * A string S of lowercase letters is given.
 * We want to partition this string into as many parts as possible so that each letter appears
 * in at most one part, and return a list of integers representing the size of these parts.

 Example 1:
 Input: S = "ababcbacadefegdehijhklij"
 Output: [9,7,8]
 Explanation:
 The partition is "ababcbaca", "defegde", "hijhklij".
 This is a partition so that each letter appears in at most one part.
 A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.

 Note:
 S will have length in range [1, 500].
 S will consist of lowercase letters ('a' to 'z') only.
 */
public class _763 {

  public static class Solution1 {
    public List<Integer> partitionLabels(String S) {
      List<Integer> result = new ArrayList<>();
      int[] last = new int[26];
      /**This is the key step:
       * we find the last occurrence of each letter and record them in last[]*/
      for (int i = 0; i < S.length(); i++) {
        last[S.charAt(i) - 'a'] = i;
      }
      /**record the last end index of the current substring*/
      int end = 0;
      int start = 0;
      for (int i = 0; i < S.length(); i++) {
        end = Math.max(end, last[S.charAt(i) - 'a']);
        if (end == i) {
          result.add(end - start + 1);
          start = end + 1;
        }
      }
      return result;
    }
  }

}
