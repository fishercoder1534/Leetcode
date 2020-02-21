package com.fishercoder.solutions;

/**
 * 1066. Campus Bikes II
 *
 * On a campus represented as a 2D grid, there are N workers and M bikes, with N <= M. Each worker and bike is a 2D coordinate on this grid.
 * We assign one unique bike to each worker so that the sum of the Manhattan distances between each worker and their assigned bike is minimized.
 * The Manhattan distance between two points p1 and p2 is Manhattan(p1, p2) = |p1.x - p2.x| + |p1.y - p2.y|.
 * Return the minimum possible sum of Manhattan distances between each worker and their assigned bike.
 *
 * Example 1:
 * Input: workers = [[0,0],[2,1]], bikes = [[1,2],[3,3]]
 * Output: 6
 * Explanation:
 * We assign bike 0 to worker 0, bike 1 to worker 1. The Manhattan distance of both assignments is 3, so the output is 6.
 *
 * Example 2:
 * Input: workers = [[0,0],[1,1],[2,0]], bikes = [[1,0],[2,2],[2,1]]
 * Output: 4
 * Explanation:
 * We first assign bike 0 to worker 0, then assign bike 1 to worker 1 or worker 2, bike 2 to worker 2 or worker 1.
 * Both assignments lead to sum of the Manhattan distances as 4.
 *
 * Note:
 * 0 <= workers[i][0], workers[i][1], bikes[i][0], bikes[i][1] < 1000
 * All worker and bike locations are distinct.
 * 1 <= workers.length <= bikes.length <= 10
 * */
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
