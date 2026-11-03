package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.List;

public class _1443 {
    public static class Solution1 {
        public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            for (int[] edge : edges) {
                graph.get(edge[0]).add(edge[1]);
                graph.get(edge[1]).add(edge[0]);
            }
            return dfs(0, -1, graph, hasApple);
        }

        private int dfs(int curr, int parent, List<List<Integer>> graph, List<Boolean> hasApple) {
            int totalTime = 0;
            for (int neighbor : graph.get(curr)) {
                if (neighbor == parent) {
                    continue; //avoid going back to the parent, i.e. this is a key step in a graph/tree problem where it's being represented in an adjacency list data structure
                }
                int timeFromChild = dfs(neighbor, curr, graph, hasApple);

                //if the child subtree has apples, or the child node itself has an apple
                if (timeFromChild > 0 || hasApple.get(neighbor)) {
                    totalTime += timeFromChild + 2; //we must traverse this edge, go down and come back up, so plus two
                }
            }
            return totalTime;
        }


    }
}
