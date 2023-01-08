package com.fishercoder.solutions;

import java.util.PriorityQueue;

public class _2530 {
    public static class Solution1 {
        public long maxKelements(int[] nums, int k) {
            long ans = 0L;
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
            for (int num : nums) {
                maxHeap.offer(num);
            }
            while (k-- > 0) {
                int max = maxHeap.poll();
                ans += max;
                maxHeap.offer((int) Math.ceil((double) max / 3));
            }
            return ans;
        }
    }
}
