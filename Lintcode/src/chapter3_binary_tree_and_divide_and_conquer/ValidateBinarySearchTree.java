package chapter3_binary_tree_and_divide_and_conquer;

import classes.TreeNode;

public class ValidateBinarySearchTree {


    /**
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
    public static boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    static boolean dfs(TreeNode root, long min, long max){
        if(root == null) return true;
        if( (long) root.val >= max || (long) root.val <= min) return false;
        boolean left = dfs(root.left, min, root.val);
        boolean right = true;
        if(left) right = dfs(root.right, root.val, max);
        return left && right;
    }
    

    
    public static void main(String...strings){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        System.out.println(isValidBST(root));
    }

}
