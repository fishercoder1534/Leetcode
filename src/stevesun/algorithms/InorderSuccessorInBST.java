package stevesun.algorithms;

import stevesun.common.classes.TreeNode;

/**285. Inorder Successor in BST

Given a binary search tree and a node in it, find the in-order successor of that node in the BST.

Note: If the given node has no in-order successor in the tree, return null. */
public class InorderSuccessorInBST {

    //Amazed at this solution: https://discuss.leetcode.com/topic/25698/java-python-solution-o-h-time-and-o-1-space-iterative
    //I used brute force: traverse the tree and store and nodes in a list, then traverse the list to compare with p to return the successor if there is.
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode succ = null;
        while(root != null){
            if(p.val < root.val){
                succ = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return succ;
    }

}
