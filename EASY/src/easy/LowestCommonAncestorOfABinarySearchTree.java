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
    

    //cheers! so easy to made it ACed! Pretty straightforward after thinking it through. - 09/27/2016
    public TreeNode lowestCommonAncestor_again(TreeNode root, TreeNode p, TreeNode q) {
        if(p == root || q == root) return root;
        if((root.val - p.val) * (root.val - q.val) < 0) return root;
        if((root.val - p.val) * (root.val - q.val) > 0 && root.val - q.val > 0) return lowestCommonAncestor(root.left, p, q);
        if((root.val - p.val) * (root.val - q.val) > 0 && root.val - q.val < 0) return lowestCommonAncestor(root.right, p, q);
        return root;
    }


}
