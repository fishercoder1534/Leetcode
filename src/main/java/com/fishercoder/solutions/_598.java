package com.fishercoder.solutions;

/**
 * 598. Range Addition II

 Given an m * n matrix m initialized with all 0's and several update operations.
 Operations are represented by a 2D array,
 and each operation is represented by an array with two positive integers a and b,
 which means m[i][j] should be added by one for all 0 <= i < a and 0 <= j < b.

 You need to count and return the number of maximum integers in the matrix after performing all the operations.

 Example 1:
 Input:
 m = 3, n = 3
 operations = [[2,2],[3,3]]
 Output: 4

 Explanation:
 Initially, m =
 [[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]

 After performing [2,2], m =
 [[1, 1, 0],
 [1, 1, 0],
 [0, 0, 0]]

 After performing [3,3], m =
 [[2, 2, 1],
 [2, 2, 1],
 [1, 1, 1]]

 So the maximum integer in m is 2, and there are four of it in m. So return 4.
 Note:
 The range of m and n is [1,40000].
 The range of a is [1,m], and the range of b is [1,n].
 The range of operations size won't exceed 10,000.
 */

public class _598 {

    public static class Solution1 {
        public int maxCount(int m, int n, int[][] ops) {
            int x = m;
            int y = n;
            for (int[] op : ops) {
                x = Math.min(x, op[0]);
                y = Math.min(y, op[1]);
            }
            return x * y;
        }
    }
}
