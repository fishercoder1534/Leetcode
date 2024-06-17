package com.fishercoder.solutions._1st_thousand;

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

    public static class Solution2 {
        public int[][] kClosest(int[][] points, int k) {
            PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
            for (int[] point : points) {
                long distance = (long) point[0] * point[0] + point[1] * point[1];
                if (maxHeap.size() < k) {
                    maxHeap.offer(point);
                } else {
                    int[] peek = maxHeap.peek();
                    long peekedDistance = (long) peek[0] * peek[0] + peek[1] * peek[1];
                    if (peekedDistance > distance) {
                        //this is an optimization so that the space complexity is limited to O(k)
                        maxHeap.poll();
                        maxHeap.offer(point);
                    }
                }
            }
            int[][] result = new int[k][2];
            for (int i = 0; i < k; i++) {
                int[] point = maxHeap.poll();
                result[i] = point;
            }
            return result;
        }
    }
}
