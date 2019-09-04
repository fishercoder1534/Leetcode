package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 663. Equal Tree Partition
 *
 * Given a binary tree with n nodes,
 * your task is to check if it's possible to partition the tree to two trees which have the equal sum of values
 * after removing exactly one edge on the original tree.

 Example 1:
 Input:
    5
   / \
  10 10
    /  \
   2   3

 Output: True
 Explanation:
  5
 /
10

 Sum: 15

  10
 /  \
2   3

 Sum: 15


 Example 2:
 Input:
   1
  / \
 2  10
   /  \
  2   20

 Output: False
 Explanation: You can't split the tree into two trees with equal sum after removing exactly one edge on the tree.

 Note:
 The range of tree node value is in the range of [-100000, 100000].
 1 <= n <= 10000

 */
public class _663 {
    public static class Solution1 {
        /**
         * The idea is that we use a map to store the sum of each node, then in the end,
         * we check if any node has a sum that is exactly half of total sum.
         */
        public boolean checkEqualTree(TreeNode root) {
            Map<TreeNode, Integer> map = new HashMap<>();
            int totalSum = sumForEachNode(root, map);
            if (totalSum % 2 != 0 || map.size() < 2) {
                return false;
            }
            for (TreeNode key : map.keySet()) {
                if (map.get(key) == totalSum / 2) {
                    return true;
                }
            }
            return false;
        }

        private int sumForEachNode(TreeNode root, Map<TreeNode, Integer> map) {
            if (root == null) {
                return 0;
            }
            if (root.left == null && root.right == null) {
                map.put(root, root.val);
                return root.val;
            }
            int leftVal = 0;
            if (root.left != null) {
                leftVal = sumForEachNode(root.left, map);
            }
            int rightVal = 0;
            if (root.right != null) {
                rightVal = sumForEachNode(root.right, map);
            }
            int val = root.val + leftVal + rightVal;
            map.put(root, val);
            return val;
        }
    }
}
