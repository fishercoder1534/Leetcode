package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 908. Smallest Range I
 *
 * Given an array A of integers, for each integer A[i] we may choose any x with -K <= x <= K, and add x to A[i].
 *
 * After this process, we have some array B.
 *
 * Return the smallest possible difference between the maximum value of B and the minimum value of B.
 *
 *
 *
 * Example 1:
 *
 * Input: A = [1], K = 0
 * Output: 0
 * Explanation: B = [1]
 * Example 2:
 *
 * Input: A = [0,10], K = 2
 * Output: 6
 * Explanation: B = [2,8]
 * Example 3:
 *
 * Input: A = [1,3,6], K = 3
 * Output: 0
 * Explanation: B = [3,3,3] or B = [4,4,4]
 *
 *
 * Note:
 *
 * 1 <= A.length <= 10000
 * 0 <= A[i] <= 10000
 * 0 <= K <= 10000
 */
public class _908 {
    public static class Solution1 {
        public int smallestRangeI(int[] A, int K) {
          Arrays.sort(A);
          int smallestPlus = A[0] + K;
          int biggestMinus = A[A.length - 1] - K;
          int diff = biggestMinus - smallestPlus;
          if (diff > 0) {
              return diff;
          } else {
              return 0;
          }
      }
  }

  public static class Solution2 {
      public int smallestRangeI(int[] A, int K) {
          int min = A[0];
          int max = A[0];

          for (int k : A) {
            min = Math.min(min, k);
            max = Math.max(max, k);
          }

          return Math.max(max - min - 2 * K, 0);
      }
  }
}
