package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class _106 {
    public static class Solution1 {

        /**
         * https://discuss.leetcode.com/topic/3296/my-recursive-java-code-with-o-n-time-and-o-n-space
         * Note: the last element of postorder array is the root!
         * The idea is to take the last element in postorder as the root; find the position of the root
         * in the inorder array; then locate the range for left sub-tree and right sub-tree and do
         * recursion, use a hashmap to record the index of root in the inorder array.
         */
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            if (inorder == null || postorder == null || inorder.length != postorder.length) {
                return null;
            }
            HashMap<Integer, Integer> inorderMap = new HashMap<>();
            for (int i = 0; i < inorder.length; i++) {
                inorderMap.put(inorder[i], i);
            }
            /**At the beginning, both start from 0 to nums.length-1*/
            return buildTreeRecursively(inorderMap, 0, inorder.length - 1, postorder, 0,
                    postorder.length - 1);
        }

        private TreeNode buildTreeRecursively(Map<Integer, Integer> inorderMap, int inorderStart,
                                              int inorderEnd, int[] postorder, int postorderStart, int postorderEnd) {
            if (postorderStart > postorderEnd || inorderStart > inorderEnd) {
                return null;
            }
            TreeNode root = new TreeNode(postorder[postorderEnd]);
            int inRoot = inorderMap.get(postorder[postorderEnd]);
            int numsLeft = inRoot - inorderStart;

            /**It's easy to understand and remember:
             * for the indices of inorder array:
             * inStart and inRoot-1 as new start and end indices
             * inRoot+1 and inEnd as new start and end indices
             *
             * this is easy to understand and remember: since inRoot is already been used in this recursion call, so we're going to use inRoot-1 and inRoot+1 for next recursion call
             *
             * for the indices of postorder array:
             * postorderStart and postorderStart+numsLeft-1 should be the new start and end indices
             * postorderStart+numsLeft and postorderEnd-1 should be the new start and end indices
             *
             * this is also easy to understand and remember:
             * since the last one in postorder is the root and we have used it in this recursion call already, so the end is definitely postorderEnd-1;
             * then the postorderEnd for root.left is contiguous to the postorderStart of root.right, :)*/
            root.left = buildTreeRecursively(inorderMap, inorderStart, inRoot - 1, postorder, postorderStart, postorderStart + numsLeft - 1);
            root.right = buildTreeRecursively(inorderMap, inRoot + 1, inorderEnd, postorder, postorderStart + numsLeft, postorderEnd - 1);
            return root;
        }
    }

    public static class Solution2 {
        /**
         * My own solution after inspiration from LeetCode 105.
         * I go from the right to the left for the postorder array, also, I build the tree by forming the right subtree first and then the left subtree.
         * A bit different from using numsLeft from LeetCode 106, I use numsRight, meaning the number of nodes needed to form the right subtree in the inorder array.
         */
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            Map<Integer, Integer> inMap = new HashMap<>();
            for (int i = 0; i < inorder.length; i++) {
                inMap.put(inorder[i], i);
            }
            return helper(postorder, inorder, inMap, postorder.length - 1, 0, 0, inorder.length - 1);
        }

        private TreeNode helper(int[] postorder, int[] inorder, Map<Integer, Integer> inMap, int postStart, int postEnd, int inStart, int inEnd) {
            if (postStart < postEnd) {
                return null;
            }
            int inRoot = inMap.get(postorder[postStart]);
            int numsRight = inEnd - inRoot;
            TreeNode node = new TreeNode(postorder[postStart]);
            node.right = helper(postorder, inorder, inMap, postStart - 1, postStart - numsRight, inRoot + 1, inEnd);
            node.left = helper(postorder, inorder, inMap, postStart - numsRight - 1, postEnd, inStart, inRoot - 1);
            return node;
        }
    }
}
