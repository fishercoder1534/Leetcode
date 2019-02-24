package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 942. DI String Match
 *
 * Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.
 *
 * Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
 *
 * If S[i] == "I", then A[i] < A[i+1]
 * If S[i] == "D", then A[i] > A[i+1]
 *
 * Example 1:
 * Input: "IDID"
 * Output: [0,4,1,3,2]
 *
 * Example 2:
 * Input: "III"
 * Output: [0,1,2,3]
 *
 * Example 3:
 * Input: "DDI"
 * Output: [3,2,0,1]
 *
 * Note:
 * 1 <= S.length <= 10000
 * S only contains characters "I" or "D".
 */
public class _942 {
  public static class Solution1 {
    public int[] diStringMatch(String S) {
      Queue<Integer> deque = new ArrayDeque<>();
      for (int i = 0; i <= S.length(); i++) {
        deque.add(i);
      }
      int[] result = new int[S.length() + 1];
      for (int i = 0; i <= S.length(); i++) {
        if (i == S.length()) {
          result[i] = ((ArrayDeque<Integer>) deque).pollLast();
        } else if (S.charAt(i) == 'I') {
          result[i] = ((ArrayDeque<Integer>) deque).pollFirst();
        } else {
          result[i] = ((ArrayDeque<Integer>) deque).pollLast();
        }
      }
      return result;
    }
  }
}
