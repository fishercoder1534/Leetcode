package com.fishercoder.solutions.fourththousand;

import java.util.*;

public class _3607 {
    public static class Solution1 {
        public int[] processQueries(int c, int[][] connections, int[][] queries) {
            UnionFind unionFind = new UnionFind(connections, c);

            //initialize a treeset for root station to store online IDs
            //note: we should find each station's root station first and then store the current station id in there
            TreeSet<Integer>[] onlineIds = new TreeSet[c + 1];
            for (int i = 1; i <= c; i++) {
                int root = unionFind.find(i);
                if (onlineIds[root] == null) {
                    onlineIds[root] = new TreeSet<>();
                }
                onlineIds[root].add(i);
            }

            //track current online status via a boolean array
            boolean[] isOnline = new boolean[c + 1];
            Arrays.fill(isOnline, true);

            List<Integer> list = new ArrayList<>();
            for (int[] query : queries) {
                int ops = query[0];
                int station = query[1];
                int root = unionFind.find(station);

                if (ops == 1) {
                    if (isOnline[station]) {
                        list.add(station);
                    } else if (onlineIds[root] == null || onlineIds[root].isEmpty()) {
                        list.add(-1);
                    } else {
                        list.add(onlineIds[root].first());
                    }
                } else {
                    //take it offline
                    if (isOnline[station]) {
                        isOnline[station] = false;
                        if (onlineIds[root] != null) {
                            onlineIds[root].remove(station);
                        }
                    }
                }
            }
            return list.stream().mapToInt(x -> x).toArray();
        }

        private class UnionFind {

            private int[] ids;
            private int n;

            public UnionFind(int[][] connections, int n) {
                this.n = n;
                ids = new int[n + 1];
                for (int i = 0; i < n + 1; i++) {
                    ids[i] = i;
                }
                for (int[] connection : connections) {
                    int u = connection[0];
                    int v = connection[1];
                    union(u, v);
                }
                for (int i = 1; i <= n; i++) {
                    ids[i] = find(i);
                }
            }

            private void union(int u, int v) {
                int x = find(u);
                int y = find(v);
                if (x != y) {
                    ids[y] = x;
                }
            }

            private int find(int v) {
                if (v != ids[v]) {
                    ids[v] = find(ids[v]);
                }
                return ids[v];
            }
        }
    }
}
