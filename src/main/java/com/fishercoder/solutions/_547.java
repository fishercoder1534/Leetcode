package com.fishercoder.solutions;

public class _547 {

    public static class Solution1 {
        public int findCircleNum(int[][] M) {
            if (M == null || M.length == 0 || M[0].length == 0) {
                return 0;
            }
            int m = M.length;//number of rows in this matrix
            UnionFind unionFind = new UnionFind(m);
            for (int i = 0; i < m; i++) {
                for (int j = i + 1; j < m; j++) {
                    if (M[i][j] == 1) {
                        unionFind.union(i, j);
                    }
                }
            }
            return unionFind.count;
        }

        class UnionFind {
            int count;
            int[] root;

            public UnionFind(int m) {
                root = new int[m];
                for (int i = 0; i < m; i++) {
                    root[i] = i;
                }
                count = m;
            }

            public void union(int i, int j) {
                int x = find(root, i);
                int y = find(root, j);
                if (x != y) {
                    count--;
                    root[x] = y;//path compression
                }
            }

            public int find(int[] ids, int i) {
                if (ids[i] == i) {
                    return i;
                }
                return find(ids, ids[i]);
            }
        }
    }

}
