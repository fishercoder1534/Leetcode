package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1457 {
    public static class Solution1 {
        public int pseudoPalindromicPaths(TreeNode root) {
            List<List<Integer>> allPaths = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            dfs(root, path, allPaths);
            int result = 0;
            for (List<Integer> thisPath : allPaths) {
                Map<Integer, Integer> count = findCount(thisPath);
                int oddCount = 0;
                for (int num : count.keySet()) {
                    if (count.get(num) % 2 != 0) {
                        oddCount++;
                    }
                    if (oddCount > 1) {
                        break;
                    }
                }
                if (oddCount <= 1) {
                    result++;
                }
            }
            return result;
        }

        private void dfs(TreeNode root, List<Integer> path, List<List<Integer>> allPaths) {
            if (root.left == null && root.right == null) {
                path.add(root.val);
                allPaths.add(new ArrayList<>(path));
                return;
            }
            path.add(root.val);
            if (root.left != null) {
                dfs(root.left, path, allPaths);
                path.remove(path.size() - 1);
            }
            if (root.right != null) {
                dfs(root.right, path, allPaths);
                path.remove(path.size() - 1);
            }
        }

        private Map<Integer, Integer> findCount(List<Integer> path) {
            Map<Integer, Integer> map = new HashMap<>();
            path.forEach(i -> map.put(i, map.getOrDefault(i, 0) + 1));
            return map;
        }
    }
}
