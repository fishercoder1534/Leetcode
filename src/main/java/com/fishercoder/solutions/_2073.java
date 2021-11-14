package com.fishercoder.solutions;

import java.util.Deque;
import java.util.LinkedList;

public class _2073 {
    public static class Solution1 {
        public int timeRequiredToBuy(int[] tickets, int k) {
            int time = 0;
            Deque<int[]> queue = new LinkedList<>();
            for (int i = 0; i < tickets.length; i++) {
                queue.addLast(new int[]{tickets[i], i});
            }
            while (!queue.isEmpty()) {
                int[] curr = queue.pollFirst();
                if (curr[0] - 1 > 0) {
                    queue.addLast(new int[]{curr[0] - 1, curr[1]});
                }
                time++;
                if (curr[1] == k && curr[0] - 1 == 0) {
                    return time;
                }
            }
            return time;
        }
    }
}
