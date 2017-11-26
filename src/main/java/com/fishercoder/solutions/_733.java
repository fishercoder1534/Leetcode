package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 733. Flood Fill
 *
 * An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).
 * Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.
 * To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting
 * pixel of the same color as the starting pixel,
 * plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on.
 * Replace the color of all of the aforementioned pixels with the newColor.
 * At the end, return the modified image.

 Example 1:
 Input:
 image = [[1,1,1],[1,1,0],[1,0,1]]
 sr = 1, sc = 1, newColor = 2
 Output: [[2,2,2],[2,2,0],[2,0,1]]

 Explanation:
 From the center of the image (with position (sr, sc) = (1, 1)), all pixels connected
 by a path of the same color as the starting pixel are colored with the new color.
 Note the bottom corner is not colored 2, because it is not 4-directionally connected
 to the starting pixel.

 Note:
 The length of image and image[0] will be in the range [1, 50].
 The given starting pixel will satisfy 0 <= sr < image.length and 0 <= sc < image[0].length.
 The value of each color in image[i][j] and newColor will be an integer in [0, 65535].
 */
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
