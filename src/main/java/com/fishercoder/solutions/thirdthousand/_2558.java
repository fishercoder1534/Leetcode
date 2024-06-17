package com.fishercoder.solutions.thirdthousand;

import java.util.PriorityQueue;

public class _2558 {
    public static class Solution1 {
        public long pickGifts(int[] gifts, int k) {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
            for (int g : gifts) {
                maxHeap.offer(g);
            }
            while (k-- > 0) {
                int max = maxHeap.poll();
                maxHeap.offer((int) Math.sqrt(max));
            }
            long res = 0L;
            while (!maxHeap.isEmpty()) {
                res += maxHeap.poll();
            }
            return res;
        }
    }
}
