package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _450 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/65792/recursive-easy-to-understand-java-solution
         * Steps:
         * 1. Recursively find the node that has the same value as the key, while setting the left/right nodes equal to the returned subtree
         * 2. Once the node is found, have to handle the below 4 cases
         * a. node doesn't have left or right - return null
         * b. node only has left subtree- return the left subtree
         * c. node only has right subtree- return the right subtree
         * d. node has both left and right - find the minimum value in the right subtree, set that value to the currently found node, then recursively delete the minimum value in the right subtree
         */
        public TreeNode deleteNode(TreeNode root, int key) {
            if (root == null) {
                return root;
            }
            if (root.val > key) {
                root.left = deleteNode(root.left, key);
            } else if (root.val < key) {
                root.right = deleteNode(root.right, key);
            } else {
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }

                TreeNode minNode = getMin(root.right);
                root.val = minNode.val;
                root.right = deleteNode(root.right, root.val);
            }
            return root;
        }

        private TreeNode getMin(TreeNode node) {
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }
    }

    public static class Solution2 {
        /**
         * My original, but brute force solution, time complexity: O(n) instead of O(h)
         */
        public TreeNode deleteNode(TreeNode root, int key) {
            List<Integer> list = new ArrayList<>();
            dfs(root, key, list);
            return formBst(list, 0, list.size() - 1);
        }

        private TreeNode formBst(List<Integer> list, int left, int right) {
            if (left > right) {
                return null;
            }
            int mid = left + (right - left) / 2;
            TreeNode root = new TreeNode(list.get(mid));
            root.left = formBst(list, left, mid - 1);
            root.right = formBst(list, mid + 1, right);
            return root;
        }

        private List<Integer> dfs(TreeNode root, int key, List<Integer> list) {
            if (root == null) {
                return list;
            }
            dfs(root.left, key, list);
            if (root.val != key) {
                list.add(root.val);
            }
            dfs(root.right, key, list);
            return list;
        }
    }

    public static class Solution3 {
        /**
         * credit: https://leetcode.com/problems/delete-node-in-a-bst/solution/
         *
         * Again, using a pen and paper to visualize helps a lot.
         * Putting a BST into an inorder traversal array helps a lot to understand:
         *
         * The successor of a node is always: go the right once, and then go to the left as many times as possible，
         * because the successor is the next smallest element that is larger than the current one: so going to the right one time
         * makes sure that we are finding the larger one, and then keeping going to the left makes sure that we'll find the smallest one.
         *
         * The predecessor of a node is always: go the left once, and then go the right as many times as possible,
         * because the predecessor is the largest element that is smaller than the current one: so going to the left once makes it smaller than the current node,
         * then keeping going to the right makes sure that we are getting the largest element.
         */
        public TreeNode deleteNode(TreeNode root, int key) {
            if (root == null) {
                return null;
            }
            if (root.val < key) {
                //delete from the right subtree
                root.right = deleteNode(root.right, key);
            } else if (root.val > key) {
                //delete from the left subtree
                root.left = deleteNode(root.left, key);
            } else {
                //delete this current node, three cases:
                if (root.left == null && root.right == null) {
                    //case 1: if this is a leaf
                    root = null;
                } else if (root.right != null) {
                    //case 2: has a right child, regardless whether it has left children or not,
                    //this is because we want to traverse the tree only once, so we'll want to keep going down the tree
                    root.val = findSuccessor(root);//we find the value of the successor and assign it to current root.val
                    root.right = deleteNode(root.right, root.val);//and then we delete this successor's value in the right subtree as it's been moved up
                } else if (root.left != null) {
                    //case 3: this node is not a leaf and no right child, but has a left child
                    //That means that its successor is somewhere upper in the tree but we don't want to go back.
                    //Let's use the predecessor here which is somewhere lower in the left subtree.
                    root.val = findPredecessor(root);
                    root.left = deleteNode(root.left, root.val);
                }
            }
            return root;
        }

        private int findPredecessor(TreeNode root) {
            root = root.left;
            while (root.right != null) {
                root = root.right;
            }
            return root.val;
        }

        private int findSuccessor(TreeNode root) {
            root = root.right;
            while (root.left != null) {
                root = root.left;
            }
            return root.val;
        }
    }

}
