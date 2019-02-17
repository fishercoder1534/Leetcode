package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 993. Cousins in Binary Tree
 *
 * In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
 * Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
 * We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
 * Return true if and only if the nodes corresponding to the values x and y are cousins.
 *
 * Example 1:
 *        1
 *       / \
 *      2   3
 *     /
 *    4
 *
 * Input: root = [1,2,3,4], x = 4, y = 3
 * Output: false
 *
 * Example 2:
 *         1
 *        / \
 *       2   3
 *       \    \
 *       4    5
 *
 * Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
 * Output: true
 *
 * Example 3:
 *          1
 *         / \
 *        2  3
 *        \
 *        4
 *
 * Input: root = [1,2,3,null,4], x = 2, y = 3
 * Output: false
 *
 *
 * Note:
 *
 * The number of nodes in the tree will be between 2 and 100.
 * Each node has a unique integer value from 1 to 100.
 */
public class _993 {
  public static class Solution1 {
    public boolean isCousins(TreeNode root, int x, int y) {
      Queue<TreeNode> queue = new LinkedList<>();
      queue.offer(root);
      while (!queue.isEmpty()) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
          TreeNode current = queue.poll();
          if (current.left != null) {
            queue.offer(current.left);
          }
          if (current.right != null) {
            queue.offer(current.right);
          }
          if (current.left != null && current.right != null) {
            if (current.left.val == x && current.right.val == y
                || current.left.val == y && current.right.val == x) {
              return false;
            }
          }
        }
        if (checkQueue(queue, x, y)) {
          return true;
        }
      }
      return false;
    }

    private boolean checkQueue(Queue<TreeNode> queue, int x, int y) {
      Set<Integer> set = new HashSet<>();
      Queue<TreeNode> tmp = new LinkedList<>(queue);
      while (!tmp.isEmpty()) {
        set.add(tmp.poll().val);
      }
      return set.contains(x) && set.contains(y);
    }
  }
}
