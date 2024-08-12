package com.fishercoder.solutions.firstthousand;

import java.util.PriorityQueue;

public class _703 {
    public static class Solution1 {
        public static class KthLargest {
            PriorityQueue<Integer> minHeap;
            int maxK;

            public KthLargest(int k, int[] nums) {
                minHeap = new PriorityQueue<>();
                for (int num : nums) {
                    minHeap.offer(num);
                    if (minHeap.size() > k) {
                        minHeap.poll();
                    }
                }
                maxK = k;
            }

            public int add(int val) {
                if (minHeap.size() < maxK || minHeap.peek() < val) {
                    minHeap.offer(val);
                    if (minHeap.size() > maxK) {
                        minHeap.poll();
                    }
                }
                return minHeap.peek();
            }
        }
    }
}
