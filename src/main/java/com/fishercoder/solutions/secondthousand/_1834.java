package com.fishercoder.solutions.secondthousand;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _1834 {
    public static class Solution1 {
        public int[] getOrder(int[][] tasks) {
            int n = tasks.length;

            // store task info and then sort it
            int[][] sortedTasks = new int[n][3];
            for (int i = 0; i < n; i++) {
                sortedTasks[i] = new int[] {tasks[i][0], tasks[i][1], i};
            }

            // sort them by enqueue time
            Arrays.sort(sortedTasks, (a, b) -> a[0] - b[0]);

            // then sort them by their processing time, if tied, then by their indexes
            PriorityQueue<int[]> pq =
                    new PriorityQueue<>(
                            (a, b) -> {
                                if (a[1] != b[1]) {
                                    return a[1] - b[1]; // sort by processing time
                                }
                                return a[2] - b[2]; // sort by originalIndex
                            });

            int[] order = new int[n];
            long currentTime = 0;
            int taskIndex = 0;
            int resultIndex = 0;

            while (resultIndex < n) {
                // if pq is empty and next task is in the future, we'll fast forward the CPU time
                if (pq.isEmpty() && currentTime < sortedTasks[taskIndex][0]) {
                    currentTime = sortedTasks[taskIndex][0];
                }

                // add all tasks that become available to process
                while (taskIndex < n && sortedTasks[taskIndex][0] <= currentTime) {
                    pq.offer(sortedTasks[taskIndex++]);
                }

                // process the next possible one
                int[] current = pq.poll();
                order[resultIndex++] = current[2];
                currentTime += current[1];
            }
            return order;
        }
    }
}
