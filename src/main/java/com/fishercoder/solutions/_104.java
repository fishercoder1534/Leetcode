package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;

/**
 * 104. Maximum Depth of Binary Tree
 *
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15  7
 *
 * return its depth = 3.
 */
public class _104 {

  public static class Solution1 {
    /**
     * Recursive solution:
     * Time: O(n)
     * Space: O(n)
     */
    public int maxDepth(TreeNode root) {
      if (root == null) {
        return 0;
      }
      return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
  }

  public static class Solution2 {
    /**
     * Iterative solution:
     * Time: O(n)
     * Space: O(n)
     */
    public int maxDepth(TreeNode root) {
      if (root == null) {
        return 0;
      }
      LinkedList<TreeNode> stack = new LinkedList<>();
      LinkedList<Integer> depths = new LinkedList<>();
      stack.add(root);
      depths.add(1);

      int depth = 0;
      while (!stack.isEmpty()) {
        TreeNode currentNode = stack.pollLast();
        int currentDepth = depths.pollLast();
        if (currentNode != null) {
          depth = Math.max(depth, currentDepth);
          stack.add(currentNode.right);
          depths.add(currentDepth + 1);
          stack.add(currentNode.left);
          depths.add(currentDepth + 1);
        }
      }
      return depth;
    }
  }

}
