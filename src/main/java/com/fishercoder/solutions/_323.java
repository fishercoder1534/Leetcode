package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 323. Number of Connected Components in an Undirected Graph
 *
 *  Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each edge is a pair of nodes), write a function to find the number of connected components in an undirected graph.

 Example 1:

 0          3
 |          |
 1 --- 2    4

 Given n = 5 and edges = [[0, 1], [1, 2], [3, 4]], return 2.

 Example 2:

 0           4
 |           |
 1 --- 2 --- 3

 Given n = 5 and edges = [[0, 1], [1, 2], [2, 3], [3, 4]], return 1.

 Note:
 You can assume that no duplicate edges will appear in edges. Since all edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear together in edges.
 */
public class _323 {
    public static class Solution1 {

        public int countComponents(int n, int[][] edges) {
            if (n <= 1) {
                return n;
            }

            List<List<Integer>> adList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adList.add(new ArrayList<>());
            }

            for (int[] edge : edges) {
                adList.get(edge[0]).add(edge[1]);
                adList.get(edge[1]).add(edge[0]);
            }

            for (List<Integer> list : adList) {
                for (int i : list) {
                    System.out.print(i + ", ");
                }
                System.out.println();
            }

            boolean[] visited = new boolean[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    count++;
                    Queue<Integer> q = new LinkedList<>();
                    q.offer(i);
                    while (!q.isEmpty()) {
                        int index = q.poll();
                        visited[index] = true;
                        for (int j : adList.get(index)) {
                            if (!visited[j]) {
                                q.offer(j);
                            }
                        }
                    }
                }
            }

            return count;
        }
    }

}
