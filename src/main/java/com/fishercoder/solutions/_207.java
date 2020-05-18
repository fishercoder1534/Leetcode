package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _207 {

    public static class Solution1 {
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
}
