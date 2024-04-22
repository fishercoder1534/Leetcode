package com.fishercoder.solutions;

import java.util.PriorityQueue;

public class _2208 {
    public static class Solution1 {
        public int halveArray(int[] nums) {
            PriorityQueue<Double> heap = new PriorityQueue<>((a, b) -> Double.compare(b, a));
            double sum = 0;
            for (int num : nums) {
                heap.offer(Double.valueOf(num));
                sum += num;
            }
            double half = (double) sum / 2;
            int ops = 0;
            while (sum > half) {
                Double max = heap.poll();
                sum -= max;
                double h = max / 2;
                sum += h;
                heap.offer(h);
                ops++;
            }
            return ops;
        }
    }
}
