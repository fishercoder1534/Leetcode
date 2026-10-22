package com.fishercoder.solutions.thirdthousand;

import java.util.PriorityQueue;

public class _2462 {
    public static class Solution1 {
        public long totalCost(int[] costs, int k, int candidates) {
            PriorityQueue<Integer> leftHeap = new PriorityQueue<>();
            PriorityQueue<Integer> rightHeap = new PriorityQueue<>();
            int left = 0;
            int right = costs.length - 1;
            long totalCost = 0;
            while (k-- > 0) {
                while (leftHeap.size() < candidates && left <= right) {
                    leftHeap.add(costs[left++]);
                }
                while (rightHeap.size() < candidates && left <= right) {
                    rightHeap.add(costs[right--]);
                }

                //this means we've run out of candidates to choose from, so we break
                if (leftHeap.isEmpty() && rightHeap.isEmpty()) {
                    break;
                }

                //get min values from each heap
                int leftMin = !leftHeap.isEmpty() ? leftHeap.peek() : Integer.MAX_VALUE;
                int rightMin = !rightHeap.isEmpty() ? rightHeap.peek() : Integer.MAX_VALUE;

                //this less than or equal handles the tie breaking part
                if (leftMin <= rightMin) {
                    totalCost += leftHeap.poll();
                } else {
                    totalCost += rightHeap.poll();
                }
            }
            return totalCost;
        }
    }
}
