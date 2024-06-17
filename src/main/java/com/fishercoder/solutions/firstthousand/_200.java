package com.fishercoder.solutions.firstthousand;

public class _200 {

    public static class Solution1 {

        /**
         * DFS solution, note: this modifies the input.
         */
        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0) {
                return 0;
            }
            int count = 0;
            int m = grid.length;
            int n = grid[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1') {
                        count++;
                        dfs(grid, i, j, m, n);
                    }
                }
            }
            return count;
        }

        void dfs(char[][] grid, int i, int j, int m, int n) {
            if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
                return;
            }
            grid[i][j] = '0';
            dfs(grid, i + 1, j, m, n);
            dfs(grid, i, j + 1, m, n);
            dfs(grid, i - 1, j, m, n);
            dfs(grid, i, j - 1, m, n);
        }
    }

    public static class Solution2 {

        class UnionFind {
            int count;
            int m;
            int n;
            int[] ids;

            public UnionFind(char[][] grid) {
                m = grid.length;
                n = grid[0].length;
                ids = new int[m * n];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        if (grid[i][j] == '1') {
                            //at initialization, we count each '1' as one island, later, during traversal, we'll union them during which we'll dedup the number of islands.
                            count++;
                        }
                        ids[i * n + j] = i * n + j;
                    }
                }
            }

            public void union(int i, int j) {
                int x = find(i);
                int y = find(j);
                if (x != y) {
                    /**
                     * This means when these two nodes should be unioned, however, so far,
                     * they have not, i.e. they have different ids,
                     * so we'll have to unify them by assigning one's ids to the other, or vice versa.
                     * */
                    ids[x] = y;//ids[y] = x; //also works
                    count--;//since now these two islands are unified/merged, we'll decrement the count by one
                }
            }

            public int find(int i) {
                if (i != ids[i]) {
                    ids[i] = find((ids[i]));
                }
                return ids[i];
            }
        }

        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0 || grid[0].length == 0) {
                return 0;
            }
            int[] dirs = new int[]{0, 1, 0, -1, 0};
            UnionFind uf = new UnionFind(grid);
            int m = grid.length;
            int n = grid[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1') {
                        for (int k = 0; k < 4; k++) {
                            int x = i + dirs[k];
                            int y = j + dirs[k + 1];
                            if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == '1') {
                                int id1 = i * n + j;
                                int id2 = x * n + y;
                                uf.union(id1, id2);
                            }
                        }
                    }
                }
            }
            return uf.count;
        }
    }
}
