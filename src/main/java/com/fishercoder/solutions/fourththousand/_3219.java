package com.fishercoder.solutions.fourththousand;

import java.util.PriorityQueue;

public class _3219 {
    public static class Solution1 {
        /*
         * My completely original solution.
         */
        public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
            PriorityQueue<Integer> maxHeapHorizontal = new PriorityQueue<>((a, b) -> b - a);
            for (int cut : horizontalCut) {
                maxHeapHorizontal.offer(cut);
            }
            PriorityQueue<Integer> maxHeapVertical = new PriorityQueue<>((a, b) -> b - a);
            for (int cut : verticalCut) {
                maxHeapVertical.offer(cut);
            }
            int verticalParts = 1;
            int horizontalParts = 1;
            long cost = 0L;
            while (!maxHeapHorizontal.isEmpty() || !maxHeapVertical.isEmpty()) {
                Integer curr;
                if (!maxHeapHorizontal.isEmpty() && !maxHeapVertical.isEmpty()) {
                    if (maxHeapHorizontal.peek() > maxHeapVertical.peek()) {
                        curr = maxHeapHorizontal.poll();
                        cost += curr * verticalParts;
                        horizontalParts++;
                    } else {
                        curr = maxHeapVertical.poll();
                        cost += curr * horizontalParts;
                        verticalParts++;
                    }
                } else if (!maxHeapHorizontal.isEmpty()) {
                    curr = maxHeapHorizontal.poll();
                    cost += curr * verticalParts;
                    horizontalParts++;
                } else {
                    curr = maxHeapVertical.poll();
                    cost += curr * horizontalParts;
                    verticalParts++;
                }
            }
            return cost;
        }
    }
}
