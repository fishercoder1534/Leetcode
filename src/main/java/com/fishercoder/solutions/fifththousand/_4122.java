package com.fishercoder.solutions.fifththousand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class _4122 {
    public static class Solution1 {
        public long[] earliestActivationTimes(int n, int[][] edges, int[] requiredSignals) {
            List<List<int[]>> adj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int delay = edge[2];
                adj.get(u).add(new int[]{v, delay});
            }
            long[] ans = new long[n];
            Arrays.fill(ans, -1);
            ans[0] = 0;
            boolean[] activated = new boolean[n];
            activated[0] = true;
            int[] signalsReceived = new int[n];
            PriorityQueue<long[]> minHeap = new PriorityQueue<>((a, b) -> (int) (a[1] - b[1]));
            for (int[] neighbor : adj.get(0)) {
                minHeap.add(new long[]{neighbor[0], neighbor[1]});
            }
            while (!minHeap.isEmpty()) {
                long[] curr = minHeap.poll();
                int node = Math.toIntExact(curr[0]);
                long time = curr[1];
                if (activated[node]) {
                    continue;
                }
                signalsReceived[node]++;
                if (signalsReceived[node] == requiredSignals[node]) {
                    activated[node] = true;
                    ans[node] = time;
                    for (int[] neighbor : adj.get(node)) {
                        int v = neighbor[0];
                        long delay = neighbor[1];
                        if (!activated[v]) {
                            minHeap.add(new long[]{v, delay + time});
                        }
                    }
                }
            }
            return ans;
        }
    }
}
