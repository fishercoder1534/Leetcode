package com.fishercoder.solutions;

import java.util.PriorityQueue;

public class _1642 {
    public static class Solution1 {
        public int furthestBuilding(int[] heights, int bricks, int ladders) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            int i = 0;
            //we'll assume to use ladders for the first l jumps and adjust it afterwards
            for (; i < heights.length - 1 && minHeap.size() < ladders; i++) {
                int diff = heights[i + 1] - heights[i];
                if (diff > 0) {
                    minHeap.offer(diff);
                }
            }
            //now ladders have been used up, we'll use bricks to jump
            while (i < heights.length - 1) {
                int diff = heights[i + 1] - heights[i];
                if (diff > 0) {
                    //we'll check if the last one that cost a ladder could actually be filled with some bricks
                    if (!minHeap.isEmpty() && minHeap.peek() < diff) {
                        bricks -= minHeap.poll();
                        minHeap.offer(diff);
                    } else {
                        bricks -= diff;
                    }
                    if (bricks < 0) {
                        return i;
                    }
                }
                i++;
            }
            return i;
        }
    }
}
