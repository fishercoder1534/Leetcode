package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 513. Find Bottom Left Tree Value
 *
 * Given a binary tree, find the leftmost value in the last row of the tree.

 Example 1:
 Input:

   2
  / \
 1   3

 Output:
 1
 Example 2:
 Input:


      1
     / \
    2   3
   /   / \
  4   5   6
     /
    7

 Output:
 7
 Note: You may assume the tree (i.e., the given root node) is not NULL.
 */
public class _513 {

    public static class Solution1 {
        public int findBottomLeftValue(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            TreeNode leftMost = root;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    if (i == 0) {
                        leftMost = curr;
                    }
                    if (curr.left != null) {
                        queue.offer(curr.left);
                    }
                    if (curr.right != null) {
                        queue.offer(curr.right);
                    }
                }
            }
            return leftMost.val;
        }
    }
}
