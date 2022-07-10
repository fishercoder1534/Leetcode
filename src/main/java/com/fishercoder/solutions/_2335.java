package com.fishercoder.solutions;

import java.util.PriorityQueue;

public class _2335 {
    public static class Solution1 {
        public int fillCups(int[] amount) {
            PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
            for (int num : amount) {
                if (num > 0) {
                    heap.offer(num);
                }
            }
            int seconds = 0;
            while (!heap.isEmpty()) {
                if (heap.size() == 1) {
                    seconds += heap.poll();
                    return seconds;
                }
                int one = heap.poll();
                one--;
                if (!heap.isEmpty()) {
                    int two = heap.poll();
                    two--;
                    if (two > 0) {
                        heap.offer(two);
                    }
                }
                if (one > 0) {
                    heap.offer(one);
                }
                seconds++;
            }
            return seconds;
        }

    }
}
