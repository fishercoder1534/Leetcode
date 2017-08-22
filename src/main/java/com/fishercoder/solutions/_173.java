package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 173. Binary Search Tree Iterator
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 * <p>
 * Calling next() will return the next smallest number in the BST.
 * <p>
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 */
public class _173 {

    public static class Solution1 {

        public static class BSTIterator {

            private Queue<Integer> queue;

            /**
             * My natural idea is to use a queue to hold all elements in the BST, traverse it while constructing the iterator, although
             * this guarantees O(1) hasNext() and next() time, but it uses O(n) memory.
             */
            //Cheers! Made it AC'ed at first shot! Praise the Lord! Practice does make perfect!
            //I created a new class to do it using Stack to meet O(h) memory: {@link fishercoder.algorithms._173_using_stack}
            public BSTIterator(TreeNode root) {
                queue = new LinkedList<Integer>();
                if (root != null) dfs(root, queue);
            }

            private void dfs(TreeNode root, Queue<Integer> q) {
                if (root.left != null) dfs(root.left, q);
                q.offer(root.val);
                if (root.right != null) dfs(root.right, q);
            }

            /**
             * @return whether we have a next smallest number
             */
            public boolean hasNext() {
                return !queue.isEmpty();
            }

            /**
             * @return the next smallest number
             */
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
}
