package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 144. Binary Tree Preorder Traversal

 Given a binary tree, return the preorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 1
  \
   2
  /
 3
 return [1,2,3].

 Note: Recursive solution is trivial, could you do it iteratively?*/

public class _144 {
  public static class Solution1 {
    public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> list = new ArrayList();
      if (root == null) {
        return list;
      }
      Deque<TreeNode> stack = new ArrayDeque<>();
      stack.push(root);
      while (!stack.isEmpty()) {
        TreeNode curr = stack.pop();
        list.add(curr.val);
        /**We push right nodes onto the stack first, since they'll be popped out later than
         * the left nodes, to meet the preorder: root -> left -> right. */
        if (curr.right != null) {
          stack.push(curr.right);
        }
        if (curr.left != null) {
          stack.push(curr.left);
        }
      }
      return list;
    }
  }

  public static class Solution2 {
    public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> list = new ArrayList();
      return pre(root, list);
    }

    List<Integer> pre(TreeNode root, List<Integer> list) {
      if (root == null) {
        return list;
      }
      list.add(root.val);
      pre(root.left, list);
      pre(root.right, list);
      return list;
    }
  }
}
