package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;
/**
 * 404. Sum of Left Leaves
 *
 * Find the sum of all left leaves in a given binary tree.

 Example:

   3
  / \
 9  20
   /  \
  15   7

 There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.*/
public class _404 {
    public static class Solution1 {
        public int sumOfLeftLeaves(TreeNode root) {
            int result = 0;
            if (root == null) {
                return result;
            }
            return dfs(root, result, false);
        }

        private int dfs(TreeNode root, int result, boolean left) {
            if (root.left == null && root.right == null && left) {
                result += root.val;
                return result;
            }
            int leftResult = 0;
            if (root.left != null) {
                left = true;
                leftResult = dfs(root.left, result, left);
            }
            int rightResult = 0;
            if (root.right != null) {
                left = false;
                rightResult = dfs(root.right, result, left);
            }
            return leftResult + rightResult;
        }
    }

    public static class Solution2 {

        public int sumOfLeftLeaves(TreeNode root) {
            int sum = 0;
            if (root == null) {
                return sum;
            }
            if (root.left != null) {
                if (root.left.left == null && root.left.right == null) {
                    sum += root.left.val;
                } else {
                    sum += sumOfLeftLeaves(root.left);
                }
            }
            if (root.right != null) {
                sum += sumOfLeftLeaves(root.right);
            }
            return sum;
        }
    }
}
