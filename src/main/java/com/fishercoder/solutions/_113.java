package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 113. Path Sum II

 Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1

 return
[
   [5,4,11,2],
   [5,8,4,5]
]
*/
public class _113 {

  public static class Solution1 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
      List<List<Integer>> allPaths = new ArrayList();
      if (root == null) {
        return allPaths;
      }
      dfs(root, new ArrayList(), allPaths, sum);
      return allPaths;
    }

    private void dfs(TreeNode root, List<Integer> path, List<List<Integer>> allPaths, int sum) {
      path.add(root.val);
      if (root.left != null) {
        dfs(root.left, path, allPaths, sum - root.val);
      }
      if (root.right != null) {
        dfs(root.right, path, allPaths, sum - root.val);
      }
      if (root.left == null && root.right == null) {
        /**Check if sum equals root.val, not sum equals zero!*/
        if (sum == root.val) {
          allPaths.add(new ArrayList(path));
        }
      }
      path.remove(path.size() - 1);
    }
  }
}
