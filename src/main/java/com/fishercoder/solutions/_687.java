package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**
 * 687. Longest Univalue Path
 *
 * Given a binary tree, find the length of the longest path where each node in the path has the same value.
 * This path may or may not pass through the root.

 Note: The length of path between two nodes is represented by the number of edges between them.

 Example 1:
 Input:
     5
    / \
   4   5
  / \   \
 1  1   5

 Output:
 2

 Example 2:
 Input:

     1
    / \
   4   5
  / \   \
 4  4   5
 Output:
 2

 Note: The given binary tree has not more than 10000 nodes. The height of the tree is not more than 1000.
 */

public class _687 {
    public static class Solution1 {
        /**
         * Use a one element array to pass in and out is a common technique for handling tree questions.
         */
        public int longestUnivaluePath(TreeNode root) {
            int[] result = new int[1];
            if (root != null) {
                dfs(root, result);
            }
            return result[0];
        }
        
        // calculate longest univalue path from root to leaves
        // In addition, the maximum univalue path cross the root node is calculated and then global maximum is udpated.
        private int dfs(TreeNode root, int[] result) {
            int leftPath = root.left == null ? 0 : dfs(root.left, result);
            int rightPath = root.right == null ? 0 : dfs(root.right, result);
            int leftResult = (root.left != null && root.left.val == root.val) ? leftPath + 1 : 0;
            int rightResult = (root.right != null && root.right.val == root.val) ? rightPath + 1 : 0;
            result[0] = Math.max(result[0], leftResult + rightResult);
            return Math.max(leftResult, rightResult);
        }
    }
}
