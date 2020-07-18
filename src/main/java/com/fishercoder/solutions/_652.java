package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class _652 {
    public static class Solution1 {

        /**credit: https://discuss.leetcode.com/topic/97584/java-concise-postorder-traversal-solution*/

        /**
         * You don't actually need to check if every other tree is a duplicate of current node,
         * just when you go through each node, you'll see whether there's already one in the map,
         * since map.containsKey() checks this TreeNode.
         */
        public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
            List<TreeNode> res = new LinkedList<>();
            postorder(root, new HashMap<>(), res);
            return res;
        }

        private String postorder(TreeNode curr, HashMap<String, Integer> map, List<TreeNode> res) {
            if (curr == null) {
                return "#";
            }
            String serial = curr.val + "," + postorder(curr.left, map, res) + "," + postorder(curr.right, map, res);
            if (map.getOrDefault(serial, 0) == 1) {
                res.add(curr);
            }
            map.put(serial, map.getOrDefault(serial, 0) + 1);
            return serial;
        }
    }
}
