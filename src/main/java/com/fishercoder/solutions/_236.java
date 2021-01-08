package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _236 {
    public static class Solution1 {

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || root == p || root == q) {
                return root;
            }
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (left != null && right != null) {
                return root;
            }
            return left != null ? left : right;
        }
    }

    public static class Solution2 {
        List<Integer> path1 = new ArrayList<>();
        List<Integer> path2 = new ArrayList<>();
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

            return findLCA(root, p, q);
        }

        private TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q){

            if(!findPath(root, p, path1) || !findPath(root, q, path2)){
                return null;
            }
            int i = 0;
            while(i < path1.size() && i < path2.size()){
                if(!path1.get(i).equals(path2.get(i))){
                    break;
                }
                i++;
            }
            return new TreeNode(path1.get(i-1));
        }
        private boolean findPath(TreeNode root, TreeNode node, List<Integer> path){
            if(root == null)
                return false;

            path.add(root.val);

            if(root.val == node.val)
                return true;

            if(root.left != null && findPath(root.left, node, path)){
                return true;
            }
            if(root.right != null && findPath(root.right, node, path)){
                return true;
            }

            path.remove(path.size()-1);
            return false;
        }
    }
}
