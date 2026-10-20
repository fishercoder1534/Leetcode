package com.fishercoder.solutions.thirdthousand;

public class _2782 {
    public static class Solution1 {
        /**
         * My completely original solution: beats 100% on LeetCode submissions.
         * A perfect problem to apply UnionFind template.
         */
        public int numberOfCategories(int n, CategoryHandler categoryHandler) {
            UnionFind uf = new UnionFind(n);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        boolean isTheSame = categoryHandler.haveSameCategory(i, j);
                        if (isTheSame) {
                            uf.union(i, j);
                        }
                    }
                }
            }
            return uf.n;
        }

        private class UnionFind {
            int[] ids;
            int n;

            public UnionFind(int n) {
                this.n = n;
                this.ids = new int[n];
                for (int i = 0; i < n; i++) {
                    this.ids[i] = i;
                }
            }

            public void union(int i, int j) {
                int x = find(i);
                int y = find(j);
                if (x != y) {
                    ids[x] = y;
                    n--;
                }
            }

            private int find(int i) {
                if (i != ids[i]) {
                    ids[i] = find(ids[i]);
                }
                return ids[i];
            }
        }
    }

    //Definition for a category handler .
    //a dummy class to make the compiler happy
    class CategoryHandler {
        public CategoryHandler(int[] categories) {

        }

        public boolean haveSameCategory(int a, int b) {
            return false;
        }
    }
}
