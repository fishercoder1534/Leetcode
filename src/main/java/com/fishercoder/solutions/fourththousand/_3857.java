package com.fishercoder.solutions.fourththousand;

import java.util.LinkedList;
import java.util.Queue;

public class _3857 {
    public static class Solution1 {
        public int minCost(int n) {
            int cost = 0;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(n);
            while (!queue.isEmpty()) {
                Integer curr = queue.poll();
                int[] pair = divide(curr);
                cost += pair[0] * pair[1];
                for (int num : pair) {
                    if (num > 1) {
                        queue.add(num);
                    }
                }
            }
            return cost;
        }

        private int[] divide(int n) {
            if (n % 2 == 0) {
                return new int[]{n / 2, n / 2};
            }
            return new int[]{n / 2, n / 2 + 1};
        }
    }
}
