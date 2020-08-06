package com.fishercoder.solutions;

import java.util.PriorityQueue;

public class _1046 {
    public static class Solution1 {
        public int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
            for (int stone : stones) {
                heap.offer(stone);
            }
            while (!heap.isEmpty()) {
                if (heap.size() >= 2) {
                    int one = heap.poll();
                    int two = heap.poll();
                    int diff = one - two;
                    heap.offer(diff);
                } else {
                    return heap.poll();
                }
            }
            return -1;
        }
    }
}
