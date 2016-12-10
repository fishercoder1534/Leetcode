package stevesun.algorithms;

import stevesun.common.classes.TreeNode;

import java.util.Stack;

/**173. Binary Search Tree Iterator
Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.*/
public class BSTIterator_using_stack {
    /**This is a super cool/clever idea: use a stack to store all the current left nodes of the BST, when pop(), we
     * push all its right nodes into the stack if there are any.
     * This way, we use only O(h) memory for this iterator, this is a huge saving when the tree is huge
     * since h could be much smaller than n. Cheers!*/
    
    private Stack<TreeNode> stack;
    
    public BSTIterator_using_stack(TreeNode root) {
        stack = new Stack();
        pushToStack(root, stack);
    }
    
    private void pushToStack(TreeNode root, Stack<TreeNode> stack) {
        while(root != null){
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
