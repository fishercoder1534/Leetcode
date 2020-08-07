package com.fishercoder.solutions;

public class _1066 {
    public static class Solution1 {
        int minSum = Integer.MAX_VALUE;

        public int assignBikes(int[][] workers, int[][] bikes) {
            backtracking(workers, bikes, 0, new boolean[bikes.length], 0);
            return minSum;
        }

        private void backtracking(int[][] workers, int[][] bikes, int workersIndex, boolean[] bikesAssigned, int currentSum) {
            if (workersIndex >= workers.length) {
                minSum = Math.min(minSum, currentSum);
                return;
            }

            if (currentSum > minSum) {
                return;
            }

            for (int j = 0; j < bikes.length; j++) {
                if (!bikesAssigned[j]) {
                    bikesAssigned[j] = true;
                    backtracking(workers, bikes, workersIndex + 1, bikesAssigned, currentSum + dist(workers[workersIndex], bikes[j]));
                    bikesAssigned[j] = false;
                }
            }
        }

        private int dist(int[] worker, int[] bike) {
            return Math.abs(worker[0] - bike[0]) + Math.abs(worker[1] - bike[1]);
        }
    }
}
