package com.fishercoder.solutions.thirdthousand;

import com.fishercoder.common.classes.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _2196 {
    public static class Solution1 {
        /**
         * My completely original solution.
         */
        public TreeNode createBinaryTree(int[][] descriptions) {
            Map<Integer, TreeNode> map = new HashMap<>();
            Set<Integer> notRootVals = new HashSet<>();
            for (int[] des : descriptions) {
                notRootVals.add(des[1]);
                TreeNode node = map.getOrDefault(des[0], new TreeNode(des[0]));
                if (des[2] == 1) {
                    node.left = map.getOrDefault(des[1], new TreeNode(des[1]));
                    map.put(des[1], node.left);
                } else {
                    node.right = map.getOrDefault(des[1], new TreeNode(des[1]));
                    map.put(des[1], node.right);
                }
                map.put(des[0], node);
            }
            int rootVal = -1;
            for (int[] des : descriptions) {
                if (!notRootVals.contains(des[0])) {
                    rootVal = des[0];
                    break;
                }
            }
            return map.get(rootVal);
        }
    }
}
