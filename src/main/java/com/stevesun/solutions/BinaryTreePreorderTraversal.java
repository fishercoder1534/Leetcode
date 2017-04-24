package com.stevesun.solutions;

import com.stevesun.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**Given a binary tree, return the preorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 1
  \
   2
  /
 3
 return [1,2,3].

 Note: Recursive solution is trivial, could you do it iteratively?*/

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal_iterative_original(TreeNode root) {
        List<Integer> list = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        if(root == null) return list;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            list.add(curr.val);
            if(curr.right != null) stack.push(curr.right);
            if(curr.left != null) stack.push(curr.left);
        }
        return list;
    }

    public List<Integer> preorderTraversal_recursive_1(TreeNode root) {
        List<Integer> list = new ArrayList();
        return pre(root, list);
    }
    
    List<Integer> pre(TreeNode root, List<Integer> list){
        if(root == null) return list;
        list.add(root.val);
        pre(root.left, list);
        pre(root.right, list);
        return list;
    }


	public List<Integer> preorderTraversal_recursive_2(TreeNode root) {
		List<Integer> result = new ArrayList();
		if (root != null) dfs(root, result);
		return result;
	}

	private void dfs(TreeNode root, List<Integer> result){
		result.add(root.val);
		if (root.left != null) dfs(root.left, result);
		if (root.right != null) dfs(root.right, result);
	}


}
