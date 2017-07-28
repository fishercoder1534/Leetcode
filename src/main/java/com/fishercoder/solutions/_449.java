package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

 Design an algorithm to serialize and deserialize a binary search tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary search tree can be serialized to a string and this string can be deserialized to the original tree structure.

 The encoded string should be as compact as possible.

 Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms should be stateless.
 */
public class _449 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();
        if (root == null) return stringBuilder.toString();
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
        if (data == null || data.length() == 0) return null;
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
