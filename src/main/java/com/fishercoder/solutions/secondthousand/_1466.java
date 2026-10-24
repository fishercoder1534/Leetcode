package com.fishercoder.solutions.secondthousand;

import java.util.*;

public class _1466 {
    public static class Solution1 {
        public int minReorder(int n, int[][] connections) {
            // key is entering city, value is departure city
            Map<Integer, Set<Integer>> map = new HashMap<>();
            Queue<Integer> queue = new LinkedList<>();
            int minReorder = 0;
            Set<Integer> visited = new HashSet<>();
            for (int i = 0; i < n; i++) {
                visited.add(i);
            }

            // key is departure city, value is entering city
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

                // for all those directly connected to city 0, must be reordered if not yet
                // and they are the start nodes of BFS
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

    public static class Solution2 {
        /*
         * Build an adjacency list and then BFS
         * Although this is a directed graph, we'll have to treat it as undirected graph first so that we can traverse all nodes
         */
        public int minReorder(int n, int[][] connections) {
            // int[] in the adjacency list that holds two integers, the first one means the node, the second one means the direction:
            // 0 means it's pointing to the capital or a city that's correctly pointing to the capital indirectly, i.e. doesn't need to be flipped,
            // 1 means it's the opposite direction, i.e. needs to be flipped
            List<List<int[]>> adjList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adjList.add(new ArrayList<>());
            }
            for (int[] conn : connections) {
                int u = conn[0];
                int v = conn[1];
                adjList.get(u).add(new int[]{v, 1});
                adjList.get(v).add(new int[]{u, 0});
            }
            int count = 0;
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(0);
            boolean[] visited = new boolean[n];
            visited[0] = true;
            while (!queue.isEmpty()) {
                Integer curr = queue.poll();
                for (int[] next : adjList.get(curr)) {
                    int neighbor = next[0];
                    int flip = next[1];
                    if (!visited[neighbor]) {
                        count += flip;
                        visited[neighbor] = true;
                        queue.offer(neighbor);
                    }
                }
            }
            return count;
        }
    }
}
