package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _630 {
    public static class Solution1 {
        /**
         * Reference: https://discuss.leetcode.com/topic/93790/short-java-code-using-priorityqueue
         * Sort by finish date!!! This is greedy! We should take those classes that finish early first.
         */
        public int scheduleCourse(int[][] courses) {
            Arrays.sort(courses, (a, b) -> a[1] - b[1]);
            int day = 0;
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
            for (int[] course : courses) {
                day += course[0];
                maxHeap.offer(course[0]);
                if (day > course[1]) {
                    day -= maxHeap.poll();//drop the previous courses that took the most time
                }
            }
            return maxHeap.size();
        }
    }
}
