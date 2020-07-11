package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Contest {

    public int minNumberOfSemesters(int n, int[][] dependencies, int k) {
        int[] indegree = new int[n + 1];
        for (int[] prereq : dependencies) {
            indegree[prereq[1]]++;
        }
        Queue<Integer> zeroDegreeQueue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (indegree[i] == 0) {
                zeroDegreeQueue.add(i);
            }
        }
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] dep : dependencies) {
            if (!map.containsKey(dep[1])) {
                map.put(dep[1], new HashSet<>());
            }
            map.get(dep[1]).add(dep[0]);
        }
        int semesterCount = 0;
        int coursesToTakeThisSemester = 0;
        while (!zeroDegreeQueue.isEmpty()) {
            int size = zeroDegreeQueue.size();
            Set<Integer> removedAtThisLevel = new HashSet<>();
            for (int i = 0; i < zeroDegreeQueue.size() && coursesToTakeThisSemester < k; i++) {
                int course = zeroDegreeQueue.poll();
                removedAtThisLevel.add(course);
                coursesToTakeThisSemester++;
                for (int[] dep : dependencies) {
                    if (dep[0] == course) {
                        indegree[dep[1]]--;
                        if (indegree[dep[1]] == 0) {
                            zeroDegreeQueue.add(dep[1]);
                        }
                    }
                }
                if (coursesToTakeThisSemester >= k) {
                    semesterCount++;
                    coursesToTakeThisSemester = 0;
                    break;
                } else if (i + 1 == size) {
                    if (removedAtThisLevel.retainAll(map.get(zeroDegreeQueue.peek()))) {
                        semesterCount++;
                        coursesToTakeThisSemester = 0;
                        break;
                    } else {
                        coursesToTakeThisSemester++;
                        break;
                    }
                }
            }
            removedAtThisLevel.clear();
        }
        semesterCount += coursesToTakeThisSemester > 0 ? 1 : 0;
        return semesterCount;
    }

    public static void main(String... args) {
        System.out.println("Hello!");
        Contest contest = new Contest();
//        System.out.println(contest.minNumberOfSemesters(4, new int[][]{
//                {2, 1},
//                {3, 1},
//                {1, 4}
//        }, 2));//3
//
//        System.out.println(contest.minNumberOfSemesters(5, new int[][]{
//                {2, 1},
//                {3, 1},
//                {4, 1},
//                {1, 5}
//        }, 2));//4
//
//        System.out.println(contest.minNumberOfSemesters(4, new int[][]{
//                {2, 1},
//                {4, 3},
//                {1, 3},
//                {2, 3}
//        }, 4));//3
//
//        System.out.println(contest.minNumberOfSemesters(8, new int[][]{
//                {1, 6},
//                {2, 7},
//                {8, 7},
//                {2, 5},
//                {3, 4}
//        }, 3));//3

//        System.out.println(contest.minNumberOfSemesters(9, new int[][]{
//                {4, 8},
//                {3, 6},
//                {6, 8},
//                {7, 6},
//                {4, 2},
//                {4, 1},
//                {4, 7},
//                {3, 7},
//                {5, 2},
//                {5, 9},
//                {3, 4},
//                {6, 9},
//                {5, 7},
//        }, 2));//5

//        Set<Coord> visited = new HashSet<>();
//        visited.add(new Coord(0, 0));
//        System.out.println(visited.contains(new Coord(0, 0)));
////        System.out.println(contest.isPathCrossing("NES"));
//        System.out.println(contest.isPathCrossing("NSSEN"));
//        System.out.println(contest.canArrange(new int[]{1, 2, 3, 4, 5, 10, 6, 7, 8, 9}, 5));

//        System.out.println(contest.getLastMoment(4, new int[]{4, 3}, new int[]{0, 1}));
//        System.out.println(contest.getLastMoment(7, new int[]{0,1,2,3,4,5,6,7}, new int[]{}));//7, correct
        System.out.println("Finished!");
    }

}

