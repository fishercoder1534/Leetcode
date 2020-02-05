package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**
 * 1315. Sum of Nodes with Even-Valued Grandparent
 *
 * Given a binary tree, return the sum of values of nodes with even-valued grandparent.
 * (A grandparent of a node is the parent of its parent, if it exists.)
 * If there are no nodes with an even-valued grandparent, return 0.
 *
 * Example 1:
 *                          6
 *                        /  \
 *                       7    8
 *                      / \  / \
 *                     2  7 1   3
 *                    /  / \     \
 *                   9   1 4     5
 *
 * Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
 * Output: 18
 * Explanation: The red nodes are the nodes with even-value grandparent while the blue nodes are the even-value grandparents.
 *
 * Constraints:
 * The number of nodes in the tree is between 1 and 10^4.
 * The value of nodes is between 1 and 100.
 * */
public class _1315 {
    public static class Solution1 {
        public int sumEvenGrandparent(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return dfs(root, root.left, 0) + dfs(root, root.right, 0);
        }

        private int dfs(TreeNode grandparent, TreeNode parent, int sum) {
            if (grandparent == null || parent == null) {
                return sum;
            }
            if (grandparent.val % 2 == 0 && parent.left != null) {
                sum += parent.left.val;
            }
            if (grandparent.val % 2 == 0 && parent.right != null) {
                sum += parent.right.val;
            }
            sum = dfs(parent, parent.left, sum);
            sum = dfs(parent, parent.right, sum);
            return sum;
        }
    }
}
