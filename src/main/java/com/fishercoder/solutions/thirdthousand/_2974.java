package com.fishercoder.solutions.thirdthousand;

import java.util.PriorityQueue;

public class _2974 {
    public static class Solution1 {
        public int[] numberGame(int[] nums) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for (int num : nums) {
                minHeap.offer(num);
            }
            int[] arr = new int[nums.length];
            int i = 0;
            while (!minHeap.isEmpty()) {
                int first = minHeap.poll();
                int second = minHeap.poll();
                arr[i++] = second;
                arr[i++] = first;
            }
            return arr;
        }
    }
}
