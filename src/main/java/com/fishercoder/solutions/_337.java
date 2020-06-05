package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.HashMap;
import java.util.Map;

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
