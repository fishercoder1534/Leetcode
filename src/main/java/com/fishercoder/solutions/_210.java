package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 210. Course Schedule II
 *
 * There are a total of n courses you have to take, labeled from 0 to n - 1.
 Some courses may have prerequisites, for example to take course 0 you have to first take course 1,
 which is expressed as a pair: [0,1]
 Given the total number of courses and a list of prerequisite pairs,
 return the ordering of courses you should take to finish all courses.

 There may be multiple correct orders,
 you just need to return one of them.
 If it is impossible to finish all courses, return an empty array.

 For example:

 2, [[1,0]]
 There are a total of 2 courses to take.
 To take course 1 you should have finished course 0. So the correct course order is [0,1]

 4, [[1,0],[2,0],[3,1],[3,2]]
 There are a total of 4 courses to take.
 To take course 3 you should have finished both courses 1 and 2.
 Both courses 1 and 2 should be taken after you finished course 0.
 So one correct course order is [0,1,2,3]. Another correct ordering is[0,2,1,3].

 Note:
 The input prerequisites is a graph represented by a list of edges, not adjacency matrices. Read more about how a graph is represented.
 You may assume that there are no duplicate edges in the input prerequisites.
 click to show more hints.

 Hints:
 This problem is equivalent to finding the topological order in a directed graph. If a cycle exists, no topological ordering exists and therefore it will be impossible to take all courses.
 Topological Sort via DFS - A great video tutorial (21 minutes) on Coursera explaining the basic concepts of Topological Sort.
 Topological sort could also be done via BFS.
 */
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
