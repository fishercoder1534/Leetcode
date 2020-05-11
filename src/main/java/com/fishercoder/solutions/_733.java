package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _733 {
    public static class Solution1 {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            int[] directions = new int[]{0, 1, 0, -1, 0};
            int m = image.length;
            int n = image[0].length;
            int originalValue = image[sr][sc];
            image[sr][sc] = newColor;

            boolean[][] visited = new boolean[m][n];

            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{sr, sc});
            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                visited[curr[0]][curr[1]] = true;
                for (int i = 0; i < directions.length - 1; i++) {
                    int nextR = curr[0] + directions[i];
                    int nextC = curr[1] + directions[i + 1];
                    if (nextR < 0 || nextC < 0 || nextR >= m || nextC >= n || image[nextR][nextC] != originalValue || visited[nextR][nextC]) {
                        continue;
                    }
                    image[nextR][nextC] = newColor;
                    queue.offer(new int[]{nextR, nextC});
                }
            }
            return image;
        }
    }
}
