package easy;

import classes.TreeNode;

public class LowestCommonAncestorOfABinarySearchTree {
    //After drawing out the tree and run it manually, made it AC'ed easily! Cheers!

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == root || q == root) return root;
        if((root.val - p.val) * (root.val - q.val) <= 0) return root;
        if((root.val - p.val) * (root.val - q.val) > 0 && (root.val - q.val) > 0) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if((root.val - p.val) * (root.val - q.val) > 0 && (root.val - q.val) < 0) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

}
