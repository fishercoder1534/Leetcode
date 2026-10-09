package com.fishercoder.solutions.thirdthousand;

import com.fishercoder.common.classes.TreeNode;

import java.util.*;

public class _2415 {
    public static class Solution1 {
        /**
         * My completely original solution: I'm reconstructing a new tree after storing the values of each level.
         * Space complexity isn't that optimal.
         */
        public TreeNode reverseOddLevels(TreeNode root) {
            if (root == null) {
                return root;
            }
            List<List<Integer>> oddLevels = new ArrayList<>();
            List<List<Integer>> evenLevels = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            boolean odd = false;
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    list.add(node.val);
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
                if (odd) {
                    Collections.reverse(list);
                    oddLevels.add(list);
                } else {
                    evenLevels.add(list);
                }
                odd = !odd;
            }
            TreeNode newRoot = new TreeNode(root.val);
            queue.offer(newRoot);
            for (int i = 0; i < oddLevels.size(); i++) {
                List<Integer> list = oddLevels.get(i);
                int size = queue.size();
                int k = 0;
                for (int j = 0; j < size && k < list.size(); j++) {
                    TreeNode node = queue.poll();
                    node.left = new TreeNode(list.get(k++));
                    queue.offer(node.left);
                    node.right = new TreeNode(list.get(k++));
                    queue.offer(node.right);
                }
                if (i + 1 < evenLevels.size()) {
                    //this means there's evenLevels below the current odd level, so fill them up
                    list = evenLevels.get(i + 1);
                    size = queue.size();
                    k = 0;
                    for (int j = 0; j < size && k < list.size(); j++) {
                        TreeNode node = queue.poll();
                        node.left = new TreeNode(list.get(k++));
                        queue.offer(node.left);
                        node.right = new TreeNode(list.get(k++));
                        queue.offer(node.right);
                    }
                }
            }
            return newRoot;
        }
    }

    public static class Solution2 {
        public TreeNode reverseOddLevels(TreeNode root) {
            if (root == null) {
                return root;
            }
            dfs(root.left, root.right, 0);
            return root;
        }

        private void dfs(TreeNode leftChild, TreeNode rightChild, int level) {
            if (leftChild == null || rightChild == null) {
                return;
            }
            if (level % 2 == 0) {
                /**Note: this only updates the values of the two nodes,
                 * their left and right children nodes are not updated,
                 * that's how the rest of the function could work as expected.*/
                int tmp = leftChild.val;
                leftChild.val = rightChild.val;
                rightChild.val = tmp;
            }
            dfs(leftChild.left, rightChild.right, level + 1);
            dfs(leftChild.right, rightChild.left, level + 1);
        }
    }
}
