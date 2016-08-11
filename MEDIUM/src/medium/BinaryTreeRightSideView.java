package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import classes.TreeNode;

/**199. Binary Tree Right Side View

    Total Accepted: 50496
    Total Submissions: 138613
    Difficulty: Medium

Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

For example:
Given the following binary tree,

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---

You should return [1, 3, 4]. */
public class BinaryTreeRightSideView {
	//Using BFS is pretty straightforward. But there might be a smarter way.
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		if(root == null) return res;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while(!q.isEmpty()){
			int currentSize = q.size();
			int i = 0;
			for(; i < currentSize-1; i++){
				TreeNode currentNode = q.poll();
				if(currentNode.left != null) q.offer(currentNode.left);
				if(currentNode.right != null) q.offer(currentNode.right);
			}
			TreeNode currentNode = q.poll();
			if(currentNode.left != null) q.offer(currentNode.left);
			if(currentNode.right != null) q.offer(currentNode.right);
			res.add(currentNode.val);
		}
		return res;
	}
	
	public static void main(String...strings){
		BinaryTreeRightSideView test = new BinaryTreeRightSideView();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(4);
		List<Integer> result = test.rightSideView(root);
		for(int i : result){
			System.out.print(i + ", ");
		}
	}
}
