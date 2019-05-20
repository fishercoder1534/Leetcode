package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 449. Serialize and Deserialize BST
 *
 * Serialization is the process of converting a data structure or
 * object into a sequence of bits so that it can be stored in a file or memory buffer,
 * or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
 *
 * Design an algorithm to serialize and deserialize a binary search tree.
 * There is no restriction on how your serialization/deserialization algorithm should work.
 * You just need to ensure that a binary search tree can be serialized to a string and this
 * string can be deserialized to the original tree structure.
 * The encoded string should be as compact as possible.

 Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms should be stateless.
 */

public class _449 {

    public static class Solution1 {
        /**
         * Preorder
         * Reference: https://discuss.leetcode.com/topic/97922/pre-or-post-order-with-only-keeping-one-bound-beat-98-and-95
         */

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) {
                return null;
            }
            StringBuilder stringBuilder = new StringBuilder();
            return serialize(root, stringBuilder);
        }

        private String serialize(TreeNode root, StringBuilder stringBuilder) {
            if (root == null) {
                return null;
            }
            stringBuilder.append(root.val).append(" ");
            serialize(root.left, stringBuilder);
            serialize(root.right, stringBuilder);
            return stringBuilder.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data == null || data.length() == 0) {
                return null;
            }
            String[] values = data.split(" ");
            int[] index = new int[]{0};/**TODO: Why must use an int array, instead of just an int?*/
            return deserialize(values, index, Integer.MAX_VALUE);
        }

        private TreeNode deserialize(String[] values, int[] index, int maxValue) {
            if (index[0] >= values.length || Integer.valueOf(values[index[0]]) >= maxValue) {
                return null;
            }
            TreeNode root = new TreeNode(Integer.valueOf(values[index[0]++]));
            root.left = deserialize(values, index, root.val);
            root.right = deserialize(values, index, maxValue);
            return root;
        }
    }

    public static class Solution2 {
        /**
         * Postorder
         * Reference: https://discuss.leetcode.com/topic/97922/pre-or-post-order-with-only-keeping-one-bound-beat-98-and-95
         */

        public String serialize(TreeNode root) {
            if (root == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            return serialize(root, sb);
        }

        private String serialize(TreeNode root, StringBuilder sb) {
            if (root == null) {
                return null;
            }
            serialize(root.left, sb);
            serialize(root.right, sb);
            sb.append(root.val).append(" ");
            return sb.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data == null || data.length() == 0) {
                return null;
            }
            String[] values = data.split(" ");
            int[] index = new int[]{values.length - 1};/**TODO: This is not just one element any more like in the preorder solution above*/
            return deserialize(values, index, Integer.MIN_VALUE);
        }

        private TreeNode deserialize(String[] values, int[] index, int minValue) {
            if (index[0] < 0 || Integer.valueOf(values[index[0]]) < minValue) {
                return null;
            }
            TreeNode root = new TreeNode(Integer.valueOf(values[index[0]--]));
            root.right = deserialize(values, index, root.val);
            root.left = deserialize(values, index, minValue);
            return root;
        }
    }

    public static class Solution3 {
        /**
         * This is a generic solution that applies to both BT and BST. And also the easiest to follow.
         */

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            StringBuilder stringBuilder = new StringBuilder();
            if (root == null) {
                return stringBuilder.toString();
            }
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    if (curr == null) {
                        stringBuilder.append("# ");
                    } else {
                        stringBuilder.append(curr.val + " ");
                        queue.offer(curr.left);
                        queue.offer(curr.right);
                    }
                }
            }
            return stringBuilder.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data == null || data.length() == 0) {
                return null;
            }
            String[] nodes = data.split(" ");
            TreeNode root = new TreeNode(Integer.valueOf(nodes[0]));
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            for (int i = 1; i < nodes.length; i++) {
                TreeNode curr = queue.poll();
                if (!nodes[i].equals("#")) {
                    curr.left = new TreeNode(Integer.valueOf(nodes[i]));
                    queue.offer(curr.left);
                }
                if (!nodes[++i].equals("#")) {
                    curr.right = new TreeNode(Integer.valueOf(nodes[i]));
                    queue.offer(curr.right);
                }
            }
            return root;
        }
    }
}
