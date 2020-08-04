package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _1005 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/discuss/252228/A-very-simple-java-solution
         */
        public int largestSumAfterKNegations(int[] A, int K) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for (int num : A) {
                minHeap.offer(num);
            }
            while (K-- > 0) {
                minHeap.offer(-minHeap.poll());
            }
            int sum = 0;
            while (!minHeap.isEmpty()) {
                sum += minHeap.poll();
            }
            return sum;
        }
    }

    public static class Solution2 {
        /**
         * credit: https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/discuss/252254/JavaC%2B%2BPython-Sort
         */
        public int largestSumAfterKNegations(int[] A, int K) {
            Arrays.sort(A);
            for (int i = 0; i < A.length && K > 0 && A[i] < 0; i++, K--) {
                A[i] = -A[i];
            }
            int sum = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < A.length; i++) {
                min = Math.min(min, A[i]);
                sum += A[i];
            }
            return K % 2 == 0 ? sum : sum - min * 2;
        }
    }
}
