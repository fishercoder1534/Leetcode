package chapter3_binary_tree_and_divide_and_conquer;

import classes.TreeNode;

public class BinaryTreeMaximumPathSum {
    
    //used the approach that jiuzhang officially explained, pretty cool!
    //create a new class to store two pieces of information, this makes things a lot easier!

    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int maxPathSum(TreeNode root) {
        return dfs(root).maxPath;
    }
    
    ResultType dfs(TreeNode root){
        //exit
        if(root == null){
            return new ResultType(0, Integer.MIN_VALUE);
        }
        
        //divide
        ResultType left = dfs(root.left);
        ResultType right = dfs(root.right);
        
        //conquer
        int singlePath = Math.max(left.singlePath, right.singlePath) + root.val;
        singlePath = Math.max(0, singlePath);
        
        int maxPath = Math.max(left.maxPath, right.maxPath);
        maxPath = Math.max(maxPath, left.singlePath + right.singlePath + root.val);
        
        
        return new ResultType(singlePath, maxPath);
        
    }
    
    class ResultType {
        int maxPath;
        int singlePath;
        ResultType(int singlePath, int maxPath){
            this.maxPath = maxPath;
            this.singlePath = singlePath;
        }
    }

}
