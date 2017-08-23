package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.

 Note:
 Given target value is a floating point.
 You are guaranteed to have only one unique value in the BST that is closest to the target.*/
public class _270 {

    class GeneralTreeSolution {
        //this finished in 1 ms
        public int closestValue(TreeNode root, double target) {
            if (root == null)
                return 0;
            double delta = Double.MAX_VALUE;
            return dfs(root, target, delta, root.val);
        }

        private int dfs(TreeNode root, double target, double delta, int closestVal) {
            if (Math.abs(root.val - target) < delta) {
                closestVal = root.val;
                delta = Math.abs(root.val - target);
            }
            int leftVal = closestVal;
            if (root.left != null)
                leftVal = dfs(root.left, target, delta, closestVal);
            int rightVal = closestVal;
            if (root.right != null)
                rightVal = dfs(root.right, target, delta, closestVal);
            return (Math.abs(leftVal - target) > Math.abs(rightVal - target)) ? rightVal : leftVal;
        }
    }

    class BSTSolutionRecursive {
        //we can tailor the solution to use the BST feature: left subtrees are always smaller than the root the right subtrees
        //this finished in 0 ms
        public int closestValue(TreeNode root, double target) {
            if (root == null) return 0;
            return dfs(root, target, root.val);
        }

        private int dfs(TreeNode root, double target, int minVal) {
            if (root == null) return minVal;
            if (Math.abs(root.val - target) < Math.abs(minVal - target)) {
                minVal = root.val;
            }
            if (target < root.val) {
                minVal = dfs(root.left, target, minVal);
            } else {
                minVal = dfs(root.right, target, minVal);
            }
            return minVal;
        }
    }

    class GeneralTreeSolutionMoreConcise {
        public int closestValue(TreeNode root, double target) {
            if (root == null) return 0;
            return dfs(root, target, root.val);
        }

        private int dfs(TreeNode root, double target, int minVal) {
            if (root == null)
                return minVal;
            if (Math.abs(root.val - target) < Math.abs(minVal - target)) {
                minVal = root.val;
            }
            minVal = dfs(root.left, target, minVal);
            minVal = dfs(root.right, target, minVal);
            return minVal;
        }
    }

    class BSTSolutionIterative {
        public int closestValue(TreeNode root, double target) {
            long minVal = Long.MAX_VALUE;
            while (root != null) {
                if (Math.abs(root.val - target) < Math.abs(minVal - target)) {
                    minVal = root.val;
                }
                if (target < root.val) root = root.left;
                else root = root.right;
            }
            return minVal == Long.MAX_VALUE ? 0 : (int) minVal;
        }
    }
}
