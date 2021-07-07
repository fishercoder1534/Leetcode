package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _378 {
    public static class Solution1 {
        /**
         * brute force made it AC'ed, extreme test case needed for OJ
         */
        public int kthSmallest(int[][] matrix, int k) {
            List<Integer> list = new ArrayList();
            int n = matrix.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    list.add(matrix[i][j]);
                }
            }
            Collections.sort(list);
            return list.get(k - 1);
        }
    }

    public static class Solution2 {
        /**
         * Binary Search : The idea is to pick a mid number, then compare it with the elements in each row, we start form
         * end of row util we find the element is less than the mid, the left side element is all less than mid; keep tracking elements
         * that less than mid and compare with k, then update the k.
         */
        public int kthSmallest(int[][] matrix, int k) {
            int row = matrix.length - 1;
            int col = matrix[0].length - 1;
            int lo = matrix[0][0];
            int hi = matrix[row][col];
            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;
                int count = 0;
                int j = col;
                for (int i = 0; i <= row; i++) {
                    while (j >= 0 && matrix[i][j] > mid) {
                        j--;
                    }
                    count += (j + 1);
                }
                if (count < k) {
                    lo = mid + 1;
                } else {
                    hi = mid;
                }
            }
            return lo;
        }
    }
}
