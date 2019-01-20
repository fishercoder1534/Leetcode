package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 977. Squares of a Sorted Array
 *
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
 *
 * Example 1:
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 *
 * Example 2:
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 * Note:
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A is sorted in non-decreasing order.
 */
public class _977 {
  public static class Solution1 {
    public int[] sortedSquares(int[] A) {
      int[] result = new int[A.length];
      for (int i = 0; i < A.length; i++) {
        result[i] = (int) Math.pow(A[i], 2);
      }
      Arrays.sort(result);
      return result;
    }
  }
}
