package com.fishercoder.solutions;

import java.util.PriorityQueue;

public class _502 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/77768/very-simple-greedy-java-solution-using-two-priorityqueues
         */
        public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
            PriorityQueue<int[]> capitalHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
            PriorityQueue<int[]> profitHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
            for (int i = 0; i < Profits.length; i++) {
                capitalHeap.add(new int[]{Capital[i], Profits[i]});
            }
            while (k-- > 0) {
                while (!capitalHeap.isEmpty() && capitalHeap.peek()[0] <= W) {
                    profitHeap.add(capitalHeap.poll());
                }
                if (profitHeap.isEmpty()) {
                    break;
                }
                W += profitHeap.poll()[1];
            }
            return W;
        }
    }

}
