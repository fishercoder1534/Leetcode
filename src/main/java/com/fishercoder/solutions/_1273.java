package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 1273. Delete Tree Nodes
 *
 * A tree rooted at node 0 is given as follows:
 * The number of nodes is nodes;
 * The value of the i-th node is value[i];
 * The parent of the i-th node is parent[i].
 * Remove every subtree whose sum of values of nodes is zero.
 * After doing so, return the number of nodes remaining in the tree.
 *
 * Example 1:
 *                      0 (1)
 *                     /  \
 *               (-2) 1    2 (4)
 *                   /    / |   \
 *              (0)3 (-2)4 (-1)5 6(-1)
 *
 * Input: nodes = 7, parent = [-1,0,0,1,2,2,2], value = [1,-2,4,0,-2,-1,-1]
 * Output: 2
 *
 * Constraints:
 * 1 <= nodes <= 10^4
 * -10^5 <= value[i] <= 10^5
 * parent.length == nodes
 * parent[0] == -1 which indicates that 0 is the root.
 * */
public class _1273 {
    public static class Solution1 {
        public int deleteTreeNodes(int nodes, int[] parent, int[] value) {
            int len = parent.length;
            for (int i = len - 1; i > 0; ) {
                int sum = 0;
                int parentIndex = parent[i];
                while (i > 0 && parent[i] == parentIndex) {
                    sum += value[i--];
                }
                //we'll reset the value to be the newly computed sum of this node and all of its children
                value[parentIndex] = value[parentIndex] + sum;
            }
            //then we'll reset this node's children to be zero if this node's computed sum is zero
            for (int i = 0; i < value.length; i++) {
                if (value[i] == 0) {
                    for (int j = 0; j < parent.length; j++) {
                        if (parent[j] == i) {
                            value[j] = 0;
                        }
                    }
                }
            }
            return (int) Arrays.stream(value).filter(i -> i != 0).count();
        }
    }
}
