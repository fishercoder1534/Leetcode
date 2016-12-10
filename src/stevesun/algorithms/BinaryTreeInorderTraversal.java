package stevesun.algorithms;

import stevesun.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        return inorder(root, result);
    }
    
    List<Integer> inorder(TreeNode root, List<Integer> result){
        if(root == null) return result;
        if(root.left != null) inorder(root.left, result);
        result.add(root.val);
        if(root.right != null) inorder(root.right, result);
        return result;
    }

    public List<Integer> inorderTraversal_iterative(TreeNode root) {
        List<Integer> result = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }


}
