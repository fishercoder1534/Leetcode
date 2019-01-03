package com.fishercoder.solutions;

import com.fishercoder.common.classes.Node;
import java.util.ArrayList;
import java.util.List;

/**
 * 559. Maximum Depth of N-ary Tree
 *
 * Given a n-ary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * For example, given a 3-ary tree:
 *                            1
 *                          / | \
 *                         3  2  4
 *                        / \
 *                       5  6
 *
 * We should return its max depth, which is 3.
 *
 * Note:
 *
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000.
 */
public class _559 {
  public static class Solution1 {
    public int maxDepth(Node root) {
      int maxDepth = 0;
      if (root == null) {
        return maxDepth;
      }
      List<List<Integer>> allPaths = new ArrayList<>();
      List<Integer> currentPath = new ArrayList<>();
      dfs(root, currentPath, allPaths);
      for (List<Integer> path : allPaths) {
        maxDepth = Math.max(path.size(), maxDepth);
      }
      return maxDepth;
    }

    private void dfs(Node root, List<Integer> currentPath, List<List<Integer>> allPaths) {
      if (root == null) {
        allPaths.add(new ArrayList<>(currentPath));
      }
      if (root.children != null && !root.children.isEmpty()) {
        currentPath.add(root.val);
        for (Node child : root.children) {
          dfs(child, new ArrayList<>(currentPath), allPaths);
        }
      }
      if (root.children == null || root.children.isEmpty()) {
        currentPath.add(root.val);
        allPaths.add(new ArrayList<>(currentPath));
      }
    }
  }
}
