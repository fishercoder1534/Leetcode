package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _226 {

    public static class Solution1 {
        /**
         * An iterative solution
         */
        public TreeNode invertTree(TreeNode root) {
            if (root == null || (root.left == null && root.right == null)) {
                return root;
            }
            Queue<TreeNode> q = new LinkedList();
            q.offer(root);
            while (!q.isEmpty()) {
                TreeNode curr = q.poll();
                TreeNode temp = curr.left;
                curr.left = curr.right;
                curr.right = temp;
                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }
            return root;
        }
    }

    public static class Solution2 {
        /**
         * A recursive solution
         */
        public TreeNode invertTree(TreeNode root) {
            if (root == null || (root.left == null && root.right == null)) {
                return root;
            }
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }
    }

    public static class Solution3 {
        /**
         * A more concise version
         */
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }
            TreeNode temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
            return root;
        }
    }
}
