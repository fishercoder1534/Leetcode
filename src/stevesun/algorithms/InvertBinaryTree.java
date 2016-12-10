package stevesun.algorithms;

import stevesun.common.classes.TreeNode;

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
public class InvertBinaryTree {
	//then I turned to Editorial solution, it provides an iterative version: time complexity is the same with recursion version: O(n), space complexity could be O(n) which is worse than
	//the recursive version which is O(h), h is the height of the tree since recursion might place h recursive calls on the stack
	public TreeNode invertTree_Editorial_solution_iterative(TreeNode root){
		if(root == null) return root;
		//basically using the idea of BFS
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
	
	//a super classic recursion problem, I'm really glad that I made this one AC'ed now the first time I submitted it. Practice does make perfect!
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
