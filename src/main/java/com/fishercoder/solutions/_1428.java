package com.fishercoder.solutions;

import com.fishercoder.common.classes.BinaryMatrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1428 {
    public static class Solution1 {
        public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
            List<Integer> dimensions = binaryMatrix.dimensions();
            int m = dimensions.get(0);
            int n = dimensions.get(1);
            List<int[]> list = new ArrayList();
            for (int i = 0; i < m; i++) {
                int leftMostColumn = binarySearch(i, binaryMatrix, n - 1);
                list.add(new int[]{i, leftMostColumn});
            }
            Collections.sort(list, (a, b) -> a[1] - b[1]);
            return list.get(0)[1] == 101 ? -1 : list.get(0)[1];
        }

        private int binarySearch(int row, BinaryMatrix binaryMatrix, int right) {
            int left = 0;
            if (binaryMatrix.get(row, right) == 0) {
                return 101;
            }
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (binaryMatrix.get(row, mid) == 0) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        }
    }
}
