package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _1376 {
    public static class Solution1 {
        int maxMinutes = 0;

        public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
            boolean[] visited = new boolean[manager.length];
            Set<Integer> managerIdSet = new HashSet<>();
            for (int id : manager) {
                managerIdSet.add(id);
            }
            Set<Integer> visitedEmployees = new HashSet<>();
            for (int i = 0; i < n; i++) {
                visitedEmployees.add(i);
            }

            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < manager.length; i++) {
                if (!map.containsKey(manager[i])) {
                    map.put(manager[i], new ArrayList<>());
                }
                map.get(manager[i]).add(i);
            }
            backtracking(visited, headID, 0, informTime, managerIdSet, visitedEmployees, map);
            return maxMinutes;
        }

        private void backtracking(boolean[] visited, int managerId, int currentMinutes, int[] informTime, Set<Integer> managerIdSet, Set<Integer> visitedEmployees, Map<Integer, List<Integer>> map) {
            if (visitedEmployees.contains(managerId)) {
                visitedEmployees.remove(managerId);
            }
            if (!managerIdSet.contains(managerId)) {
                maxMinutes = Math.max(currentMinutes, maxMinutes);
                return;
            }
            if (visitedEmployees.isEmpty()) {
                return;
            }
            visited[managerId] = true;
            if (map.containsKey(managerId)) {
                List<Integer> suboridnates = map.get(managerId);
                for (int subordinate : suboridnates) {
                    if (!visited[subordinate]) {
                        backtracking(visited, subordinate, currentMinutes + informTime[managerId], informTime, managerIdSet, visitedEmployees, map);
                    }
                }
            }
        }
    }
}
