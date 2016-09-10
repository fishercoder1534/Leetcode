package chapter3_binary_tree_and_divide_and_conquer;

import classes.TreeNode;

public class BinaryTreeMaximumPathSumII {

    /**
     * @param root the root of binary tree.
     * @return an integer
     */
    int max = Integer.MIN_VALUE;
    public int maxPathSum2(TreeNode root) {
        // Write your code here
        if(root == null) return 0;
        return dfs(root, 0, max);
    }
    
    int dfs(TreeNode root, int curr, int max){
        curr += root.val;
        max = Math.max(max, curr);
        int leftMax = max, rightMax = max;
        if(root.left != null) leftMax = dfs(root.left, curr, max);
        if(root.right != null) rightMax = dfs(root.right, curr, max);
        return Math.max(Math.max(leftMax, rightMax), max);
    }
    
    public static void main(String...strings){
        BinaryTreeMaximumPathSumII test = new BinaryTreeMaximumPathSumII();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.print(test.maxPathSum2(root));
    }

}
