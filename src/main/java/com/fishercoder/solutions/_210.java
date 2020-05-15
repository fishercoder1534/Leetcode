package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class _210 {

    public static class Solution1 {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            int[] inDegree = new int[numCourses];
            for (int[] course : prerequisites) {
                inDegree[course[0]]++;
            }

            Set<Integer> zeroDegree = new HashSet();
            Queue<Integer> queue = new LinkedList();
            for (int i = 0; i < numCourses; i++) {
                if (inDegree[i] == 0) {
                    zeroDegree.add(i);
                    queue.offer(i);
                }
            }

            if (zeroDegree.isEmpty()) {
                return new int[0];
            }

            while (!zeroDegree.isEmpty()) {
                Iterator<Integer> it = zeroDegree.iterator();
                int course = it.next();
                zeroDegree.remove(course);
                for (int[] pre : prerequisites) {
                    if (course == pre[1]) {
                        inDegree[pre[0]]--;
                        if (inDegree[pre[0]] == 0) {
                            zeroDegree.add(pre[0]);
                            queue.offer(pre[0]);
                        }
                    }
                }
            }

            for (int i = 0; i < numCourses; i++) {
                if (inDegree[i] != 0) {
                    return new int[0];
                }
            }

            int[] result = new int[queue.size()];
            int i = 0;
            while (!queue.isEmpty()) {
                result[i++] = queue.poll();
            }
            return result;
        }
    }
}
