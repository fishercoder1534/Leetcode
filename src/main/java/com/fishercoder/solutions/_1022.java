package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _1022 {
    public static class Solution1 {
        public int sumRootToLeaf(TreeNode root) {
            List<List<Integer>> paths = new ArrayList<>();
            dfs(root, paths, new ArrayList<>());
            int sum = 0;
            for (List<Integer> list : paths) {
                int num = 0;
                for (int i : list) {
                    num = (num << 1) + i;
                }
                sum += num;
            }
            return sum;
        }

        private void dfs(TreeNode root, List<List<Integer>> paths, List<Integer> path) {
            path.add(root.val);
            if (root.left != null) {
                dfs(root.left, paths, path);
                path.remove(path.size() - 1);
            }
            if (root.right != null) {
                dfs(root.right, paths, path);
                path.remove(path.size() - 1);
            }
            if (root.left == null && root.right == null) {
                paths.add(new ArrayList<>(path));
            }
        }
    }
}
