package com.fishercoder.solutions.thirdthousand;

import com.fishercoder.common.classes.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2049 {
    public static class Solution1 {
        /*
         * My completely original solution.
         * Practice makes perfect!
         */
        public int countHighestScoreNodes(int[] parents) {
            Map<Integer, TreeNode> valToNodeMap = new HashMap<>();
            TreeNode root = buildBinaryTree(parents, valToNodeMap);

            // it'll be handy if we can cache the number of children each node has as we'll do this
            // many times, so we can quickly calculate the score for each node
            // key is the node since each node's value is unique, value if the number of children
            // this node has
            Map<Integer, Long> nodeCountMap = new HashMap<>();
            // naturally we should use post-order traversal since we need to count the children for
            // each child first, then we can roll up to add one to get the number of children for
            // the root node
            long allNodeCount = postOrder(root, nodeCountMap);
            nodeCountMap.put(root.val, allNodeCount);

            // now calculate the score of each node
            List<Long> scoreList = new ArrayList<>();
            long highestScore = 0;
            for (int i = 0; i < parents.length; i++) {
                long score = computeScore(i, nodeCountMap, valToNodeMap);
                highestScore = Math.max(score, highestScore);
                scoreList.add(score);
            }
            int count = 0;
            for (long score : scoreList) {
                if (score == highestScore) {
                    count++;
                }
            }
            return count;
        }

        private Long computeScore(
                int nodeVal, Map<Integer, Long> nodeCountMap, Map<Integer, TreeNode> nodeValueMap) {
            // since this is a binary tree, so, at most, removing a node, it'll split the original
            // tree into three disjoint trees
            TreeNode node = nodeValueMap.get(nodeVal);
            Long leftSubtree = 1L;
            Long rightSubtree = 1L;
            Long parentSubtree = 1L;
            if (node.left != null) {
                if (nodeCountMap.get(node.left.val) > 0) {
                    leftSubtree = nodeCountMap.get(node.left.val);
                }
            }
            if (node.right != null) {
                if (nodeCountMap.get(node.right.val) > 0) {
                    rightSubtree = nodeCountMap.get(node.right.val);
                }
            }
            if (nodeVal != 0) {
                long diff = nodeCountMap.get(0) - nodeCountMap.get(nodeVal);
                if (diff > 0) {
                    parentSubtree = diff;
                }
            }
            return leftSubtree * rightSubtree * parentSubtree;
        }

        private long postOrder(TreeNode root, Map<Integer, Long> map) {
            if (root == null) {
                return 0;
            }
            long leftCount = postOrder(root.left, map);
            long rightCount = postOrder(root.right, map);
            long sum = leftCount + rightCount + 1;
            map.put(root.val, sum);
            return sum;
        }

        private TreeNode buildBinaryTree(int[] parents, Map<Integer, TreeNode> map) {
            map.put(0, new TreeNode(0));
            for (int i = 1; i < parents.length; i++) {
                TreeNode childNode = map.getOrDefault(i, new TreeNode(i));
                TreeNode parentNode = map.getOrDefault(parents[i], new TreeNode(parents[i]));
                if (parentNode.left == null) {
                    parentNode.left = childNode;
                } else {
                    parentNode.right = childNode;
                }
                map.put(parents[i], parentNode);
                map.put(i, childNode);
            }
            return map.get(0);
        }
    }
}
