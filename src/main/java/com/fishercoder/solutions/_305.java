package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

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
