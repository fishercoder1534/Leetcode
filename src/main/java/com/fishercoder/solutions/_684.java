package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 684. Redundant Connection
 *
 *  We are given a "tree" in the form of a 2D-array, with distinct values for each node.
 *  In the given 2D-array, each element pair [u, v] represents that v is a child of u in the tree.
 *  We can remove exactly one redundant pair in this "tree" to make the result a (rooted) tree.
 *  You need to find and output such a pair. If there are multiple answers for this question, output the one appearing last in the 2D-array. There is always at least one answer.

 Example 1:
 Input: [[1,2], [1,3], [2,3]]
 Output: [2,3]
 Explanation: Original tree will be like this:
   1
  / \
 2 - 3


 Example 2:
 Input: [[1,2], [1,3], [3,1]]
 Output: [3,1]
 Explanation: Original tree will be like this:
   1
  / \\
 2   3

 Note:
 The size of the input 2D-array will be between 1 and 1000.
 Every integer represented in the 2D-array will be between 1 and 2000.
 */
public class _684 {

    public static class Solution1 {
        /**
         * This is my original solution. A little verbose.
         */
        class UnionFind {
            int[] ids;
            Set<Integer> nodes;
            Set<Integer> visitedNodes;
            int[] redundantConn;
            int m;
            int n;

            public UnionFind(int[][] edges) {
                m = edges.length;
                n = edges[0].length;
                nodes = new HashSet<>();
                visitedNodes = new HashSet<>();
                redundantConn = new int[]{};
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        nodes.add(edges[i][j]);
                    }
                }
                ids = new int[nodes.size()];
                for (int i = 0; i < ids.length; i++) {
                    ids[i] = i + 1;
                }
            }

            public int[] union(int[] edge) {
                int x = find(edge[0] - 1);
                int y = find(edge[1] - 1);

                if (x == y && visitedNodes.contains(edge[0]) && visitedNodes.contains(edge[1])) {
                    redundantConn = edge;
                }

                if (x != y) {
                    if (x < y) {
                        ids[y] = x + 1;
                    } else {
                        ids[x] = y + 1;
                    }
                }

                visitedNodes.add(edge[0]);
                visitedNodes.add(edge[1]);
                return redundantConn;
            }

            private int find(int id) {
                if (isTree()) {
                    return ids[id];
                }
                if ((id + 1) != ids[id]) {
                    return find(ids[id] - 1);
                }
                return id;
            }

            private boolean isTree() {
                Set<Integer> set = new HashSet<>();
                for (int i : ids) {
                    set.add(i);
                }
                return set.size() == 1;
            }
        }

        public int[] findRedundantConnection(int[][] edges) {
            UnionFind unionFind = new UnionFind(edges);
            int[] result = new int[]{};
            for (int[] edge : edges) {
                result = unionFind.union(edge);
            }
            return result;
        }
    }
}
