package com.fishercoder.solutions;

/**
 * 832. Flipping an Image
 *
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 * To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 *
 * Example 1:
 * Input: [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 *
 * Example 2:
 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 *
 * Notes:
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 */
public class _832 {
  public static class Solution1 {
    public int[][] flipAndInvertImage(int[][] A) {
      int m = A.length;
      int n = A[0].length;
      int[][] result = new int[m][n];
      for (int i = 0; i < m; i++) {
        int[] flipped = (reverse(A[i]));
        result[i] = invert(flipped);
      }
      return result;
    }

    private int[] invert(int[] flipped) {
      int[] result = new int[flipped.length];
      for (int i = 0; i < flipped.length; i++) {
        if (flipped[i] == 0) {
          result[i] = 1;
        } else {
          result[i] = 0;
        }
      }
      return result;
    }

    private int[] reverse(int[] nums) {
      for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
      }
      return nums;
    }
  }
}
