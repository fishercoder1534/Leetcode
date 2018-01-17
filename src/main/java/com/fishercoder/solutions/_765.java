package com.fishercoder.solutions;

/**
 * 765. Couples Holding Hands
 *
 * N couples sit in 2N seats arranged in a row and want to hold hands.
 * We want to know the minimum number of swaps so that every couple is sitting side by side.
 * A swap consists of choosing any two people, then they stand up and switch seats.
 * The people and seats are represented by an integer from 0 to 2N-1, the couples are numbered in order,
 * the first couple being (0, 1), the second couple being (2, 3), and so on with the last couple being (2N-2, 2N-1).
 * The couples' initial seating is given by row[i] being the value of the person who is initially sitting in the i-th seat.

 Example 1:

 Input: row = [0, 2, 1, 3]
 Output: 1
 Explanation: We only need to swap the second (row[1]) and third (row[2]) person.

 Example 2:

 Input: row = [3, 2, 0, 1]
 Output: 0
 Explanation: All couples are already seated side by side.

 Note:
 len(row) is even and in the range of [4, 60].
 row is guaranteed to be a permutation of 0...len(row)-1.
 */

public class _765 {
  public static class Solution1 {
    public int minSwapsCouples(int[] row) {
      int swaps = 0;
      for (int i = 0; i < row.length - 1; i += 2) {
        int coupleValue = row[i] % 2 == 0 ? row[i] + 1 : row[i] - 1;
        if (row[i + 1] != coupleValue) {
          swaps++;
          int coupleIndex = findIndex(row, coupleValue);
          swap(row, coupleIndex, i + 1);
        }
      }
      return swaps;
    }

    private void swap(int[] row, int i, int j) {
      int tmp = row[i];
      row[i] = row[j];
      row[j] = tmp;
    }

    private int findIndex(int[] row, int value) {
      for (int i = 0; i < row.length; i++) {
        if (row[i] == value) {
          return i;
        }
      }
      return -1;
    }
  }
}
