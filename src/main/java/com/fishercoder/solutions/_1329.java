package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1329. Sort the Matrix Diagonally
 *
 * Given a m * n matrix mat of integers,
 * sort it diagonally in ascending order from the top-left to the bottom-right then return the sorted array.
 *
 * Example 1:
 * Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
 * Output: [[1,1,1,1],[1,2,2,2],[1,2,3,3]]
 *
 * Constraints:
 * m == mat.length
 * n == mat[i].length
 * 1 <= m, n <= 100
 * 1 <= mat[i][j] <= 100
 * */
public class _1329 {
    public static class Solution1 {
        public int[][] diagonalSort(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            int[][] sorted = new int[m][n];
            for (int i = m - 1; i >= 0; i--) {
                int iCopy = i;
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < n && iCopy < m; j++, iCopy++) {
                    list.add(mat[iCopy][j]);
                }
                Collections.sort(list);
                iCopy = i;
                for (int j = 0; j < n && iCopy < m; j++, iCopy++) {
                    sorted[iCopy][j] = list.get(j);
                }
            }

            for (int j = n - 1; j > 0; j--) {
                int jCopy = j;
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < m && jCopy < n; i++, jCopy++) {
                    list.add(mat[i][jCopy]);
                }
                Collections.sort(list);
                jCopy = j;
                for (int i = 0; i < m && jCopy < n; i++, jCopy++) {
                    sorted[i][jCopy] = list.get(i);
                }
            }
            return sorted;
        }
    }
}
