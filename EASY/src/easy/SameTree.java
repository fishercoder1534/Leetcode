package easy;

import classes.TreeNode;

/**100. Same Tree

    Total Accepted: 145623
    Total Submissions: 330537
    Difficulty: Easy

Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value. */
public class SameTree {
	//recursion idea flows out naturally.
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null || q == null) return p == q;
		if(p.val != q.val) return false;
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
}
