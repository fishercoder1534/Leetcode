package com.fishercoder.solutions.fifththousand;

public class _4024 {
    public static class Solution1 {
        public int nearestDrone(int[][] drones, int[] target) {
            int shortestDistance = Integer.MAX_VALUE;
            int ans = -1;
            for (int i = 0; i < drones.length; i++) {
                int distance =
                        Math.abs(drones[i][0] - target[0]) + Math.abs(drones[i][1] - target[1]);
                if (distance <= drones[i][2] && distance < shortestDistance) {
                    shortestDistance = distance;
                    ans = i;
                }
            }
            return ans;
        }
    }
}
