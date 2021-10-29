package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _173 {

    public static class Solution1 {

        public static class BSTIterator {
            private Queue<Integer> queue;

            public BSTIterator(TreeNode root) {
                queue = new LinkedList<>();
                if (root != null) {
                    dfs(root, queue);
                }
            }

            private void dfs(TreeNode root, Queue<Integer> q) {
                if (root.left != null) {
                    dfs(root.left, q);
                }
                q.offer(root.val);
                if (root.right != null) {
                    dfs(root.right, q);
                }
            }

            public boolean hasNext() {
                return !queue.isEmpty();
            }

            public int next() {
                return queue.poll();
            }
        }
    }

    public static class Solution2 {
        public static class BSTIterator {
            /**
             * This is a super cool/clever idea: use a stack to store all the current left nodes of the BST, when pop(), we
             * push all its right nodes into the stack if there are any.
             * This way, we use only O(h) memory for this iterator, this is a huge saving when the tree is huge
             * since h could be much smaller than n. Cheers!
             */

            private Stack<TreeNode> stack;

            public BSTIterator(TreeNode root) {
                stack = new Stack();
                pushToStack(root, stack);
            }

            private void pushToStack(TreeNode root, Stack<TreeNode> stack) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
            }

            public boolean hasNext() {
                return !stack.isEmpty();
            }

            public int next() {
                TreeNode curr = stack.pop();
                pushToStack(curr.right, stack);
                return curr.val;
            }
        }
    }

    public static class Solution3 {
        /**
         * credit: https://leetcode.com/problems/binary-search-tree-iterator/discuss/52647/Nice-Comparison-(and-short-Solution
         */
        public static class BSTIterator {
            Deque<TreeNode> stack;
            TreeNode visit;

            public BSTIterator(TreeNode root) {
                stack = new LinkedList<>();
                visit = root;
            }

            public int next() {
                while (visit != null) {
                    stack.addLast(visit);
                    visit = visit.left;
                }
                TreeNode next = stack.pollLast();
                visit = next.right;
                return next.val;
            }

            public boolean hasNext() {
                return visit != null && !stack.isEmpty();
            }
        }
    }
}
