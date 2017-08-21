package com.fishercoder.common.classes;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TreeNode)) {
            return false;
        }

        TreeNode treeNode = (TreeNode) o;

        if (val != treeNode.val) {
            return false;
        }
        if (left != null ? !left.equals(treeNode.left) : treeNode.left != null) {
            return false;
        }
        return right != null ? right.equals(treeNode.right) : treeNode.right == null;
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (left != null ? left.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TreeNode{" + "val=" + val + ", left=" + left + ", right=" + right + '}';
    }

    public TreeNode(int x) {
        this.val = x;
    }

    public TreeNode(TreeNode left, int val, TreeNode right) {
        this.left = left;
        this.val = val;
        this.right = right;
    }
}
