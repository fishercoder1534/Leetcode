package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 784. Letter Case Permutation
 *
 * Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.
 * Return a list of all possible strings we could create.

 Examples:
 Input: S = "a1b2"
 Output: ["a1b2", "a1B2", "A1b2", "A1B2"]

 Input: S = "3z4"
 Output: ["3z4", "3Z4"]

 Input: S = "12345"
 Output: ["12345"]

 Note:

 S will be a string with length at most 12.
 S will consist only of letters or digits.

 */

public class _784 {
  public static class Solution1 {
    public List<String> letterCasePermutation(String S) {
      Set<String> result = new HashSet<>();
      result.add(S);
      for (int i = 0; i < S.length(); i++) {
        if (Character.isAlphabetic(S.charAt(i))) {
          Set<String> newResult = new HashSet<>();
          for (String word : result) {
            if (Character.isUpperCase(word.charAt(i))) {
              StringBuilder sb = new StringBuilder();
              for (int j = 0; j < i; j++) {
                sb.append(word.charAt(j));
              }
              sb.append(Character.toLowerCase(word.charAt(i)));
              for (int j = i + 1; j < word.length(); j++) {
                sb.append(word.charAt(j));
              }
              newResult.add(sb.toString());
            } else {
              StringBuilder sb = new StringBuilder();
              for (int j = 0; j < i; j++) {
                sb.append(word.charAt(j));
              }
              sb.append(Character.toUpperCase(word.charAt(i)));
              for (int j = i + 1; j < word.length(); j++) {
                sb.append(word.charAt(j));
              }
              newResult.add(sb.toString());
            }
          }
          result.addAll(newResult);
        }
      }
      return new ArrayList<>(result);
    }
  }
}
