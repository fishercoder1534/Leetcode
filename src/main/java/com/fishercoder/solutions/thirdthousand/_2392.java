package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _2392 {
    public static class Solution1 {
        /**
         * I figured out I needed to use Kahn's algorithm to topologically sort both rowConditions and colConditions,
         * but unsure how to fill the matrix.
         * https://leetcode.com/problems/build-a-matrix-with-conditions/editorial/ is brilliant as of how to build the matrix:
         * using its slides to step through helps a lot!
         */
        public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
            int[] topologicallySortedRows = topologicalSort(rowConditions, k);
            int[] topologicallySortedCols = topologicalSort(colConditions, k);
            if (topologicallySortedRows.length == 0 || topologicallySortedCols.length == 0) {
                return new int[][]{};
            }
            int[][] matrix = new int[k][k];
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    if (topologicallySortedRows[i] == topologicallySortedCols[j]) {
                        matrix[i][j] = topologicallySortedCols[j];
                    }
                }
            }
            return matrix;
        }

        private int[] topologicalSort(int[][] conditions, int k) {
            List<Integer>[] adj = new ArrayList[k + 1];
            for (int i = 0; i <= k; i++) {
                adj[i] = new ArrayList<>();
            }
            int[] indegree = new int[k + 1];
            int[] order = new int[k];
            int index = 0;
            for (int[] x : conditions) {
                adj[x[0]].add(x[1]);
                indegree[x[1]]++;
            }
            Queue<Integer> q = new LinkedList<>();
            for (int i = 1; i <= k; i++) {
                if (indegree[i] == 0) {
                    q.offer(i);
                }
            }
            while (!q.isEmpty()) {
                Integer curr = q.poll();
                order[index++] = curr;
                k--;
                for (int v : adj[curr]) {
                    indegree[v]--;
                    if (indegree[v] == 0) {
                        q.offer(v);
                    }
                }
            }
            if (k != 0) {
                return new int[0];
            }
            return order;
        }
    }
}
