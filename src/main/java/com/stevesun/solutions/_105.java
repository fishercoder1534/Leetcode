package com.stevesun.solutions;

import com.stevesun.common.classes.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**Given preorder and inorder traversal of a tree, construct the binary tree.

 Note:
 You may assume that duplicates do not exist in the tree.*/
public class _105 {

	//credit: https://discuss.leetcode.com/topic/29838/5ms-java-clean-solution-with-caching
	//use HashMap as the cache so that accessing inorder index becomes O(1) time
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		Map<Integer, Integer> inMap = new HashMap();
		for (int i = 0; i < inorder.length; i++) {
			inMap.put(inorder[i], i);
		}

		return buildTree(preorder, 0, preorder.length-1, 0, inorder.length-1, inMap);
	}

	private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int inStart, int inEnd, Map<Integer, Integer> inMap) {
		if (preStart > preEnd || inStart > inEnd) return null;

		TreeNode root = new TreeNode(preorder[preStart]);
		int inRoot = inMap.get(root.val);
		int numsLeft = inRoot - inStart;

		root.left = buildTree(preorder, preStart+1, preStart+numsLeft, inStart, inRoot-1, inMap);
		root.right = buildTree(preorder, preStart+numsLeft+1, preEnd, inRoot+1, inEnd, inMap);
		return root;
	}

}
