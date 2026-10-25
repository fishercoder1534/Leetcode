package com.fishercoder.solutions.secondthousand;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class _1438 {
    public static class Solution1 {
        /*
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
                if (!maxHeap.isEmpty()
                        && !minHeap.isEmpty()
                        && (maxHeap.peek() - minHeap.peek() <= limit)) {
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

    public static class Solution2 {
        /**
         * A good problem to apply standard sliding window paradigm:
         * we use two deques to maintain the max and min indices for quick O(1) access.
         */
        public int longestSubarray(int[] nums, int limit) {
            int ans = 0;
            Deque<Integer> maxDeque = new ArrayDeque<>();
            Deque<Integer> minDeque = new ArrayDeque<>();
            int left = 0;
            for (int right = 0; right < nums.length; right++) {
                while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] < nums[right]) {
                    maxDeque.pollLast();
                }
                maxDeque.addLast(right);

                while (!minDeque.isEmpty() && nums[minDeque.peekLast()] > nums[right]) {
                    minDeque.pollLast();
                }
                minDeque.addLast(right);

                //shrink the sliding window
                while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > limit) {
                    left++;

                    //remove out-of-the-sliding-window indices
                    while (!maxDeque.isEmpty() && maxDeque.peekFirst() < left) {
                        maxDeque.pollFirst();
                    }
                    while (!minDeque.isEmpty() && minDeque.peekFirst() < left) {
                        minDeque.pollFirst();
                    }
                }

                ans = Math.max(ans, right - left + 1);
            }
            return ans;
        }
    }
}
