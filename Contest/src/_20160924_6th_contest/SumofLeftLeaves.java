package _20160924_6th_contest;

import classes.TreeNode;

public class SumofLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int result = 0;
        if(root == null) return result;
        return dfs(root, result, false);
    }
    
    private int dfs(TreeNode root, int result, boolean left) {
        if(root.left == null && root.right == null && left) {
            result += root.val;
            return result;
        }
        int leftResult = 0;
        if(root.left != null){
            left = true;
            leftResult = dfs(root.left, result, left);
        }
        int rightResult = 0;
        if(root.right != null){
            left = false;
            rightResult = dfs(root.right, result, left);
        }
        return leftResult + rightResult;
    }
}
