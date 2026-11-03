package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.List;

public class _2477 {
    public static class Solution1 {
        private long totalFuel = 0;

        public long minimumFuelCost(int[][] roads, int seats) {
            int n = roads.length + 1;
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            for (int[] edge : roads) {
                graph.get(edge[0]).add(edge[1]);
                graph.get(edge[1]).add(edge[0]);
            }
            postorderDfs(0, -1, graph, seats);
            return totalFuel;
        }

        private long postorderDfs(int curr, int parent, List<List<Integer>> graph, int seats) {
            long people = 1; // count the rep from this current city
            for (int neighbour : graph.get(curr)) {
                if (neighbour == parent) {
                    continue;
                }
                //add all people from the child's subtree
                people += postorderDfs(neighbour, curr, graph, seats);
            }

            //if we are not at the capital, all people need to travel to the parent node
            if (curr != 0) {
                // Formula for ceiling division: (people + seats - 1) / seats
                totalFuel += (people + seats - 1) / seats;
            }
            return people;
        }
    }
}
