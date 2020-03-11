package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 938. Range Sum of BST
 *
 * Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
 *
 * The binary search tree is guaranteed to have unique values.
 *
 * Example 1:
 * Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
 * Output: 32
 *
 * Example 2:
 * Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 * Output: 23
 *
 * Note:
 * The number of nodes in the tree is at most 10000.
 * The final answer is guaranteed to be less than 2^31.
 */
public class _938 {
  public static class Solution1 {
    public int rangeSumBST(TreeNode root, int L, int R) {
      if (root == null) {
        return 0;
      }
      List<Integer> list = new ArrayList<>();
      dfs(root, L, R, list);
      return list.stream().mapToInt(num -> num).sum();
    }

    private void dfs(TreeNode root, int l, int r, List<Integer> list) {
      if (root == null) {
        return;
      }
      if (root.val <= r && root.val >= l) {
        list.add(root.val);
      }
      dfs(root.left, l, r, list);
      dfs(root.right, l, r, list);
    }
  }
}
