package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _785 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/is-graph-bipartite/discuss/115503/java-BFS
         */
        public boolean isBipartite(int[][] graph) {
            int[] visited = new int[graph.length];
            //BFS
            //0 means never encountered before, 1 means we put this node into set A, 2 means we put this node into set B
            for (int i = 0; i < graph.length; i++) {
                if (graph[i].length != 0 && visited[i] == 0) {
                    visited[i] = 1;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.offer(i);
                    while (!queue.isEmpty()) {
                        int current = queue.poll();
                        for (int node : graph[current]) {
                            if (visited[node] == 0) {
                                //if the current node is in set A (1), then we put its neighbor in set B (2), otherwise set A (1)
                                visited[node] = (visited[current] == 1) ? 2 : 1;
                                queue.offer(node);
                            } else {
                                if (visited[node] == visited[current]) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    public static class Solution2 {
        /**
         * credit: https://leetcode.com/problems/is-graph-bipartite/solution/
         * <p>
         * Let red indicate set A and blue indicate set B, if the graph is a bipartite,
         * we should be able to greedily color this graph: for each node, if we color it red, then color all of its neighbors blue, etc.
         */
        public boolean isBipartite(int[][] graph) {
            //0 means uncolored, 1 means red and 2 means blue
            int[] colors = new int[graph.length];
            for (int start = 0; start < graph.length; start++) {
                if (colors[start] == 0) {
                    Stack<Integer> stack = new Stack<>();
                    stack.push(start);
                    colors[start] = 1;//color it to be red

                    while (!stack.isEmpty()) {
                        Integer curr = stack.pop();
                        for (int neighbor : graph[curr]) {
                            if (colors[neighbor] == 0) {
                                stack.push(neighbor);
                                //if the current node is red (1), then we color it to be blue (2), otherwise red (1)
                                colors[neighbor] = (colors[curr] == 1) ? 2 : 1;
                            } else if (colors[neighbor] == colors[curr]) {
                                //this means the two connected nodes have the same color, so this is not a bipartite
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
    }
}
