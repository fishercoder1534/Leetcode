package com.fishercoder.solutions;

import java.util.PriorityQueue;

public class _239 {

    public static class Solution1 {
        public int[] maxSlidingWindow(int[] nums, int k) {
            if (nums == null || nums.length == 0 || k == 0) {
                return new int[0];
            }
            PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
            int[] res = new int[nums.length - k + 1];
            for (int i = 0; i < nums.length; i++) {
                if (i < k) {
                    heap.offer(nums[i]);
                    if (i == k - 1) {
                        res[0] = heap.peek();
                    }
                } else {
                    heap.remove(nums[i - k]);
                    heap.offer(nums[i]);
                    res[i - k + 1] = heap.peek();
                }
            }
            return res;
        }
    }
}
