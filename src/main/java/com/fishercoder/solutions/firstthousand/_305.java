package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.List;

public class _305 {
    public static class Solution1 {
        /**
         * This is an amazing question and I love it!
         * Practice makes perfect!
         * UnionFind is the way to go!
         * <p>
         * It's actually very natural to write UnionFind class out:
         * 1. build the constructor;
         * 2. write union() method first;
         * 3. while you write union() method, it naturally calls out for find() method;
         * 4. for find() method, you just write the simple recursive call to find the index that matches with the value to be the representative of that group!
         *
         */
        public List<Integer> numIslands2(int m, int n, int[][] positions) {
            List<Integer> ans = new ArrayList<>();
            UnionFind uf = new UnionFind(m, n);
            for (int[] position : positions) {
                uf.fillLand(position[0], position[1]);
                ans.add(uf.count);
            }
            return ans;
        }

        class UnionFind {
            private int[] ids;
            private int m;
            private int n;
            private int count;
            private int[][] board;
            private int[] directions = new int[]{0, 1, 0, -1, 0};

            public UnionFind(int m, int n) {
                this.m = m;
                this.n = n;
                this.ids = new int[m * n];
                this.board = new int[m][n];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        this.ids[i * n + j] = i * n + j;
                    }
                }
                this.count = 0;
            }

            public void fillLand(int i, int j) {
                if (this.board[i][j] == 1) {
                    //this line is important as the same island might show up again in the input which we should not process again
                    return;
                }
                this.board[i][j] = 1;
                this.count++;
                //scan in four directions to see if this node could be merged into existing ones
                for (int k = 0; k < 4; k++) {
                    int x = i + directions[k];
                    int y = j + directions[k + 1];
                    if (x >= 0 && x < m && y >= 0 && y < n && board[x][y] == 1) {
                        union(i * n + j, x * n + y);
                    }
                }
            }

            private void union(int i, int j) {
                int id1 = find(i);
                int id2 = find(j);
                if (id1 != id2) {
                    this.ids[id1] = id2;
                    //we decrement the island count only when id1 != id2, i.e. we found two new disconnected islands that we can merge
                    this.count--;
                }
            }

            private int find(int x) {
                if (this.ids[x] != x) {
                    this.ids[x] = find(this.ids[x]);
                }
                return this.ids[x];
            }
        }
    }
}
