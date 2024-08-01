package com.fishercoder.solutions.fourththousand;

import java.util.PriorityQueue;

public class _3065 {
    public static class Solution1 {
        public int minOperations(int[] nums, int k) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for (int num : nums) {
                minHeap.offer(num);
            }
            int ops = 0;
            while (!minHeap.isEmpty() && minHeap.peek() < k) {
                minHeap.poll();
                ops++;
            }
            return ops;
        }
    }
}
