package com.fishercoder.solutions;

import com.fishercoder.common.classes.Node;
import java.util.ArrayList;
import java.util.List;

/**
 * 590. N-ary Tree Postorder Traversal
 *
 * Given an n-ary tree, return the postorder traversal of its nodes' values.
 *
 * For example, given a 3-ary tree:
 *
 *              1
 *            / | \
 *           3  2  4
 *          / \
 *         5   6
 *
 * Return its postorder traversal as: [5,6,3,2,4,1].
 *
 * Note:
 *
 * Recursive solution is trivial, could you do it iteratively?
 */
public class _590 {
  public static class Solution1 {
    public List<Integer> postorder(Node root) {
      List<Integer> result = new ArrayList<>();
      if (root == null) {
        return result;
      }
      dfs(root, result);
      result.add(root.val);
      return result;
    }

    private void dfs(Node root, List<Integer> result) {
      if (root == null) {
        return;
      }
      if (root.children.size() > 0) {
        for (Node child : root.children) {
          dfs(child, result);
          result.add(child.val);
        }
      }
    }
  }
}
