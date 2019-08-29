package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 653. Two Sum IV - Input is a BST
 *
 * Given a Binary Search Tree and a target number,
 * return true if there exist two elements in the BST such that their sum is equal to the given target.

 Example 1:
 Input:
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9
Output: True

Example 2:
Input:
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28
Output: False

 */
public class _653 {

    public static class Solution1 {
        public boolean findTarget(TreeNode root, int k) {
            if (root == null) {
                return false;
            }
            List<Integer> list = new ArrayList<>();
            dfs(root, list);
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i) + list.get(j) == k) {
                        return true;
                    }
                }
            }
            return false;
        }

        private void dfs(TreeNode root, List<Integer> list) {
            list.add(root.val);
            if (root.left != null) {
                dfs(root.left, list);
            }
            if (root.right != null) {
                dfs(root.right, list);
            }
        }
    }
}
