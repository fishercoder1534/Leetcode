package com.fishercoder.solutions.secondthousand;

public class _1666 {
    static class Node {
        public int val;
        public Node parent;
        public Node left;
        public Node right;

    }

    public static class Solution1 {
        public Node flipBinaryTree(Node root, Node leaf) {
            postorderDfs(root, leaf);
            leaf.parent = null;
            return leaf;
        }

        private boolean postorderDfs(Node curr, Node leaf) {
            if (curr == null) {
                return false;
            }
            if (curr == leaf) {
                return true;
            }
            boolean foundInLeft = postorderDfs(curr.left, leaf);
            boolean foundInRight = postorderDfs(curr.right, leaf);
            if (foundInLeft || foundInRight) {
                //identify which child is on the path to the leaf node
                Node childOnPath = foundInRight ? curr.right : curr.left;

                //if the child on the path to the leaf already has a left node, move it to the right
                if (childOnPath.left != null) {
                    childOnPath.right = childOnPath.left;
                }

                //make the curr node the new left child
                childOnPath.left = curr;

                //sever/break the old child pointer from curr to childOnPath
                if (curr.left == childOnPath) {
                    curr.left = null;
                } else {
                    curr.right = null;
                }

                //update the parent pointer of curr to point to childOnPath
                curr.parent = childOnPath;
                return true;
            }
            return false;
        }

    }
}
