package com.fishercoder.solutions;

/**
 * 59. Spiral Matrix II
 *
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

 For example,
 Given n = 3,

 You should return the following matrix:
 [
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
 ]
 */
public class _59 {

  public static class Solution1 {
    public int[][] generateMatrix(int num) {
      int temp = num;
      int[][] fourEdges = new int[num][num];
      int value = 1;
      int i = 0;
      int j = 0;
      if (num % 2 == 0) {
        //when num is even
        while (i < num / 2 && j < num / 2 && temp >= 0) {
                /* Assign the top row */
          while (j < temp) {
            fourEdges[i][j] = value;
            j++;
            value++;
          }

				/* Assign the right column */
          while (i < temp - 1) {
            i++;
            fourEdges[i][j - 1] = value;
            value++;
          }
          j = j - 2;

				/* Assign the bottom row */
          while (j >= num - temp) {
            fourEdges[i][j] = value;
            j--;
            value++;
          }
          i--;
          j++;

				/* Assign the left column */
          while (i > num - temp) {
            fourEdges[i][j] = value;
            i--;
            value++;
          }
          //}
          i++;
          j++;
          temp--;
        }
      } else {
        //when num is odd
        while (i < num / 2 && j < num / 2 && temp >= 0) {
                /* Assign the top row */
          while (j < temp) {
            fourEdges[i][j] = value;
            j++;
            value++;
          }

				/* Assign the right column */
          while (i < temp - 1) {
            i++;
            fourEdges[i][j - 1] = value;
            value++;
          }
          j = j - 2;

				/* Assign the bottom row */
          while (j >= num - temp) {
            fourEdges[i][j] = value;
            j--;
            value++;
          }
          i--;
          j++;

				/* Assign the left column */
          while (i > num - temp) {
            fourEdges[i][j] = value;
            i--;
            value++;
          }
          //}
          i++;
          j++;
          temp--;
        }
        fourEdges[num / 2][num / 2] = num * num;
      }

      for (int m = 0; m < num; m++) {
        for (int n = 0; n < num; n++) {
          System.out.print(fourEdges[m][n] + "\t");
          if ((n + 1) % num == 0) {
            System.out.println();
          }
        }
      }
      return fourEdges;
    }
  }
}
