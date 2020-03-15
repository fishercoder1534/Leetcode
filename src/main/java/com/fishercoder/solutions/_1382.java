package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 1382. Balance a Binary Search Tree
 *
 * Given a binary search tree, return a balanced binary search tree with the same node values.
 * A binary search tree is balanced if and only if the depth of the two subtrees of every node never differ by more than 1.
 * If there is more than one answer, return any of them.
 *
 * Example 1:
 * Input: root = [1,null,2,null,3,null,4,null,null]
 * Output: [2,1,3,null,null,null,4]
 * Explanation: This is not the only correct answer, [3,1,4,null,2,null,null] is also correct.
 *
 * Constraints:
 * The number of nodes in the tree is between 1 and 10^4.
 * The tree nodes will have distinct values between 1 and 10^5.
 * */
public class _1382 {
    public static class Solution1 {
        public TreeNode balanceBST(TreeNode root) {
            List<Integer> inorder = inorder(root, new ArrayList<>());
            return dfs(inorder, 0, inorder.size() - 1);
        }

        private List<Integer> inorder(TreeNode root, List<Integer> list) {
            if (root == null) {
                return list;
            }
            inorder(root.left, list);
            list.add(root.val);
            return inorder(root.right, list);
        }

        private TreeNode dfs(List<Integer> nums, int start, int end) {
            if (end < start) {
                return null;
            }
            int mid = (start + end) / 2;
            TreeNode root = new TreeNode(nums.get(mid));
            root.left = dfs(nums, start, mid - 1);
            root.right = dfs(nums, mid + 1, end);
            return root;
        }
    }
}
