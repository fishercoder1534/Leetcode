package com.fishercoder.solutions.fourththousand;

import java.util.PriorityQueue;

public class _3727 {
    public static class Solution1 {
        public long maxAlternatingSum(int[] nums) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a * a - b * b);
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b * b - a * a);
            for (int num : nums) {
                minHeap.add(num);
                maxHeap.add(num);
            }
            long sum = 0;
            int count = nums.length;
            while (count-- > 0) {
                Integer max = maxHeap.poll();
                sum += max * max;
                if (count-- > 0) {
                    Integer min = minHeap.poll();
                    sum -= min * min;
                }
            }
            return sum;
        }
    }
}
