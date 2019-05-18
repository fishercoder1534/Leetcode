package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102. Binary Tree Level Order Traversal

Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

return its level order traversal as:

[
  [3],
  [9,20],
  [15,7]
]
*/
public class _102 {

  public static class Solution1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> result = new ArrayList<>();
      if (root == null) {
        return result;
      }
      Queue<TreeNode> queue = new LinkedList();
      queue.offer(root);
      while (!queue.isEmpty()) {
        List<Integer> thisLevel = new ArrayList();
        int size = queue.size();
        for (int i = 0; i < size; i++) {
          TreeNode curr = queue.poll();
          thisLevel.add(curr.val);
          if (curr.left != null) {
            queue.offer(curr.left);
          }
          if (curr.right != null) {
            queue.offer(curr.right);
          }
        }
        result.add(thisLevel);
      }
      return result;
    }
  }
}
