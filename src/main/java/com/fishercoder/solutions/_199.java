package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**199. Binary Tree Right Side View

Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

For example:
Given the following binary tree,

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---

You should return [1, 3, 4]. */

public class _199 {

	public static class Solution1 {
		/**credit: https://leetcode.com/problems/binary-tree-right-side-view/discuss/56012/My-simple-accepted-solution(JAVA)*/
		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> result = new ArrayList<>();
			rightView(root, result, 0);
			return result;
		}

		void rightView(TreeNode curr, List<Integer> result, int currDepth) {
			if (curr == null) {
				return;
			}
			if (currDepth == result.size()) {
				result.add(curr.val);
			}
			rightView(curr.right, result, currDepth + 1);
			rightView(curr.left, result, currDepth + 1);
		}
	}

	public static class Solution2 {
		/**BFS the tree*/
		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> result = new ArrayList<>();
			if (root == null) {
				return result;
			}
			Queue<TreeNode> q = new LinkedList<>();
			q.offer(root);
			while (!q.isEmpty()) {
				int size = q.size();
				for (int i = 0; i < size; i++) {
					TreeNode curr = q.poll();
					if (i == size - 1) {
						result.add(curr.val);
					}
					if (curr.left != null) {
						q.offer(curr.left);
					}
					if (curr.right != null) {
						q.offer(curr.right);
					}
				}
			}
			return result;
		}
	}

}