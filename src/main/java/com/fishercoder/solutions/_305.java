package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 305. Number of Islands II
 *
 * A 2d grid map of m rows and n columns is initially filled with water.
 * We may perform an addLand operation which turns the water at position (row, col) into a land.
 * Given a list of positions to operate, count the number of islands after each addLand operation.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.

 Example:

 Given m = 3, n = 3, positions = [[0,0], [0,1], [1,2], [2,1]].
 Initially, the 2d grid grid is filled with water. (Assume 0 represents water and 1 represents land).

 0 0 0
 0 0 0
 0 0 0
 Operation #1: addLand(0, 0) turns the water at grid[0][0] into a land.

 1 0 0
 0 0 0   Number of islands = 1
 0 0 0
 Operation #2: addLand(0, 1) turns the water at grid[0][1] into a land.

 1 1 0
 0 0 0   Number of islands = 1
 0 0 0
 Operation #3: addLand(1, 2) turns the water at grid[1][2] into a land.

 1 1 0
 0 0 1   Number of islands = 2
 0 0 0
 Operation #4: addLand(2, 1) turns the water at grid[2][1] into a land.

 1 1 0
 0 0 1   Number of islands = 3
 0 1 0
 We return the result as an array: [1, 1, 2, 3]

 Challenge:

 Can you do it in time complexity O(k log mn), where k is the length of the positions?
 */
public class _305 {
    public static class Solution1 {

        public int find(int[] father, int id) {
            int tf = father[id];
            while (tf != father[tf]) {
                tf = father[tf];
            }
            int cur = id;
            int tmp;
            while (father[cur] != tf) {
                tmp = father[cur];
                father[cur] = tf;
                cur = tmp;
            }
            return tf;
        }

        public void union(int[] father, int[] sz, int id1, int id2) {
            int tf1 = find(father, id1);
            int tf2 = find(father, id2);
            if (tf1 != tf2) {
                if (sz[tf1] > sz[tf2]) {
                    father[tf2] = tf1;
                    sz[tf1] += sz[tf2];
                } else {
                    father[tf1] = tf2;
                    sz[tf2] += sz[tf1];
                }
            }
        }

        public List<Integer> numIslands2(int m, int n, int[][] positions) {
            if (m == 0 || n == 0) {
                return new ArrayList<>();
            }
            ArrayList<Integer> res = new ArrayList();
            int[] father = new int[m * n];
            for (int i = 0; i < father.length; i++) {
                father[i] = -1;
            }
            int[] sz = new int[m * n];
            int[] dr = {0, 0, -1, 1};
            int[] dc = {-1, 1, 0, 0};
            int r;
            int c;
            int nr;
            int nc;
            int count = 0;
            for (int i = 0; i < positions.length; i++) {
                r = positions[i][0];
                c = positions[i][1];
                count++;
                father[r * n + c] = r * n + c;
                sz[r * n + c] = 1;
                for (int j = 0; j < 4; j++) {
                    nr = r + dr[j];
                    nc = c + dc[j];
                    if (nr >= 0 && nr < m && nc >= 0 && nc < n && father[nr * n + nc] != -1) {
                        if (find(father, r * n + c) != find(father, nr * n + nc)) {
                            count--;
                            union(father, sz, r * n + c, nr * n + nc);
                        }
                    }
                }
                res.add(count);
            }
            return res;
        }
    }
}
