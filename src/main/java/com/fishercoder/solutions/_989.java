package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 989. Add to Array-Form of Integer
 *
 * For a non-negative integer X, the array-form of X is an array of its digits in left to right order.  For example, if X = 1231, then the array form is [1,2,3,1].
 *
 * Given the array-form A of a non-negative integer X, return the array-form of the integer X+K.
 *
 * Example 1:
 *
 * Input: A = [1,2,0,0], K = 34
 * Output: [1,2,3,4]
 * Explanation: 1200 + 34 = 1234
 * Example 2:
 *
 * Input: A = [2,7,4], K = 181
 * Output: [4,5,5]
 * Explanation: 274 + 181 = 455
 * Example 3:
 *
 * Input: A = [2,1,5], K = 806
 * Output: [1,0,2,1]
 * Explanation: 215 + 806 = 1021
 * Example 4:
 *
 * Input: A = [9,9,9,9,9,9,9,9,9,9], K = 1
 * Output: [1,0,0,0,0,0,0,0,0,0,0]
 * Explanation: 9999999999 + 1 = 10000000000
 *
 * Note：
 *
 * 1 <= A.length <= 10000
 * 0 <= A[i] <= 9
 * 0 <= K <= 10000
 * If A.length > 1, then A[0] != 0
 */
public class _989 {
  public static class Solution1 {
    public List<Integer> addToArrayForm(int[] A, int K) {
      List<Integer> kDigitsReversed = new ArrayList<>();
      int divisor = 10;
      while (K != 0) {
        kDigitsReversed.add(K % divisor);
        K /= 10;
      }
      List<Integer> result = new ArrayList<>();
      int prevFlow = 0;
      for (int i = A.length - 1, j = 0; i >= 0 || j < kDigitsReversed.size(); i --, j++) {
        int sum;
        if (i >= 0 && j < kDigitsReversed.size()) {
          sum = A[i] + kDigitsReversed.get(j);
        } else if (i >= 0) {
          sum = A[i];
        } else {
          sum = kDigitsReversed.get(j);
        }
        int flow = 0;
        if (prevFlow != 0) {
          sum += prevFlow;
        }
        if (sum > 9) {
          flow = 1;
        }
        sum %= 10;
        prevFlow = flow;
        result.add(sum);
      }
      if (prevFlow != 0) {
        result.add(prevFlow);
      }
      Collections.reverse(result);
      return result;
    }
  }
}
