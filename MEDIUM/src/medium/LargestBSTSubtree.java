package medium;

import classes.TreeNode;

public class LargestBSTSubtree {

    public int largestBSTSubtree(TreeNode root) {
        if(root == null) return 0;
        if(isBST(root)) return getNodes(root);
        return Math.max(find(root.left), find(root.right));
    }
    
    int find(TreeNode root){
        if(isBST(root)) return getNodes(root);
        return Math.max(find(root.left), find(root.right));
    }
    
    int getNodes(TreeNode root){
        if(root == null) return 0;
        return dfsCount(root);
    }
    
    int dfsCount(TreeNode root){
        if(root == null) return 0;
        return dfsCount(root.left) + dfsCount(root.right) + 1;
    }
    
    boolean isBST(TreeNode root){
        if(root == null) return true;
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    boolean dfs(TreeNode root, long min, long max){
        if(root == null) return true;
        if(root.val <= min || root.val >= max) return false;
        return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
    }

}
