package com.fishercoder.solutions;

import com.fishercoder.common.classes.Node;
import java.util.ArrayList;
import java.util.List;

/**
 * 589. N-ary Tree Preorder Traversal
 *
 * Given an n-ary tree, return the preorder traversal of its nodes' values.
 *
 * For example, given a 3-ary tree:
 *
 *            1
 *          / | \
 *         3  2  4
 *        / \
 *       5   6
 *
 * Return its preorder traversal as: [1,3,5,6,2,4].
 *
 * Note:
 *
 * Recursive solution is trivial, could you do it iteratively?
 */
public class _589 {
  public static class Solution1 {
    public List<Integer> preorder(Node root) {
      List<Integer> result = new ArrayList<>();
      if (root == null) {
        return result;
      }
      dfs(root, result);
      return result;
    }

    private void dfs(Node root, List<Integer> result) {
      if (root == null) {
        return;
      }
      result.add(root.val);
      if (root.children.size() > 0) {
        for (Node child : root.children) {
          dfs(child, result);
        }
      }
    }
  }
}
