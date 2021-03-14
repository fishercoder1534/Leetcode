package com.fishercoder.solutions;

public class _1791 {
    public static class Solution1 {
        public int findCenter(int[][] edges) {
            int[] neighbors = new int[edges.length + 1];
            for (int[] edge : edges) {
                int a = edge[0];
                int b = edge[1];
                neighbors[a - 1]++;
                neighbors[b - 1]++;
            }
            for (int i = 0; i < neighbors.length; i++) {
                if (neighbors[i] == edges.length) {
                    return i + 1;
                }
            }
            return -1;
        }
    }
}
