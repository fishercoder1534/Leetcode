package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 297. Serialize and Deserialize Binary Tree
 *
 * Serialization is the process of converting a data structure or object into a sequence of bits
 * so that it can be stored in a file or memory buffer,
 * or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
 * Design an algorithm to serialize and deserialize a binary tree.
 * There is no restriction on how your serialization/deserialization algorithm should work.
 * You just need to ensure that a binary tree can be serialized to a string and this string can
 * be deserialized to the original tree structure.

 For example, you may serialize the following tree

     1
    / \
   2   3
  / \
 4   5

 as "[1,2,3,null,null,4,5]",
 just the same as how LeetCode OJ serializes a binary tree.
 You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.

 Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms should be stateless.
 */
public class _297 {

    public static class Solution1 {
        /**
         * The idea is very straightforward:
         * use "#" as the terminator, do BFS, level order traversal to store all nodes values into a StringBuilder.
         * When deserializing, also use a queue: pop the root into the queue first, then use a for loop to construct each node,
         * then eventually just return the root.
         */

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) {
                return "";
            }

            StringBuilder sb = new StringBuilder();
            Queue<TreeNode> queue = new LinkedList();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    if (curr == null) {
                        sb.append("# ");
                        continue;
                    }
                    sb.append(curr.val);
                    sb.append(" ");
                    queue.offer(curr.left);
                    queue.offer(curr.right);
                }
            }
            return sb.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data == null || data.isEmpty()) {
                return null;
            }

            String[] nodes = data.split(" ");
            TreeNode root = new TreeNode(Integer.valueOf(nodes[0]));
            Queue<TreeNode> queue = new LinkedList();
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
