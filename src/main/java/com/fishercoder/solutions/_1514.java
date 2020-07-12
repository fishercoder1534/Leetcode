package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class _1514 {
    public static class Solution1 {
        public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
            List<Integer>[] nodeToNodesList = new List[n];
            List<Double>[] nodeToProbabilitiesList = new List[n];
            for (int i = 0; i < n; i++) {
                nodeToNodesList[i] = new ArrayList<>();
                nodeToProbabilitiesList[i] = new ArrayList<>();
            }
            for (int i = 0; i < edges.length; i++) {
                int u = edges[i][0];
                int v = edges[i][1];
                double w = succProb[i];
                nodeToNodesList[u].add(v);
                nodeToProbabilitiesList[u].add(w);

                nodeToNodesList[v].add(u);
                nodeToProbabilitiesList[v].add(w);
            }

            double[] probabilities = new double[n];
            probabilities[start] = 1.0;
            boolean[] visited = new boolean[n];
            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(start);
            visited[start] = true;
            while (!queue.isEmpty()) {
                int u = queue.poll();
                visited[u] = false;

                for (int i = 0; i < nodeToNodesList[u].size(); i++) {
                    int v = nodeToNodesList[u].get(i);
                    double w = nodeToProbabilitiesList[u].get(i);
                    if (probabilities[u] * w > probabilities[v]) {
                        probabilities[v] = probabilities[u] * w;
                        if (!visited[v]) {
                            visited[v] = true;
                            queue.add(v);
                        }
                    }
                }
            }

            return probabilities[end];
        }
    }
}
