package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.List;

public class _1059 {
    public static class Solution1 {
        /*
         * Credit: https://leetcode.com/problems/all-paths-from-source-lead-to-destination/editorial/
         * A very powerful algorithm, three colors to DFS a tree/graph.
         */
        enum Color {
            WHITE,
            GRAY,
            BLACK
        }

        public boolean leadsToDestination(int n, int[][] edges, int source, int destination) {
            List<Integer>[] graph = buildGraph(n, edges);
            Color[] colors = new Color[n];
            for (int i = 0; i < n; i++) {
                colors[i] = Color.WHITE;
            }
            return leadsToDest(graph, colors, source, destination);
        }

        private boolean leadsToDest(
                List<Integer>[] graph, Color[] colors, int node, int destination) {
            // if it's not WHITE, then it should be BLACK, otherwise, there's a circle
            if (colors[node] != Color.WHITE) {
                return colors[node] == Color.BLACK;
            }
            // if this is a leaf node, then it should be destination, otherwise, it's a dead end and
            // we return false
            if (graph[node].size() == 0) {
                return node == destination;
            }

            // now, we start processing this node and mark it as GRAY
            colors[node] = Color.GRAY;
            for (int neighbor : graph[node]) {
                if (!leadsToDest(graph, colors, neighbor, destination)) {
                    return false;
                }
            }
            // recursive processing is done, we mark it as BLACK
            colors[node] = Color.BLACK;
            return true;
        }

        private static List<Integer>[] buildGraph(int n, int[][] edges) {
            List<Integer>[] graph = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int[] edge : edges) {
                graph[edge[0]].add(edge[1]);
            }
            return graph;
        }
    }
}
