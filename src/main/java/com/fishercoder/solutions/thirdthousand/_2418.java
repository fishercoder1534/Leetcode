package com.fishercoder.solutions.thirdthousand;

import java.util.PriorityQueue;

public class _2418 {
    public static class Solution1 {
        public String[] sortPeople(String[] names, int[] heights) {
            PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
            for (int i = 0; i < names.length; i++) {
                maxHeap.offer(new int[] {i, heights[i]});
            }
            String[] res = new String[names.length];
            int i = 0;
            while (!maxHeap.isEmpty()) {
                res[i++] = names[maxHeap.poll()[0]];
            }
            return res;
        }
    }
}
