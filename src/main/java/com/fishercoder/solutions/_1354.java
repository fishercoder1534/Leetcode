package com.fishercoder.solutions;

import java.util.PriorityQueue;

public class _1354 {
    public static class Solution1 {
        /**
         * Use % is the key here to avoid TLE, a good test case for this is [1,1000000000]
         */
        public boolean isPossible(int[] target) {
            long sum = 0;
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
            for (int i = 0; i < target.length; i++) {
                maxHeap.offer(target[i]);
                sum += target[i];
            }
            while (maxHeap.peek() != 1) {
                int max = maxHeap.poll();
                sum -= max;
                if (max <= sum || sum < 1) {
                    return false;
                }
                max %= sum;
                sum += max;
                maxHeap.offer(max);
            }
            return true;
        }
    }
}