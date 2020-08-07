package com.fishercoder.solutions;

import java.util.PriorityQueue;
import java.util.TreeMap;

public class _1057 {
    public static class Solution1 {
        public int[] assignBikes(int[][] workers, int[][] bikes) {
            int w = workers.length;
            int b = bikes.length;
            TreeMap<Integer, PriorityQueue<int[]>> treeMap = new TreeMap<>();
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < b; j++) {
                    int distance = Math.abs(workers[i][0] - bikes[j][0]) + Math.abs(workers[i][1] - bikes[j][1]);
                    if (!treeMap.containsKey(distance)) {
                        treeMap.put(distance, new PriorityQueue<>((x, y) -> x[0] == y[0] ? x[1] - y[1] : x[0] - y[0]));
                    }
                    treeMap.get(distance).add(new int[]{i, j});
                }
            }
            int[] ans = new int[w];
            for (int i = 0; i < w; i++) {
                ans[i] = -1;
            }
            boolean[] assigned = new boolean[b];
            int workersHaveBikes = 0;
            for (int dist : treeMap.keySet()) {
                PriorityQueue<int[]> workerBikePairs = treeMap.get(dist);
                while (!workerBikePairs.isEmpty()) {
                    int[] workerBikePair = workerBikePairs.poll();
                    if (ans[workerBikePair[0]] == -1 && !assigned[workerBikePair[1]]) {
                        assigned[workerBikePair[1]] = true;
                        ans[workerBikePair[0]] = workerBikePair[1];
                        workersHaveBikes++;
                    }
                }
                if (workersHaveBikes == w) {
                    return ans;
                }
            }
            return ans;
        }
    }
}
