package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.HashMap;
import java.util.Map;

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
