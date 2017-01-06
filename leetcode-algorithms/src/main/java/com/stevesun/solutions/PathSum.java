package com.stevesun.solutions;

import com.stevesun.common.classes.TreeNode;

/**112. Path Sum  QuestionEditorial Solution  My Submissions
Total Accepted: 115095
Total Submissions: 360394
Difficulty: Easy
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.*/
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if(root.val == sum && root.left == null && root.right == null) return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public static void main(String...strings){
        PathSum test = new PathSum();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        int sum = 5;
        
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(-2);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);
//        root.right = new TreeNode(-3);
//        root.right.left = new TreeNode(-2);
//        root.left.left.left = new TreeNode(-1);
//        int sum = 2;
//         1
//        / \
//      -2   -3
//      / \   / 
//     1   3 -2 
//    /      
//   -1
//        System.out.println(test.hasPathSum(root, sum));
        System.out.println(test.hasPathSumAgain(root, sum));
    }
    

    public boolean hasPathSumAgain(TreeNode root, int sum) {
        if(root == null) return false;
        if(root.left == null && root.right == null){
            if(sum == root.val) return true;
            else return false;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

}
