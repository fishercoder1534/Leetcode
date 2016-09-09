package chapter3_binary_tree_and_divide_and_conquer;

import java.util.ArrayList;

import classes.TreeNode;

public class BinaryTreePreorderTraversal {

    /**
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
    
    //easily 1 min AC! Cheers!
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        dfs(root, list);
        return list;
    }
    
    void dfs(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;
        list.add(root.val);
        dfs(root.left, list);
        dfs(root.right, list);
        return;
    }

}
