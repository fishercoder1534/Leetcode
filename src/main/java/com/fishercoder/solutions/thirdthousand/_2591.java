package com.fishercoder.solutions.thirdthousand;

import java.util.PriorityQueue;

public class _2591 {
    public static class Solution1 {
        public int distMoney(int money, int children) {
            if (money / children == 8 && money % children == 0) {
                return children;
            }
            if (money < children) {
                return -1;
            }
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for (int i = 0; i < children; i++) {
                minHeap.offer(1);
                money--;
            }
            int maxEights = 0;
            while (!minHeap.isEmpty() && money > 0) {
                Integer curr = minHeap.poll();
                if (money < 7) {
                    curr += money;
                    minHeap.offer(curr);
                    break;
                } else if (minHeap.size() > 0) {
                    money -= 7;
                    maxEights++;
                } else if (minHeap.size() == 0) {
                    break;
                }
            }
            if (!minHeap.isEmpty() && minHeap.peek() == 4) {
                maxEights--;
            }
            return maxEights;
        }
    }
}
