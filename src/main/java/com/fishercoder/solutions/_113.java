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
}
