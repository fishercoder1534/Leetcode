package com.fishercoder.solutions.firstthousand;

import com.fishercoder.common.classes.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class _437 {

    public static class Solution1 {
        /**
         * Time: O(n^2)
         * Space: O(n)
         */
        public int pathSum(TreeNode root, int sum) {
            if (root == null) {
                return 0;
            }
            return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
        }

        private int pathSumFrom(TreeNode root, long sum) {
            if (root == null) {
                return 0;
            }
            return (root.val == sum ? 1 : 0) + pathSumFrom(root.left, sum - root.val) + pathSumFrom(root.right, sum - root.val);
        }
    }

    public static class Solution2 {
        /**
         * Time: O(n)
         * Space: O(n)
         * Credit: Gemini
         * Step through test2 will help visualize this DFS by a lot!
         */
        public int pathSum(TreeNode root, int targetSum) {
            Map<Long, Integer> prefixSumMap = new HashMap<>();
            //base case: a prefix sum of 0 is always seen once: for paths starting at the root
            prefixSumMap.put(0L, 1);
            return dfs(root, 0L, targetSum, prefixSumMap);
        }

        private int dfs(TreeNode root, long currentSum, int targetSum, Map<Long, Integer> prefixSumMap) {
            if (root == null) {
                return 0;
            }
            currentSum += root.val;

            //check if there's a prefix path that we can subtract to reach targetSum
            int validPaths = prefixSumMap.getOrDefault(currentSum - targetSum, 0);

            //add the current prefix sum to the map to make it available for child nodes
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);

            //recurse into left and right subtrees and accumulate total valid paths
            validPaths += dfs(root.left, currentSum, targetSum, prefixSumMap);
            validPaths += dfs(root.right, currentSum, targetSum, prefixSumMap);

            //backtrack
            prefixSumMap.put(currentSum, prefixSumMap.get(currentSum) - 1);
            return validPaths;
        }
    }
}
