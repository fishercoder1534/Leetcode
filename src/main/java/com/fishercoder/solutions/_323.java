package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
