package com.stevesun.common.classes;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public TreeNode(int x){this.val = x;}
    
    public TreeNode(TreeNode left, int val, TreeNode right) {
        this.left = left;
        this.val = val;
        this.right = right;
    }
}
