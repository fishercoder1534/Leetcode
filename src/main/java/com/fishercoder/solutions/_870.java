package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class _870 {
    public static class Solution1 {
        public int[] advantageCount(int[] A, int[] B) {
            int[] result = new int[A.length];
            Arrays.sort(A);
            boolean[] used = new boolean[A.length];
            for (int i = 0; i < A.length; i++) {
                result[i] = findSmallestAdvantage(A, used, B[i]);
            }
            List<Integer> unused = new ArrayList<>();
            for (int i = 0; i < A.length; i++) {
                if (!used[i]) {
                    unused.add(A[i]);
                }
            }
            Iterator<Integer> iterator = unused.iterator();
            for (int i = 0; i < A.length; i++) {
                if (result[i] == -1) {
                    result[i] = iterator.next();
                }
            }
            return result;
        }

        private int findSmallestAdvantage(int[] A, boolean[] used, int target) {
            for (int i = 0; i < A.length; i++) {
                if (!used[i] && A[i] > target) {
                    used[i] = true;
                    return A[i];
                }
            }
            return -1;
        }
    }
}
