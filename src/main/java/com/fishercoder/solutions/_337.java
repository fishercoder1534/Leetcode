package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**337. House Robber III

 The thief has found himself a new place for his thievery again.
 There is only one entrance to this area, called the "root."
 Besides the root, each house has one and only one parent house.
 After a tour, the smart thief realized that "all houses in this place forms a binary tree".
 It will automatically contact the police if two directly-linked houses were broken into on the same night.

Determine the maximum amount of money the thief can rob tonight without alerting the police.

Example 1:
     3
    / \
   2   3
    \   \
     3   1
Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.

Example 2:
     3
    / \
   4   5
  / \   \
 1   3   1
Maximum amount of money the thief can rob = 4 + 5 = 9.
*/

public class _337 {

    public static class Solution1 {
        //simple recursion without cacheing: 1189 ms
        public int rob(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int val = 0;
            if (root.left != null) {
                val += rob(root.left.left) + rob(root.left.right);
            }
            if (root.right != null) {
                val += rob(root.right.left) + rob(root.right.right);
            }
            val = Math.max(val + root.val, rob(root.left) + rob(root.right));
            return val;
        }
    }

    public static class Solution2 {
        //same idea, but with cacheing via a hashmap: 8 ms
        public int rob_dp(TreeNode root) {
            Map<TreeNode, Integer> map = new HashMap<>();
            return getMaxValue(root, map);
        }

        private int getMaxValue(TreeNode root, Map<TreeNode, Integer> map) {
            if (root == null) {
                return 0;
            }
            if (map.containsKey(root)) {
                return map.get(root);
            }

            int val = 0;
            if (root.left != null) {
                val += getMaxValue(root.left.left, map) + getMaxValue(root.left.right, map);
            }
            if (root.right != null) {
                val += getMaxValue(root.right.left, map) + getMaxValue(root.right.right, map);
            }
            int max = Math.max(root.val + val,
                getMaxValue(root.left, map) + getMaxValue(root.right, map));
            map.put(root, max);
            return max;
        }
    }

}
