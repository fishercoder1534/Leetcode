package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

/**
 * 1161. Maximum Level Sum of a Binary Tree
 *
 * Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.
 * Return the smallest level X such that the sum of all the values of nodes at level X is maximal.
 *
 * Example 1:
 *          1
 *         / \
 *        7  0
 *       / \
 *      7  -8
 *
 * Input: [1,7,0,7,-8,null,null]
 * Output: 2
 *
 * Explanation:
 * Level 1 sum = 1.
 * Level 2 sum = 7 + 0 = 7.
 * Level 3 sum = 7 + -8 = -1.
 * So we return the level with the maximum sum which is level 2.
 *
 * Note:
 * The number of nodes in the given tree is between 1 and 10^4.
 * -10^5 <= node.val <= 10^5
 * */
public class _1161 {
    public static class Solution1 {
        public int maxLevelSum(TreeNode root) {
            if (root == null) {
                return 0;
            }
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            TreeMap<Integer, Integer> treeMap = new TreeMap<>((a, b) -> b - a);
            int level = 1;
            while (!q.isEmpty()) {
                int size = q.size();
                int sum = 0;
                for (int i = 0; i < size; i++) {
                    TreeNode curr = q.poll();
                    sum += curr.val;
                    if (curr.left != null) {
                        q.offer(curr.left);
                    }
                    if (curr.right != null) {
                        q.offer(curr.right);
                    }
                }
                treeMap.put(sum, level);
                level++;
            }
            return treeMap.firstEntry().getValue();
        }
    }
}
