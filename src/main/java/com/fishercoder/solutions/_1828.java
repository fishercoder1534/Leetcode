package com.fishercoder.solutions;

public class _1828 {
    public static class Solution1 {
        public int[] countPoints(int[][] points, int[][] queries) {
            int[] result = new int[queries.length];
            int i = 0;
            for (int[] query : queries) {
                int pts = 0;
                for (int[] point : points) {
                    if ((point[0] - query[0]) * (point[0] - query[0]) + (point[1] - query[1]) * (point[1] - query[1]) <= query[2] * query[2]) {
                        pts++;
                    }
                }
                result[i++] = pts;
            }
            return result;
        }
    }
}
