package com.fishercoder.solutions;

import java.util.PriorityQueue;

public class _668 {
    public static class Solution1 {
        /**
         * This brute force approach resulted in
         * TLE on Leetcode and
         * OOM error by _668test.test3() when running in my localhost:
         * java.lang.OutOfMemoryError: Java heap space
         * at java.util.Arrays.copyOf(Arrays.java:3210)
         * at java.util.Arrays.copyOf(Arrays.java:3181)
         * at java.util.PriorityQueue.grow(PriorityQueue.java:300)
         * at java.util.PriorityQueue.offer(PriorityQueue.java:339)
         */
        public int findKthNumber(int m, int n, int k) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    minHeap.offer(i * j);
                }
            }
            while (k-- > 1) {
                minHeap.poll();
            }
            return minHeap.peek();
        }
    }

    public static class Solution2 {
        /**
         * reference: https://discuss.leetcode.com/topic/101132/java-solution-binary-search
         */
        public int findKthNumber(int m, int n, int k) {
            int low = 1;
            int high = m * n + 1;
            while (low < high) {
                int mid = low + (high - low) / 2;
                int c = count(mid, m, n);
                if (c >= k) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            return high;
        }

        int count(int v, int m, int n) {
            int count = 0;
            for (int i = 1; i <= m; i++) {
                int temp = Math.min(v / i, n);
                count += temp;
            }
            return count;
        }
    }
}
