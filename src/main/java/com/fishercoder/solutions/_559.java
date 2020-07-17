package com.fishercoder.solutions;

import com.fishercoder.common.classes.Node;

import java.util.ArrayList;
import java.util.List;

public class _559 {
    public static class Solution1 {
        public int maxDepth(Node root) {
            int maxDepth = 0;
            if (root == null) {
                return maxDepth;
            }
            List<List<Integer>> allPaths = new ArrayList<>();
            List<Integer> currentPath = new ArrayList<>();
            dfs(root, currentPath, allPaths);
            for (List<Integer> path : allPaths) {
                maxDepth = Math.max(path.size(), maxDepth);
            }
            return maxDepth;
        }

        private void dfs(Node root, List<Integer> currentPath, List<List<Integer>> allPaths) {
            if (root == null) {
                allPaths.add(new ArrayList<>(currentPath));
            }
            if (root.children != null && !root.children.isEmpty()) {
                currentPath.add(root.val);
                for (Node child : root.children) {
                    dfs(child, new ArrayList<>(currentPath), allPaths);
                }
            }
            if (root.children == null || root.children.isEmpty()) {
                currentPath.add(root.val);
                allPaths.add(new ArrayList<>(currentPath));
            }
        }
    }
}
