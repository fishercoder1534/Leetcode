package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

public class _144 {
    public static class Solution1 {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode curr = stack.pop();
                if (curr != null) {
                    list.add(curr.val);
                    stack.push(curr.right);
                    stack.push(curr.left);
                }
            }
            return list;
        }
    }

    public static class Solution2 {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList();
            return pre(root, list);
        }

        List<Integer> pre(TreeNode root, List<Integer> list) {
            if (root == null) {
                return list;
            }
            list.add(root.val);
            pre(root.left, list);
            pre(root.right, list);
            return list;
        }
    }

    public static class Solution3 {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.isEmpty() || root != null) {
                while (root != null) {
                    list.add(root.val);
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();
                root = root.right;
            }
            return list;
        }
    }
}
