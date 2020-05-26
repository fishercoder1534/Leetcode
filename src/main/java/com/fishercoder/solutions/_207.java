package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class _207 {

    public static class Solution1 {
        /**Kahn's algorithm for topological sorting*/
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            int[] indegree = new int[numCourses];
            for (int[] prereq : prerequisites) {
                indegree[prereq[0]]++;
            }
            Set<Integer> zeroDegree = new HashSet();
            for (int i = 0; i < numCourses; i++) {
                if (indegree[i] == 0) {
                    zeroDegree.add(i);
                }
            }
            if (zeroDegree.isEmpty()) {
                return false;
            }

            while (!zeroDegree.isEmpty()) {
                Iterator<Integer> it = zeroDegree.iterator();
                int course = it.next();
                zeroDegree.remove(course);
                for (int[] prereq : prerequisites) {
                    if (prereq[1] == course) {
                        indegree[prereq[0]]--;
                        if (indegree[prereq[0]] == 0) {
                            zeroDegree.add(prereq[0]);
                        }
                    }
                }
            }

            for (int i : indegree) {
                if (i != 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static class Solution2 {
        /**
         * BFS
         */
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            int[] indegree = new int[numCourses];
            for (int[] pre : prerequisites) {
                indegree[pre[0]]++;
            }
            Queue<Integer> queue = new LinkedList();
            for (int i = 0; i < numCourses; i++) {
                if (indegree[i] == 0) {
                    queue.offer(i);
                }
            }
            if (queue.isEmpty()) {
                return false;
            }
            while (!queue.isEmpty()) {
                int course = queue.poll();
                for (int[] pre : prerequisites) {
                    if (pre[1] == course) {
                        indegree[pre[0]]--;
                        if (indegree[pre[0]] == 0) {
                            queue.offer(pre[0]);
                        }
                    }
                }
            }
            for (int degree : indegree) {
                if (degree != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
