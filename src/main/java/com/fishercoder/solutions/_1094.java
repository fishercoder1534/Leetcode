package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _1094 {
    public static class Solution1 {
        public boolean carPooling(int[][] trips, int capacity) {
            Arrays.sort(trips, (a, b) -> a[1] - b[1]);
            PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
            for (int[] trip : trips) {
                int startTime = trip[1];
                int endTime = trip[2];
                while (!heap.isEmpty() && heap.peek()[1] <= startTime) {
                    int[] curr = heap.poll();
                    capacity += curr[0];
                }
                int peopleCnt = trip[0];
                capacity -= peopleCnt;
                if (capacity < 0) {
                    return false;
                }
                heap.offer(new int[]{peopleCnt, endTime});
            }
            return true;
        }
    }
}
