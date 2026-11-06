package com.fishercoder.solutions.firstthousand;

import java.util.PriorityQueue;

public class _786 {
    public static class Solution1 {
        /**
         * My completely original solution:
         * Time: O(n^2^logn)
         * Space: O(n^2)
         */
        public int[] kthSmallestPrimeFraction(int[] arr, int k) {
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Double.compare((double) a[0] / a[1], (double) b[0] / b[1]));
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    pq.offer(new int[]{arr[i], arr[j]});
                }
            }
            while (k-- > 1) {
                pq.poll();
            }
            return pq.poll();
        }
    }
}
