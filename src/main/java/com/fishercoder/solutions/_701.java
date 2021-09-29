package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _701 {
    public static class Solution1 {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null) {
                return new TreeNode(val);
            }
            if (root.val < val) {
                root.right = insertIntoBST(root.right, val);
            } else {
                root.left = insertIntoBST(root.left, val);
            }
            return root;
        }
    }

    public static class Solution2 {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            List<Integer> list = new ArrayList<>();
            inorder(root, list);
            int insertionPoint = binarySearch(list, val);
            list.add(insertionPoint, val);
            return formBST(list);
        }

        private TreeNode formBST(List<Integer> list) {
            if (list.isEmpty()) {
                return null;
            }
            TreeNode newRoot = new TreeNode(list.get(list.size() / 2));
            newRoot.left = formBST(list.subList(0, list.size() / 2));
            newRoot.right = formBST(list.subList(list.size() / 2 + 1, list.size()));
            return newRoot;
        }

        private int binarySearch(List<Integer> list, int target) {
            int left = 0;
            int right = list.size() - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (list.get(mid) < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return left == right ? list.get(left) >= target ? left : left + 1 : left;//here's the most tricky/easy to get buggy part!
        }

        private void inorder(TreeNode root, List<Integer> list) {
            if (root == null) {
                return;
            }
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }
    }
}
