package com.fishercoder.solutions.fourththousand;

import com.fishercoder.common.classes.TreeNode;

import java.util.*;

public class _3831 {
    public static class Solution1 {
        /**
         * My completely original solution.
         */
        public int levelMedian(TreeNode root, int level) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            dfs(root, map, 0, level);
            List<Integer> list = map.getOrDefault(level, new ArrayList<>());
            if (list.isEmpty()) {
                return -1;
            }
            return list.get(list.size() / 2);
        }

        private void dfs(TreeNode root, Map<Integer, List<Integer>> map, int currentLevel, int targetLevel) {
            if (currentLevel > targetLevel || root == null) {
                return;
            }
            List<Integer> levelList = map.getOrDefault(currentLevel, new ArrayList<>());
            levelList.add(root.val);
            map.put(currentLevel, levelList);
            dfs(root.left, map, currentLevel + 1, targetLevel);
            dfs(root.right, map, currentLevel + 1, targetLevel);
        }
    }

    public static class Solution2 {
        /**
         * Slight optimization: we only need to store the target level.
         */
        public int levelMedian(TreeNode root, int level) {
            List<Integer> list = new ArrayList<>();
            inorderDfs(root, 0, level, list);
            if (list.isEmpty()) {
                return -1;
            }
            return list.get(list.size() / 2);
        }

        private void inorderDfs(TreeNode root, int currentLevel, int targetLevel, List<Integer> list) {
            if (root == null || currentLevel > targetLevel) {
                return;
            }
            inorderDfs(root.left, currentLevel + 1, targetLevel, list);
            if (currentLevel == targetLevel) {
                list.add(root.val);
            }
            inorderDfs(root.right, currentLevel + 1, targetLevel, list);
        }
    }
}
