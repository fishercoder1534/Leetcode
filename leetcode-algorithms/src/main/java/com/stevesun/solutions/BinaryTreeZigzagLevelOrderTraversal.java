package com.stevesun.solutions;

import com.stevesun.common.classes.TreeNode;

import java.util.*;

/**
 * 103. Binary Tree Zigzag Level Order Traversal  
 * 
Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
*/
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        List<List<Integer>> levels = new ArrayList();
        if(root == null) return levels;
        q.offer(root);
        boolean forward = true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList();
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                level.add(curr.val);
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            if(forward){
                forward = false;
                levels.add(level);
            } else {
                Collections.reverse(level);
                levels.add(level);
                forward = true;
            }
        }
        return levels;
    }
}
