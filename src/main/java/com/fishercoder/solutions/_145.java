package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.CommonUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**Given a binary tree, return the postorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 1
  \
   2
  /
 3
 return [3,2,1].

 Note: Recursive solution is trivial, could you do it iteratively?*/

public class _145 {
	/**A tricky one: Modify the code for pre-order traversal so that it becomes root->right->left, and then reverse the result to get left->right->root.*/
    public static List<Integer> postorderTraversal_iterative(TreeNode root) {
        List<Integer> result = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        if(root == null) return result;
        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            result.add(root.val);
            if(root.left != null) stack.push(root.left);
            if(root.right != null) stack.push(root.right);
        }
        Collections.reverse(result);
        return result;
    }
    
    public static void main(String...strings){
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
        
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
        
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        List<Integer> result = postorderTraversal_iterative(root);
        CommonUtils.printList(result);
    }
    
    public List<Integer> postorderTraversal_recursive(TreeNode root) {
        List<Integer> result = new ArrayList();
        return post(root, result);
    }
    
    List<Integer> post(TreeNode root, List<Integer> result){
        if(root == null) return result;
        post(root.left, result);
        post(root.right, result);
        result.add(root.val);
        return result;
    }
}
