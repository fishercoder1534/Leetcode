package com.fishercoder.solutions.fourththousand;

import com.fishercoder.common.classes.TreeNode;

import java.util.*;

public class _3902 {
    public static class Solution1 {
        public List<Long> zigzagLevelSum(TreeNode root) {
            List<Long> ans = new ArrayList<>();
            if (root == null) {
                return ans;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            List<List<TreeNode>> oddLevels = new ArrayList<>();
            List<List<TreeNode>> evenLevels = new ArrayList<>();
            int level = 1;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                    if (level % 2 == 0) {
                        if (i == 0) {
                            evenLevels.add(new ArrayList<>());
                        }
                        evenLevels.get(evenLevels.size() - 1).add(node);
                    } else {
                        if (i == 0) {
                            oddLevels.add(new ArrayList<>());
                        }
                        oddLevels.get(oddLevels.size() - 1).add(node);
                    }
                }
                level++;
            }
            List<Long> oddSums = new ArrayList<>();
            for (int i = 0; i < oddLevels.size(); i++) {
                long sum = 0L;
                for (int j = 0; j < oddLevels.get(i).size(); j++) {
                    if (oddLevels.get(i).get(j).left == null) {
                        break;
                    } else {
                        sum += oddLevels.get(i).get(j).val;
                    }
                }
                oddSums.add(sum);
            }
            List<Long> evenSums = new ArrayList<>();
            for (int i = 0; i < evenLevels.size(); i++) {
                long sum = 0L;
                for (int j = evenLevels.get(i).size() - 1; j >= 0; j--) {
                    if (evenLevels.get(i).get(j).right == null) {
                        break;
                    } else {
                        sum += evenLevels.get(i).get(j).val;
                    }
                }
                evenSums.add(sum);
            }
            for (int i = 0; i < oddSums.size(); i++) {
                ans.add(oddSums.get(i));
                if (i < evenSums.size()) {
                    ans.add(evenSums.get(i));
                }
            }
            return ans;
        }
    }
}
