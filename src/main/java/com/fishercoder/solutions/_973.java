package com.fishercoder.solutions;

import java.util.PriorityQueue;

public class _973 {

    public static class Solution1 {
        public int[][] kClosest(int[][] points, int k) {
            int[][] ans = new int[k][2];

            PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
                double dist1 = getDistance(o1);
                double dist2 = getDistance(o2);

                if (dist1 > dist2) {
                    return 1;
                } else if (dist1 < dist2) {
                    return -1;
                } else {
                    return 0;
                }
            });

            for (int[] point : points) {
                pq.add(point);
            }

            for (int i = 0; i < k; i++) {
                ans[i] = pq.poll();
            }

            return ans;
        }

        private double getDistance(int[] point) {
            return Math.sqrt(Math.pow(point[0], 2) + Math.pow(point[1], 2));
        }
    }
}
