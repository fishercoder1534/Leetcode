package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**
 * 100. Same Tree
 *
 * Given two binary trees, write a function to check if they are equal or not. Two binary trees are
 * considered equal if they are structurally identical and the nodes have the same value.
 *
 * Example 1:
 *
 * Input:     1         1
 *           / \       / \
 *          2   3     2   3
 *
 *         [1,2,3],   [1,2,3]
 *
 * Output: true
 *
 * Example 2:
 *
 * Input:     1         1
 *           /           \
 *          2             2
 *
 *         [1,2],     [1,null,2]
 *
 * Output: false
 *
 * Example 3:
 *
 * Input:     1         1
 *           / \       / \
 *          2   1     1   2
 *
 *         [1,2,1],   [1,1,2]
 *
 * Output: false
 */

public class _100 {
  public static class Solution1 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
      if (p == null || q == null) {
        return p == q;
      }
      return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
  }
}
