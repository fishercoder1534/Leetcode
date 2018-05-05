package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 145. Binary Tree Postorder Traversal

 Given a binary tree, return the postorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 1
  \
   2
  /
 3
 return [3,2,1].

 Note: Recursive solution is trivial, could you do it iteratively?*/

public class _145 {
  public static class Solution1 {
    /**
     * A tricky one: Modify the code for pre-order traversal
     * so that it becomes root->right->left,
     * and then reverse the result to get left->right->root.
     */
    public static List<Integer> postorderTraversal(TreeNode root) {
      List<Integer> result = new ArrayList();
      if (root == null) {
        return result;
      }
      Stack<TreeNode> stack = new Stack();
      stack.push(root);
      while (!stack.isEmpty()) {
        root = stack.pop();
        result.add(root.val);
        if (root.left != null) {
          stack.push(root.left);
        }
        if (root.right != null) {
          stack.push(root.right);
        }
      }
      Collections.reverse(result);
      return result;
    }
  }

  public static class Solution2 {
    public List<Integer> postorderTraversal(TreeNode root) {
      List<Integer> result = new ArrayList();
      return post(root, result);
    }

    List<Integer> post(TreeNode root, List<Integer> result) {
      if (root == null) {
        return result;
      }
      post(root.left, result);
      post(root.right, result);
      result.add(root.val);
      return result;
    }
  }
}
