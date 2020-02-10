package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 1214. Two Sum BSTs
 *
 * Given two binary search trees,
 * return True if and only if there is a node in the first tree and a node in the second tree whose values sum up to a given integer target.
 *
 * Example 1:
 *        2             1
 *       / \           / \
 *      1  4          0  3
 *
 * Input: root1 = [2,1,4], root2 = [1,0,3], target = 5
 * Output: true
 * Explanation: 2 and 3 sum up to 5.
 *
 * Example 2:
 *         0                   5
 *        / \                 / \
 *      -10  10              1   7
 *                          / \
 *                         0  2
 *
 * Input: root1 = [0,-10,10], root2 = [5,1,7,0,2], target = 18
 * Output: false
 *
 * Constraints:
 * Each tree has at most 5000 nodes.
 * -10^9 <= target, node.val <= 10^9
 * */
public class _1214 {
    public static class Solution1 {
        public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
            if (root1 == null || root2 == null) {
                return false;
            }
            List<Integer> inorder1 = inorderDfs(root1, new ArrayList<>());
            List<Integer> inorder2 = inorderDfs(root2, new ArrayList<>());
            return findTwoSum(inorder1, inorder2, target);
        }

        private boolean findTwoSum(List<Integer> sorted1, List<Integer> sorted2, int target) {
            for (int i = 0; i < sorted1.size(); i++) {
                if (exists(sorted2, target - sorted1.get(i))) {
                    return true;
                }
            }
            return false;
        }

        private boolean exists(List<Integer> sorted, int target) {
            int left = 0;
            int right = sorted.size() - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (sorted.get(mid) == target) {
                    return true;
                } else if (sorted.get(mid) < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return false;
        }

        private List<Integer> inorderDfs(TreeNode root, List<Integer> list) {
            if (root == null) {
                return list;
            }
            if (root.left != null) {
                list = inorderDfs(root.left, list);
            }
            list.add(root.val);
            if (root.right != null) {
                list = inorderDfs(root.right, list);
            }
            return list;
        }

    }
}
