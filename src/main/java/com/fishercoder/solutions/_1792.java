package com.fishercoder.solutions;

import java.util.PriorityQueue;

public class _1792 {
    public static class Solution1 {
        /**
         * We use the change size to order the elements in the maxHeap.
         */
        public double maxAverageRatio(int[][] classes, int extraStudents) {
            PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a, b) -> -Double.compare(a[0], b[0]));
            for (int[] c : classes) {
                maxHeap.offer(new double[]{(double) (c[0] + 1) / (c[1] + 1) - (double) c[0] / c[1], c[0], c[1]});
            }
            while (extraStudents-- > 0) {
                double[] curr = maxHeap.poll();
                curr[1]++;
                curr[2]++;
                curr[0] = (curr[1] + 1) / (curr[2] + 1) - curr[1] / curr[2];
                maxHeap.offer(curr);
            }
            double result = 0.0;
            int size = maxHeap.size();
            while (!maxHeap.isEmpty()) {
                double[] curr = maxHeap.poll();
                result += curr[1] / curr[2];
            }
            return result / size;
        }
    }
}
