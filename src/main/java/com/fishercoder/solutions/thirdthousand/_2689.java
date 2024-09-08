package com.fishercoder.solutions.thirdthousand;

public class _2689 {
    //      Definition for a rope tree node.
    public static class RopeTreeNode {
        public int len;
        public String val;
        public RopeTreeNode left;
        public RopeTreeNode right;

        public RopeTreeNode() {}

        public RopeTreeNode(String val) {
            this.len = 0;
            this.val = val;
        }

        public RopeTreeNode(int len) {
            this.len = len;
            this.val = "";
        }

        public RopeTreeNode(int len, RopeTreeNode left, RopeTreeNode right) {
            this.len = len;
            this.val = "";
            this.left = left;
            this.right = right;
        }
    }

    public static class Solution1 {
        /*
         * My completely original solution.
         */
        public char getKthCharacter(RopeTreeNode root, int k) {
            StringBuilder sb = new StringBuilder();
            postOrderToConcatenate(root, k, sb);
            return sb.charAt(k - 1);
        }

        private void postOrderToConcatenate(RopeTreeNode root, int k, StringBuilder sb) {
            if (sb.length() >= k || root == null) {
                return;
            }
            postOrderToConcatenate(root.left, k, sb);
            postOrderToConcatenate(root.right, k, sb);
            sb.append(root.val);
        }
    }
}
