package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _2492 {
    public static class Solution1 {
        public int minScore(int n, int[][] roads) {
            UnionFind uf = new UnionFind(n);
            //union all roads first
            for (int[] road : roads) {
                uf.union(road[0], road[1]);
            }
            //now call find() to completely union all connected cities
            for (int i = 1; i <= n; i++) {
                uf.find(i);
            }
            //now we'd like to find all cities that are connected to city 1
            Set<Integer> nodes = new HashSet<>();
            int startIndex = uf.find(1);
            for (int i = 2; i <= n; i++) {
                if (uf.find(i) == startIndex) {
                    nodes.add(i);
                }
            }
            int minScore = Integer.MAX_VALUE;
            for (int[] road : roads) {
                if (nodes.contains(road[0]) || nodes.contains(road[1])) {
                    minScore = Math.min(minScore, road[2]);
                }
            }
            return minScore;
        }

        static class UnionFind {
            int[] ids;

            public UnionFind(int n) {
                this.ids = new int[n + 1];
                for (int i = 1; i <= n; i++) {
                    this.ids[i] = i;
                }
            }

            public int find(int x) {
                if (x != ids[x]) {
                    ids[x] = find(ids[x]);
                }
                return ids[x];
            }

            public void union(int x, int y) {
                ids[find(x)] = find(y);
            }
        }
    }
}
