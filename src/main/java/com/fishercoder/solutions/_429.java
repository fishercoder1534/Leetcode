package com.fishercoder.solutions;

import com.fishercoder.common.classes.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 429. N-ary Tree Level Order Traversal
 *
 * Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example, given a 3-ary tree:
 *
 *                              1
 *                            / | \
 *                           3  2 4
 *                          / \
 *                         5  6
 *
 *  We should return its level order traversal:
 *
 * [
 *      [1],
 *      [3,2,4],
 *      [5,6]
 * ]
 *
 *
 * Note:
 *
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000.
 */
public class _429 {
  public static class Solution1 {
    public List<List<Integer>> levelOrder(Node root) {
      List<List<Integer>> result = new ArrayList<>();
      if (root == null) {
        return result;
      }
      Queue<Node> queue = new LinkedList<>();
      queue.offer(root);
      while (!queue.isEmpty()) {
        int size = queue.size();
        List<Integer> level = new ArrayList<>();
        for (int i = 0; i < size; i++) {
          Node currentNode = queue.poll();
          if (currentNode != null) {
            level.add(currentNode.val);
            for (Node child : currentNode.children) {
              queue.offer(child);
            }
          }
        }
        result.add(level);
      }
      return result;
    }
  }
}
