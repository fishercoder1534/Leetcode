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
            Collections.sort(list);
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
}
