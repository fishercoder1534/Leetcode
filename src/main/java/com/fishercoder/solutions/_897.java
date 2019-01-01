package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 897. Increasing Order Search Tree
 *
 * Given a tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only 1 right child.
 *
 * Example 1:
 * Input: [5,3,6,2,4,null,8,1,null,null,null,7,9]
 *
 *        5
 *       / \
 *     3    6
 *    / \    \
 *   2   4    8
 *  /        / \
 * 1        7   9
 *
 * Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
 *
 *  1
 *   \
 *    2
 *     \
 *      3
 *       \
 *        4
 *         \
 *          5
 *           \
 *            6
 *             \
 *              7
 *               \
 *                8
 *                 \
 *                  9
 * Note:
 *
 * The number of nodes in the given tree will be between 1 and 100.
 * Each node will have a unique integer value from 0 to 1000.
 *
 */
public class _897 {
  public static class Solution1 {
    public TreeNode increasingBST(TreeNode root) {
      List<Integer> inorderList = new ArrayList<>();
      inorderTraversal(root, inorderList);
      return constructTree(inorderList);
    }

    private TreeNode constructTree(List<Integer> inorderList) {
      if (inorderList.isEmpty() || inorderList.size() == 0) {
        return null;
      }
      TreeNode root = new TreeNode(inorderList.get(0));
      TreeNode tmp = root;
      for (int i = 1; i < inorderList.size(); i++) {
        tmp.right = new TreeNode(inorderList.get(i));
        tmp = tmp.right;
      }
      return root;
    }

    private void inorderTraversal(TreeNode root, List<Integer> inorderList) {
      if (root == null) {
        return;
      }
      if (root.left != null) {
        inorderTraversal(root.left, inorderList);
      }
      inorderList.add(root.val);
      if (root.right != null) {
        inorderTraversal(root.right, inorderList);
      }
    }
  }
}
