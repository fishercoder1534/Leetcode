package com.fishercoder.solutions;

import java.util.PriorityQueue;

public class _1438 {
    public static class Solution1 {
        /**
         * My completely original solution on 1/19/2022.
         */
        public int longestSubarray(int[] nums, int limit) {
            int ans = 0;
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for (int left = 0, right = 0; left < nums.length && right < nums.length; right++) {
                if (ans == 0) {
                    ans = 1;
                }
                maxHeap.offer(nums[right]);
                minHeap.offer(nums[right]);
                if (!maxHeap.isEmpty() && !minHeap.isEmpty() && (maxHeap.peek() - minHeap.peek() <= limit)) {
                    ans = Math.max(ans, right - left + 1);
                } else {
                    maxHeap.remove(nums[left]);
                    minHeap.remove(nums[left]);
                    left++;
                }
            }
            return ans;
        }
    }
}
