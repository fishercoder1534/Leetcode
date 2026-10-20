package com.fishercoder.solutions.thirdthousand;

import java.util.PriorityQueue;

public class _2336 {
    public static class Solution1 {
        /**
         * Just brute force is good enough given the constraints.
         */
        class SmallestInfiniteSet {
            private PriorityQueue<Integer> pq;

            public SmallestInfiniteSet() {
                this.pq = new PriorityQueue<>();
                for (int i = 1; i <= 1000; i++) {
                    pq.offer(i);
                }
            }

            public int popSmallest() {
                return pq.poll();
            }

            public void addBack(int num) {
                if (!pq.contains(num)) {
                    this.pq.offer(num);
                }
            }
        }
    }
}
