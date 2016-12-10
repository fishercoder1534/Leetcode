package stevesun.algorithms;

import stevesun.common.classes.TreeNode;

/**Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

 According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

 _______6______
 /              \
 ___2__          ___8__
 /      \        /      \
 0      _4       7       9
 /  \
 3   5
 For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.

 */
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
