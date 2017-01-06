package com.stevesun.solutions;

import com.stevesun.common.classes.TreeNode;

public class LowestCommonAncestorOfABinaryTree {
//we need to find TWO nodes in the tree, so we'll have to divide and conquer this tree, we need to have two nodes to as the intermediate
    //result, inspired by this one: https://discuss.leetcode.com/topic/18566/my-java-solution-which-is-easy-to-understand
    //Also, refer to my earlier drawings:http://www.fishercoder.com/2016/06/23/lowest-common-ancestor-of-a-binary-tree/
    //I'm really impressed with myself at that time!
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null) return root;
        return left != null ? left : right;
    }

}
