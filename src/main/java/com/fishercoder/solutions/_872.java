package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 872. Leaf-Similar Trees
 *
 * Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a leaf value sequence.
 *
 *          3
 *         / \
 *        5   1
 *       / \ / \
 *      6  2 9 8
 *        / \
 *       7  4
 *
 * For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
 *
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 *
 * Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 *
 * Note:
 *
 * Both of the given trees will have between 1 and 100 nodes.
 */
public class _872 {
  public static class Solution1 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
      List<Integer> leaves1 = new ArrayList<>();
      List<Integer> leaves2 = new ArrayList<>();
      preorder(root1, leaves1);
      preorder(root2, leaves2);
      return leaves1.equals(leaves2);
    }

    private void preorder(TreeNode root,
        List<Integer> leaves) {
      if (root == null) {
        return;
      }
      if (root.left == null && root.right == null) {
        leaves.add(root.val);
      }
      preorder(root.left, leaves);
      preorder(root.right, leaves);
    }
  }
}
