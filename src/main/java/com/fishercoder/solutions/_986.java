package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _986 {
    public static class Solution1 {
        public int[][] intervalIntersection(int[][] A, int[][] B) {
            int i = 0;
            int j = 0;
            List<int[]> list = new ArrayList<>();
            while (i < A.length && j < B.length) {
                int start = Math.max(A[i][0], B[j][0]);
                int end = Math.min(A[i][1], B[j][1]);
                if (start <= end) {
                    list.add(new int[]{start, end});
                }
                if (end == A[i][1]) {
                    i++;
                } else {
                    j++;
                }
            }
            int[][] result = new int[list.size()][2];
            for (int k = 0; k < list.size(); k++) {
                result[k] = list.get(k);
            }
            return result;
        }
    }
}
