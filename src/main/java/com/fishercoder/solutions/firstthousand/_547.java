package com.fishercoder.solutions.firstthousand;

public class _547 {

    public static class Solution1 {
        public int findCircleNum(int[][] isConnected) {
            if (isConnected == null || isConnected.length == 0 || isConnected[0].length == 0) {
                return 0;
            }
            int m = isConnected.length; // number of rows in this matrix
            UnionFind unionFind = new UnionFind(m);
            for (int i = 0; i < m; i++) {
                for (int j = i + 1; j < m; j++) {
                    if (isConnected[i][j] == 1) {
                        unionFind.union(i, j);
                    }
                }
            }
            return unionFind.count;
        }

        static class UnionFind {
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
                // at this point, x and y should equal, if not, then we should union them into the
                // same value
                if (x != y) {
                    count--;
                    root[x] = y; // path compression, i.e. union
                }
            }

            public int find(int[] ids, int i) {
                if (ids[i] == i) {
                    // this is the base case, so nothing to recurse on
                    return i;
                }
                return find(ids, ids[i]);
            }
        }
    }
}
