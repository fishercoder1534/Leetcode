package chapter3_binary_tree_and_divide_and_conquer;

import classes.TreeNode;

public class MaximumDepthofBinaryTree {

    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    
    //1 min easy AC! Cheers!
    public int maxDepth(TreeNode root) {
        // write your code here
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right)+1;
    }

}
