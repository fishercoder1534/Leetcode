package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1305 {
    public static class Solution1 {
        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            List<Integer> list1 = getAllNodes(root1);
            List<Integer> list2 = getAllNodes(root2);
            List<Integer> merged = new ArrayList<>();
            merged.addAll(list1);
            merged.addAll(list2);
            Collections.sort(merged);
            return merged;
        }

        private List<Integer> getAllNodes(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            return inorder(root, list);
        }

        List<Integer> inorder(TreeNode root, List<Integer> result) {
            if (root == null) {
                return result;
            }
            inorder(root.left, result);
            result.add(root.val);
            return inorder(root.right, result);
        }
    }
}
