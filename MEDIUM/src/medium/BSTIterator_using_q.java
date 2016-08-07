package medium;

import java.util.LinkedList;
import java.util.Queue;

import classes.TreeNode;

/**173. Binary Search Tree Iterator  QuestionEditorial Solution  My Submissions
Total Accepted: 56053
Total Submissions: 154876
Difficulty: Medium
Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.*/
public class BSTIterator_using_q {
    
    private Queue<Integer> q;
    
    /**My natural idea is to use a queue to hold all elements in the BST, traverse it while constructing the iterator, although
     * this guarantees O(1) hasNext() and next() time, but it uses O(n) memory.*/
    //Cheers! Made it AC'ed at first shot! Praise the Lord! Practice does make perfect!
    //I created a new class to do it using Stack to meet O(h) memory: {@link medium.BSTIterator_using_stack}
    public BSTIterator_using_q(TreeNode root) {
        q = new LinkedList<Integer>();
        if(root != null) dfs(root, q);
    }

    private void dfs(TreeNode root, Queue<Integer> q) {
        if(root.left != null) dfs(root.left, q);
        q.offer(root.val);
        if(root.right != null) dfs(root.right, q);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !q.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        return q.poll();
    }
}
