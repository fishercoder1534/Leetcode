package com.fishercoder.solutions;

import java.util.PriorityQueue;

public class _1686 {
    public static class Solution1 {
        /**
         * 1. The most optimal strategy for each player is take the stone with the currently max combined value instead of just his own max value
         * because when they take the stone, it also removes the same stone from the other player, ending the best situation for them;
         * 2. Both players would stick to the above strategy since it's the best for themselves and they are playing optimally.
         */
        public int stoneGameVI(int[] aliceValues, int[] bobValues) {
            PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> a[0] - b[0] == 0 ? a[1] - b[1] : b[0] - a[0]);
            for (int i = 0; i < aliceValues.length; i++) {
                maxHeap.offer(new int[]{aliceValues[i] + bobValues[i], i});
            }
            int[] sums = new int[aliceValues.length];
            boolean aliceTurn = true;
            while (!maxHeap.isEmpty()) {
                int[] curr = maxHeap.poll();
                if (aliceTurn) {
                    aliceTurn = false;
                    sums[curr[1]] = aliceValues[curr[1]];
                } else {
                    aliceTurn = true;
                    sums[curr[1]] = -bobValues[curr[1]];
                }
            }
            int sum = 0;
            for (int s : sums) {
                sum += s;
            }
            if (sum == 0) {
                return 0;
            } else if (sum > 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
