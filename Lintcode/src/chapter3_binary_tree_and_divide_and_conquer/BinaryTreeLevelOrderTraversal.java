package chapter3_binary_tree_and_divide_and_conquer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import classes.TreeNode;

public class BinaryTreeLevelOrderTraversal {

    /**
     * @param root: The root of binary tree.
     * @return: Level order a list of lists of integer
     */
    
    //2 mins AC! Cheers!
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                list.add(curr.val);
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            result.add(list);
        }
        return result;
    }

}
