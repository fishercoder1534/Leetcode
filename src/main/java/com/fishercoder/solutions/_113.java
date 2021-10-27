package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

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

    public static class Solution2 {
        /**
         * My completely original solution on 10/27/2021.
         * A classic backtracking problem/solution.
         */
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> ans = new ArrayList<>();
            backtracking(root, new ArrayList<>(), targetSum, 0, ans);
            return ans;
        }

        private void backtracking(TreeNode root, List<Integer> path, int targetSum, int currentSum, List<List<Integer>> ans) {
            if (root == null) {
                return;
            }
            path.add(root.val);
            currentSum += root.val;
            if (currentSum == targetSum && root.left == null && root.right == null) {
                ans.add(new ArrayList<>(path));
                path.remove(path.size() - 1);//backtracking
                return;
            }
            backtracking(root.left, path, targetSum, currentSum, ans);
            backtracking(root.right, path, targetSum, currentSum, ans);
            path.remove(path.size() - 1);//backtracking
        }
    }
}
