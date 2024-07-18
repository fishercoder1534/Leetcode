package com.fishercoder.solutions.secondthousand;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class _1530 {
    public static class Solution1 {
        public int countPairs(TreeNode root, int distance) {
            Map<TreeNode, TreeNode> childToParentMap = new HashMap<>();
            List<TreeNode> leafNodes = new ArrayList();
            postOrderToFindAllLeavesAndBuildChildParentMap(root, childToParentMap, leafNodes);
            int pairs = 0;
            for (TreeNode leaf : leafNodes) {
                pairs += bfsToPossibleLeaves(leaf, distance, childToParentMap);
            }
            return pairs / 2;
        }

        private int bfsToPossibleLeaves(TreeNode leaf, int distance, Map<TreeNode, TreeNode> childToParentMap) {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(leaf);
            Set<TreeNode> visited = new HashSet<>();
            visited.add(leaf);
            int count = 0;
            while (!q.isEmpty() && distance >= 0) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = q.poll();
                    if (leaf != curr && curr.left == null && curr.right == null) {
                        count++;
                    }
                    if (curr.left != null && visited.add(curr.left)) {
                        q.offer(curr.left);
                    }
                    if (curr.right != null && visited.add(curr.right)) {
                        q.offer(curr.right);
                    }
                    if (childToParentMap.containsKey(curr) && visited.add(childToParentMap.get(curr))) {
                        q.offer(childToParentMap.get(curr));
                    }
                }
                distance--;
            }
            return count;
        }

        private void postOrderToFindAllLeavesAndBuildChildParentMap(TreeNode node, Map<TreeNode, TreeNode> childToParentMap, List<TreeNode> leafNodes) {
            if (node == null) {
                return;
            }
            if (node.left != null) {
                childToParentMap.put(node.left, node);
            }
            if (node.right != null) {
                childToParentMap.put(node.right, node);
            }
            postOrderToFindAllLeavesAndBuildChildParentMap(node.left, childToParentMap, leafNodes);
            postOrderToFindAllLeavesAndBuildChildParentMap(node.right, childToParentMap, leafNodes);
            if (node.left == null && node.right == null) {
                leafNodes.add(node);
            }
        }
    }
}
