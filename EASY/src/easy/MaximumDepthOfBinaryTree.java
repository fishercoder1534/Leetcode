package easy;

import classes.TreeNode;

/**104. Maximum Depth of Binary Tree  QuestionEditorial Solution  My Submissions
Total Accepted: 163413
Total Submissions: 333641
Difficulty: Easy
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.*/
public class MaximumDepthOfBinaryTree {
    /**Key to understand recursion, applies to generic recursion:
     * figure out all of the base cases/exit cases*/
    
    //more verbose version
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftDepth = 0;
        if(root.left != null) leftDepth = maxDepth(root.left)+1;
        int rightDepth = 0;
        if(root.right != null) rightDepth = maxDepth(root.right)+1;
        return Math.max(1, Math.max(leftDepth, rightDepth));//the reason we need to max with 1 here is actually
        //for this case: if(root != null), it's implicit here, because we checked root.left != null and root.right != null
        //then it comes to root != null
        //example test case for the above scenario: nums = {1,1,1}
    }
    
    //more concise version
    public int maxDepth_shorter_version(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
