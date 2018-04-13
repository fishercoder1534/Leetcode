package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 129. Sum Root to Leaf Numbers
 *
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

 An example is the root-to-leaf path 1->2->3 which represents the number 123.

 Find the total sum of all root-to-leaf numbers.

 For example,

 1
 / \
 2   3
 The root-to-leaf path 1->2 represents the number 12.
 The root-to-leaf path 1->3 represents the number 13.

 Return the sum = 12 + 13 = 25.

 */
public class _129 {
  public static class Solution1 {
    public int sumNumbers(TreeNode root) {
      if (root == null) {
        return 0;
      }
      List<Integer> allNumbers = new ArrayList();
      dfs(root, new StringBuilder(), allNumbers);
      int sum = 0;
      for (int i : allNumbers) {
        sum += i;
      }
      return sum;
    }

    private void dfs(TreeNode root, StringBuilder sb, List<Integer> allNumbers) {
      sb.append(root.val);
      if (root.left != null) {
        dfs(root.left, sb, allNumbers);
      }
      if (root.right != null) {
        dfs(root.right, sb, allNumbers);
      }
      if (root.left == null && root.right == null) {
        allNumbers.add(Integer.parseInt(sb.toString()));
      }
      sb.deleteCharAt(sb.length() - 1);
    }
  }

  public static class Solution2 {
    public int sumNumbers(TreeNode root) {
      return dfs(root, 0);
    }

    private int dfs(TreeNode root, int sum) {
      if (root == null) {
        return 0;
      }
      if (root.left == null && root.right == null) {
        return sum * 10 + root.val;
      }
      return dfs(root.left, sum * 10 + root.val) + dfs(root.right, sum * 10 + root.val);
    }
  }

}
