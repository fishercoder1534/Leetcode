package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 630. Course Schedule III
 *
 * There are n different online courses numbered from 1 to n.
 * Each course has some duration(course length) t and closed on dth day.
 * A course should be taken continuously for t days and must be finished before or on the dth day. You will start at the 1st day.

 Given n online courses represented by pairs (t,d), your task is to find the maximal number of courses that can be taken.

 Example:
 Input: [[100, 200], [200, 1300], [1000, 1250], [2000, 3200]]
 Output: 3

 Explanation:
 There're totally 4 courses, but you can take 3 courses at most:
 First, take the 1st course, it costs 100 days so you will finish it on the 100th day, and ready to take the next course on the 101st day.
 Second, take the 3rd course, it costs 1000 days so you will finish it on the 1100th day, and ready to take the next course on the 1101st day.
 Third, take the 2nd course, it costs 200 days so you will finish it on the 1300th day.
 The 4th course cannot be taken now, since you will finish it on the 3300th day, which exceeds the closed date.

 Note:
 The integer 1 <= d, t, n <= 10,000.
 You can't take two courses simultaneously.
 */
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
