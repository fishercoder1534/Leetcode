package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 783. Minimum Distance Between BST Nodes
 *
 * Given a Binary Search Tree (BST) with the root node root, return the minimum difference between the values of any two different nodes in the tree.

 Example :

 Input: root = [4,2,6,1,3,null,null]
 Output: 1
 Explanation:
 Note that root is a TreeNode object, not an array.

 The given tree [4,2,6,1,3,null,null] is represented by the following diagram:

      4
    /   \
   2     6
  / \
 1  3

 while the minimum difference in this tree is 1, it occurs between node 1 and node 2, also between node 3 and node 2.

 Note:

 The size of the BST will be between 2 and 100.
 The BST is always valid, each node's value is an integer, and each node's value is different.
 */

public class _783 {
  public static class Solution1 {
    public int minDiffInBST(TreeNode root) {
      List<Integer> inorder = new ArrayList<>();
      inorder(root, inorder);
      return findMinDiff(inorder);
    }

    private int findMinDiff(List<Integer> inorder) {
      int minDiff = Integer.MAX_VALUE;
      for (int i = 1; i < inorder.size(); i++) {
        minDiff = Math.min(minDiff, inorder.get(i) - inorder.get(i - 1));
      }
      return minDiff;
    }

    private void inorder(TreeNode root, List<Integer> inorder) {
      if (root == null) {
        return;
      }
      inorder(root.left, inorder);
      inorder.add(root.val);
      inorder(root.right, inorder);
    }
  }
}
