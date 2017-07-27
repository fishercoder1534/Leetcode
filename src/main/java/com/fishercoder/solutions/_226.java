package com.fishercoder.solutions;



import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**226. Invert Binary Tree

Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9

to

     4
   /   \
  7     2
 / \   / \
9   6 3   1

Trivia:
This problem was inspired by this original tweet by Max Howell:

    Google: 90% of our engineers use the software you wrote (Homebrew), but you can�t invert a binary tree on a whiteboard so fuck off.*/
public class _226 {

	public TreeNode invertTree_Editorial_solution_iterative(TreeNode root){
		if(root == null) return root;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while(!q.isEmpty()){
			TreeNode curr = q.poll();
			TreeNode temp = curr.left;
			curr.left = curr.right;
			curr.right = temp;
			if(curr.left != null) q.offer(curr.left);
			if(curr.right != null) q.offer(curr.right);
		}
		return root;
	}
	
	//a super classic recursion problem
	public TreeNode invertTree(TreeNode root) {
		if(root == null) return root;
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		invertTree(root.left);
		invertTree(root.right);
		return root;
	}
}
