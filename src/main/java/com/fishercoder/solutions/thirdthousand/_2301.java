package com.fishercoder.solutions.thirdthousand;

import java.util.PriorityQueue;

public class _2301 {
    public static class Solution1 {
        public int getNumberOfBacklogOrders(int[][] orders) {
            PriorityQueue<int[]> buy = new PriorityQueue<>((a, b) -> b[0] - a[0]);
            PriorityQueue<int[]> sell = new PriorityQueue<>((a, b) -> a[0] - b[0]);
            for (int[] order : orders) {
                int price = order[0], amount = order[1], type = order[2];
                if (type == 0) {
                    while (amount > 0 && !sell.isEmpty() && sell.peek()[0] <= price) {
                        int[] s = sell.peek();
                        int exec = Math.min(amount, s[1]);
                        amount -= exec;
                        s[1] -= exec;
                        if (s[1] == 0) sell.poll();
                    }
                    if (amount > 0) buy.offer(new int[]{price, amount});
                } else {
                    while (amount > 0 && !buy.isEmpty() && buy.peek()[0] >= price) {
                        int[] b = buy.peek();
                        int exec = Math.min(amount, b[1]);
                        amount -= exec;
                        b[1] -= exec;
                        if (b[1] == 0) buy.poll();
                    }
                    if (amount > 0) sell.offer(new int[]{price, amount});
                }
            }
            long total = 0;
            int MOD = 1_000_000_007;
            for (int[] b : buy) total = (total + b[1]) % MOD;
            for (int[] s : sell) total = (total + s[1]) % MOD;
            return (int) total;
        }
    }
}
