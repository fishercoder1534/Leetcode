package com.fishercoder.solutions.secondthousand;

import java.util.PriorityQueue;

public class _1605 {
    public static class Solution1 {
        /*
         * My completely original solution:
         * 1. sort out your logic with a pen and paper first, greedy algorithm should be the way to go;
         * 2. each time, take out the minimum value from both rowSet and colSet, put that entire value onto the result grid,
         * then deduct that value from the other set if they are not equal, put it back into the minHeap, repeat until both minHeaps are empty;
         */
        public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
            // form two minHeaps, use their values to sort
            PriorityQueue<int[]> rowMinHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
            for (int i = 0; i < rowSum.length; i++) {
                rowMinHeap.offer(new int[] {i, rowSum[i]});
            }
            PriorityQueue<int[]> colMinHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
            for (int j = 0; j < colSum.length; j++) {
                colMinHeap.offer(new int[] {j, colSum[j]});
            }

            int[][] result = new int[rowSum.length][colSum.length];
            while (!colMinHeap.isEmpty() && !rowMinHeap.isEmpty()) {
                int[] minRow = rowMinHeap.poll();
                int[] minCol = colMinHeap.poll();
                if (minRow[1] < minCol[1]) {
                    result[minRow[0]][minCol[0]] = minRow[1];
                    colMinHeap.offer(new int[] {minCol[0], minCol[1] - minRow[1]});
                } else if (minRow[1] > minCol[1]) {
                    result[minRow[0]][minCol[0]] = minCol[1];
                    rowMinHeap.offer(new int[] {minRow[0], minRow[1] - minCol[1]});
                } else {
                    // the min values from row and col are equal
                    result[minRow[0]][minCol[0]] = minCol[1];
                }
            }
            return result;
        }
    }
}
