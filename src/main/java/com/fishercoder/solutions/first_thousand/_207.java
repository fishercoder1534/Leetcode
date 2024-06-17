package com.fishercoder.solutions.first_thousand;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * 207. Course Schedule
 * <p>
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
 * You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.
 * For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
 * Return true if you can finish all courses. Otherwise, return false.
 * <p>
 * Example 1:
 * Input: numCourses = 2, prerequisites = [[1,0]]
 * Output: true
 * Explanation: There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0. So it is possible.
 * <p>
 * Example 2:
 * Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
 * Output: false
 * Explanation: There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 * <p>
 * Constraints:
 * 1 <= numCourses <= 2000
 * 0 <= prerequisites.length <= 5000
 * prerequisites[i].length == 2
 * 0 <= ai, bi < numCourses
 * All the pairs prerequisites[i] are unique.
 */
public class _207 {

    public static class Solution1 {
        /**
         * Kahn's algorithm for topological sorting
         */
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
                for (int[] pre : prerequisites) {
                    if (pre[1] == course) {
                        indegree[pre[0]]--;
                        if (indegree[pre[0]] == 0) {
                            zeroDegree.add(pre[0]);
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

    public static class Solution3 {
        /**
         * DFS, the fastest method in all, with the help of a cache and also converted edges into adjacency list,
         * although theoretically, all these three methods' time complexity are: O(V+E)
         */
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            List<List<Integer>> courseList = new ArrayList<>();
            for (int i = 0; i < numCourses; i++) {
                courseList.add(new ArrayList<>());
            }
            for (int[] pre : prerequisites) {
                courseList.get(pre[1]).add(pre[0]);
            }
            int[] visited = new int[numCourses];
            //visit each course using DFS
            for (int i = 0; i < numCourses; i++) {
                if (!dfs(i, courseList, visited)) {
                    return false;
                }
            }
            return true;
        }

        private boolean dfs(int course, List<List<Integer>> courseList, int[] visited) {
            visited[course] = 1;//mark as temporarily visited
            List<Integer> coursesCanBeTaken = courseList.get(course);
            for (int i = 0; i < coursesCanBeTaken.size(); i++) {
                int courseToTake = coursesCanBeTaken.get(i);
                if (visited[courseToTake] == 1) {
                    return false;
                }
                if (visited[courseToTake] == 0) {
                    if (!dfs(courseToTake, courseList, visited)) {
                        return false;
                    }
                }
            }
            visited[course] = 2;//mark it as completely done.
            return true;
        }
    }
}
