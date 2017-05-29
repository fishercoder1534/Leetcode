package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**173. Binary Search Tree Iterator
Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.*/
public class _173_using_queue {
    
    private Queue<Integer> queue;
    
    /**My natural idea is to use a queue to hold all elements in the BST, traverse it while constructing the iterator, although
     * this guarantees O(1) hasNext() and next() time, but it uses O(n) memory.*/
    //Cheers! Made it AC'ed at first shot! Praise the Lord! Practice does make perfect!
    //I created a new class to do it using Stack to meet O(h) memory: {@link fishercoder.algorithms._173_using_stack}
    public _173_using_queue(TreeNode root) {
        queue = new LinkedList<Integer>();
        if(root != null) dfs(root, queue);
    }

    private void dfs(TreeNode root, Queue<Integer> q) {
        if(root.left != null) dfs(root.left, q);
        q.offer(root.val);
        if(root.right != null) dfs(root.right, q);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        return queue.poll();
    }
}
