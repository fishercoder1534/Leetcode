package com.fishercoder.solutions;

import java.util.PriorityQueue;

public class _1705 {
    public static class Solution1 {
        public int eatenApples(int[] apples, int[] days) {
            /**we sort the heap by its expiration dates, we'll eat the earliest expiration apples first*/
            PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
            int eatenApples = 0;
            for (int i = 0; i < apples.length || !minHeap.isEmpty(); i++) {
                if (i < apples.length) {
                    minHeap.offer(new int[]{i + days[i], apples[i]});
                }
                while (!minHeap.isEmpty() && (minHeap.peek()[0] <= i || minHeap.peek()[1] <= 0)) {
                    minHeap.poll();
                }
                if (!minHeap.isEmpty()) {
                    eatenApples++;
                    minHeap.peek()[1]--;
                }
            }
            return eatenApples;
        }
    }
}
