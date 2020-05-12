package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeLinkNode;

public class _116 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/1106/o-1-space-o-n-complexity-iterative-solution
         * based on level order traversal
         */
        public void connect(TreeLinkNode root) {

            TreeLinkNode head = null; //head of the next level
            TreeLinkNode prev = null; //the leading node on the next level
            TreeLinkNode curr = root;  //current node of current level

            while (curr != null) {
                while (curr != null) { //iterate on the current level
                    //left child
                    if (curr.left != null) {
                        if (prev != null) {
                            prev.next = curr.left;
                        } else {
                            head = curr.left;
                        }
                        prev = curr.left;
                    }
                    //right child
                    if (curr.right != null) {
                        if (prev != null) {
                            prev.next = curr.right;
                        } else {
                            head = curr.right;
                        }
                        prev = curr.right;
                    }
                    //move to next node
                    curr = curr.next;
                }
                //move to next level
                curr = head;
                head = null;
                prev = null;
            }
        }
    }
}
