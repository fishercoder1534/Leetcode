package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
