package com.fishercoder.solutions.fourththousand;

import java.util.PriorityQueue;

public class _3010 {
    public static class Solution1 {
        public int minimumCost(int[] nums) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for (int i = 1; i < nums.length; i++) {
                minHeap.offer(nums[i]);
            }
            return nums[0] + minHeap.poll() + minHeap.poll();
        }
    }
}
