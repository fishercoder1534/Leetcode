package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94. Binary Tree Inorder Traversal
 *
 * Given a binary tree, return the inorder traversal of its nodes' values.

 For example:
 Given binary tree [1,null,2,3],
 1
  \
   2
  /
 3
 return [1,3,2].

 Note: Recursive solution is trivial, could you do it iteratively?*/

public class _94 {

    public static class Solution1 {
        public List<Integer> inorderTraversal(TreeNode root) {
            return inorder(root, new ArrayList());
        }

        List<Integer> inorder(TreeNode root, List<Integer> result) {
            if (root == null) {
                return result;
            }
            inorder(root.left, result);
            result.add(root.val);
            return inorder(root.right, result);
        }
    }

    public static class Solution2 {
        //iterative approach
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList();
            Stack<TreeNode> stack = new Stack();
            while (root != null || !stack.isEmpty()) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();
                result.add(root.val);
                root = root.right;
            }
            return result;
        }
    }
}
