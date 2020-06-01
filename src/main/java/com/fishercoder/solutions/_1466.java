package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class _1466 {
    public static class Solution1 {
        public int minReorder(int n, int[][] connections) {
            //key is entering city, value is departure city
            Map<Integer, Set<Integer>> map = new HashMap<>();
            Queue<Integer> queue = new LinkedList<>();
            int minReorder = 0;
            Set<Integer> visited = new HashSet<>();
            for (int i = 0; i < n; i++) {
                visited.add(i);
            }

            //key is departure city, value is entering city
            Map<Integer, Set<Integer>> reverseMap = new HashMap<>();
            for (int[] con : connections) {
                if (!map.containsKey(con[1])) {
                    map.put(con[1], new HashSet<>());
                }
                map.get(con[1]).add(con[0]);

                if (!reverseMap.containsKey(con[0])) {
                    reverseMap.put(con[0], new HashSet<>());
                }
                reverseMap.get(con[0]).add(con[1]);

                //for all those directly connected to city 0, must be reordered if not yet
                //and they are the start nodes of BFS
                if (con[0] == 0) {
                    minReorder++;
                    queue.offer(con[1]);
                    visited.remove(con[1]);
                    visited.remove(0);
                }
                if (con[1] == 0) {
                    queue.offer(con[0]);
                    visited.remove(0);
                }
            }
            while (!queue.isEmpty() || !visited.isEmpty()) {
                int curr = queue.poll();
                visited.remove(curr);
                if (map.containsKey(curr)) {
                    Set<Integer> departureCityList = map.get(curr);
                    for (int city : departureCityList) {
                        if (visited.contains(city)) {
                            queue.offer(city);
                        }
                    }
                }
                if (reverseMap.containsKey(curr)) {
                    Set<Integer> enteringCityList = reverseMap.get(curr);
                    for (int city : enteringCityList) {
                        if (visited.contains(city)) {
                            queue.offer(city);
                            minReorder++;
                        }
                    }
                }
            }
            return minReorder;
        }
    }
}
