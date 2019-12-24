package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 1005. Maximize Sum Of Array After K Negations
 *
 * Given an array A of integers, we must modify the array in the following way:
 * we choose an i and replace A[i] with -A[i], and we repeat this process K times in total.
 * (We may choose the same index i multiple times.)
 *
 * Return the largest possible sum of the array after modifying it in this way.
 *
 * Example 1:
 * Input: A = [4,2,3], K = 1
 * Output: 5
 * Explanation: Choose indices (1,) and A becomes [4,-2,3].
 *
 * Example 2:
 * Input: A = [3,-1,0,2], K = 3
 * Output: 6
 * Explanation: Choose indices (1, 2, 2) and A becomes [3,1,0,2].
 * Example 3:
 *
 * Input: A = [2,-3,-1,5,-4], K = 2
 * Output: 13
 * Explanation: Choose indices (1, 4) and A becomes [2,3,-1,5,4].
 *
 *
 * Note:
 *
 * 1 <= A.length <= 10000
 * 1 <= K <= 10000
 * -100 <= A[i] <= 100
 * */
public class _1005 {
    public static class Solution1 {
        /**credit: https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/discuss/252228/A-very-simple-java-solution*/
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
        /**credit: https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/discuss/252254/JavaC%2B%2BPython-Sort*/
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
