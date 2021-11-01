package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

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
            TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
            Queue<TreeNode> queue = new LinkedList();
            queue.offer(root);
            for (int i = 1; i < nodes.length; i++) {
                TreeNode curr = queue.poll();
                if (!nodes[i].equals("#")) {
                    curr.left = new TreeNode(Integer.parseInt(nodes[i]));
                    queue.offer(curr.left);
                }
                if (!nodes[++i].equals("#")) {
                    curr.right = new TreeNode(Integer.parseInt(nodes[i]));
                    queue.offer(curr.right);
                }
            }
            return root;
        }
    }
}
