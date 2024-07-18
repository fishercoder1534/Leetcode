package com.fishercoder.solutions.thirdthousand;

import com.fishercoder.common.classes.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class _2641 {
    public static class Solution1 {
        /**
         * My completely original solution.
         * Note: It's not really replacing the values in the original tree nodes, instead, I'm building a new tree with updated values.
         */
        public TreeNode replaceValueInTree(TreeNode root) {
            Map<Integer, Integer> depthToLevelSumMap = new HashMap<>();
            Queue<TreeNode> originalQ = new LinkedList<>();
            originalQ.offer(root);
            int depth = 0;
            while (!originalQ.isEmpty()) {
                int size = originalQ.size();
                int levelSum = 0;
                for (int i = 0; i < size; i++) {
                    TreeNode curr = originalQ.poll();
                    levelSum += curr.val;
                    if (curr.left != null) {
                        originalQ.offer(curr.left);
                    }
                    if (curr.right != null) {
                        originalQ.offer(curr.right);
                    }
                }
                depthToLevelSumMap.put(depth++, levelSum);
            }
            depth = 0;
            TreeNode newRoot = new TreeNode(0);
            originalQ.offer(root);
            Queue<TreeNode> newQ = new LinkedList<>();
            newQ.add(newRoot);
            while (!originalQ.isEmpty()) {
                int size = originalQ.size();
                for (int i = 0; i < size; i++) {
                    TreeNode currOriginal = originalQ.poll();
                    int childrenSum = currOriginal.left != null ? currOriginal.left.val : 0;
                    childrenSum += currOriginal.right != null ? currOriginal.right.val : 0;
                    int remainder = depthToLevelSumMap.getOrDefault(depth + 1, 0) - childrenSum;
                    TreeNode currNew = newQ.poll();
                    if (currOriginal.left != null) {
                        TreeNode currNewLeftChild = new TreeNode(remainder);
                        currNew.left = currNewLeftChild;
                        newQ.offer(currNewLeftChild);
                        originalQ.offer(currOriginal.left);
                    }
                    if (currOriginal.right != null) {
                        TreeNode currNewRightChild = new TreeNode(remainder);
                        currNew.right = currNewRightChild;
                        newQ.offer(currNewRightChild);
                        originalQ.offer(currOriginal.right);
                    }
                }
                depth++;
            }
            return newRoot;
        }
    }
}
