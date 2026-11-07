package com.fishercoder.solutions.secondthousand;

import java.util.PriorityQueue;

public class _1882 {
    public static class Solution1 {
        public int[] assignTasks(int[] servers, int[] tasks) {
            PriorityQueue<int[]> availableServers = new PriorityQueue<>((a, b) -> {
                //a[0] is the weight, a[1] is the index
                if (a[0] != b[0]) {
                    return a[0] - b[0];
                }
                return a[1] - b[1];
            });
            for (int i = 0; i < servers.length; i++) {
                availableServers.offer(new int[]{servers[i], i});
            }

            PriorityQueue<int[]> busyServers = new PriorityQueue<>((a, b) -> {
                //a[0] is at which second this server will be able to complete the assigned task and become free again
                //a[1] is the server's original index
                if (a[0] != b[0]) {
                    return a[0] - b[0];
                }
                return a[1] - b[1];
            });

            int[] ans = new int[tasks.length];
            int currentTime = 0;
            for (int i = 0; i < tasks.length; i++) {
                currentTime = Math.max(i, currentTime);

                while (!busyServers.isEmpty() && busyServers.peek()[0] <= currentTime) {
                    int[] busy = busyServers.poll();
                    availableServers.offer(new int[]{servers[busy[1]], busy[1]});
                }

                if (availableServers.isEmpty()) {
                    currentTime = busyServers.peek()[0];
                    while (!busyServers.isEmpty() && busyServers.peek()[0] <= currentTime) {
                        int[] busy = busyServers.poll();
                        availableServers.offer(new int[]{servers[busy[1]], busy[1]});
                    }
                }
                int[] server = availableServers.poll();
                int serverIndex = server[1];
                ans[i] = serverIndex;
                busyServers.offer(new int[]{tasks[i] + currentTime, serverIndex});
            }
            return ans;
        }
    }
}
