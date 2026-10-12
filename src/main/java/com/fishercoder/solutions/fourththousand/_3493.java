package com.fishercoder.solutions.fourththousand;

import java.util.HashSet;
import java.util.Set;

public class _3493 {
    public static class Solution1 {
        /**
         * The hard/tricky part of this problem is to understand what the problem is asking, once you do, the solution flows out naturally: use UnionFind!
         * <p>
         * This is a variation of UnionFind, adding one more dimension to the classic UnionFind.
         *
         */
        public int numberOfComponents(int[][] properties, int k) {
            UnionFind uf = new UnionFind(properties.length);
            for (int i = 0; i < properties.length; i++) {
                for (int j = 0; j < properties.length; j++) {
                    if (i != j) {
                        if (uf.canUnion(i, j, properties, k)) {
                            uf.union(i, j);
                        }
                    }
                }
            }
            return uf.getCount();
        }

        private class UnionFind {
            private int[] ids;

            public UnionFind(int length) {
                ids = new int[length];
                for (int i = 0; i < length; i++) {
                    ids[i] = i;
                }
            }

            public boolean canUnion(int i, int j, int[][] properties, int k) {
                int[] propertyI = properties[i];
                int[] propertyJ = properties[j];
                Set<Integer> set = new HashSet<>();
                for (int num : propertyI) {
                    set.add(num);
                }
                Set<Integer> intersect = new HashSet<>();
                for (int num : propertyJ) {
                    if (set.contains(num)) {
                        intersect.add(num);
                    }
                }
                return intersect.size() >= k;
            }

            public void union(int i, int j) {
                int x = find(i);
                int y = find(j);
                if (x != y) {
                    ids[y] = x;
                }
            }

            private int find(int i) {
                if (ids[i] != i) {
                    ids[i] = find(ids[i]);
                }
                return ids[i];
            }

            public int getCount() {
                Set<Integer> set = new HashSet<>();
                for (int num : ids) {
                    set.add(find(num));//here's the key: you'll have to call find() here instead of just using num, to find the true root index of this num
                }
                return set.size();
            }
        }
    }
}
