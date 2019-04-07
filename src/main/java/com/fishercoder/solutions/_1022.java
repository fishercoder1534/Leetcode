package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 *
 * 1022. Sum of Root To Leaf Binary Numbers
 *
 * Given a binary tree, each node has value 0 or 1.  Each root-to-leaf path represents a binary number starting with the most significant bit.  For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
 *
 * For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
 *
 * Return the sum of these numbers.
 *
 * Example 1:
 *
 *        1
 *       / \
 *      0   1
 *     / \ / \
 *    0  1 0 1
 *
 * Input: [1,0,1,0,1,0,1]
 * Output: 22
 * Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
 *
 * Note:
 *
 * The number of nodes in the tree is between 1 and 1000.
 * node.val is 0 or 1.
 * The answer will not exceed 2^31 - 1.
 * */
public class _1022 {
    public static class Solution1 {
        public int sumRootToLeaf(TreeNode root) {
            List<List<Integer>> paths = new ArrayList<>();
            dfs(root, paths, new ArrayList<>());
            int sum = 0;
            for (List<Integer> list : paths) {
                int num = 0;
                for (int i : list) {
                    num = (num << 1) + i;
                }
                sum += num;
            }
            return sum;
        }

        private void dfs(TreeNode root, List<List<Integer>> paths, List<Integer> path) {
            path.add(root.val);
            if (root.left != null) {
                dfs(root.left, paths, path);
                path.remove(path.size() - 1);
            }
            if (root.right != null) {
                dfs(root.right, paths, path);
                path.remove(path.size() - 1);
            }
            if (root.left == null && root.right == null) {
                paths.add(new ArrayList<>(path));
            }
        }
    }
}
