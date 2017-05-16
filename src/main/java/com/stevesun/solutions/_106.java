package com.stevesun.solutions;

import com.stevesun.common.classes.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 106. Construct Binary Tree from Inorder and Postorder Traversal
 *
 * Given inorder and postorder traversal of a tree, construct the binary tree.

 Note:
 You may assume that duplicates do not exist in the tree.

 */
public class _106 {

    //credit: https://discuss.leetcode.com/topic/3296/my-recursive-java-code-with-o-n-time-and-o-n-space
    /**The idea is to take the last element in postorder as the root; find the position of the root in the inorder array;
     * then locate the range for left sub-tree and right sub-tree and do recursion,
     * use a hashmap to record the index of root in the inorder array.*/
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length) {
            return null;
        }
        HashMap<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return buildTreeRecursively(0, inorder.length-1, postorder, 0, postorder.length-1,inorderMap);
    }

    private TreeNode buildTreeRecursively(int inorderStart, int inorderEnd, int[] postorder, int postorderStart, int postorderEnd, Map<Integer, Integer> inorderMap){
        if (postorderStart > postorderEnd || inorderStart > inorderEnd) return null;
        TreeNode root = new TreeNode(postorder[postorderEnd]);
        int inRoot = inorderMap.get(postorder[postorderEnd]);
        TreeNode leftchild = buildTreeRecursively(inorderStart, inRoot-1, postorder, postorderStart, postorderStart+inRoot-inorderStart-1, inorderMap);
        TreeNode rightchild = buildTreeRecursively(inRoot+1, inorderEnd, postorder, postorderStart+inRoot-inorderStart, postorderEnd-1, inorderMap);
        root.left = leftchild;
        root.right = rightchild;
        return root;
    }


}
