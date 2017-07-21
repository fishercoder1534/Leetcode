package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**100. Same Tree

Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value. */

public class _100 {
	//recursion idea flows out naturally.
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null || q == null) return p == q;
		return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
}
