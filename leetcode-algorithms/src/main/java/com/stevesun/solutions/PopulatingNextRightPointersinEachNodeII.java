package com.stevesun.solutions;

import com.stevesun.common.classes.TreeLinkNode;

/**
 * Created by fishercoder1534 on 10/5/16.
 */
public class PopulatingNextRightPointersinEachNodeII {
    //copied this post: https://discuss.leetcode.com/topic/1106/o-1-space-o-n-complexity-iterative-solution
    //very clever and concise to make it in O(1) space

    //based on level order traversal
    public static void connect(TreeLinkNode root) {

        TreeLinkNode head = null; //head of the next level
        TreeLinkNode prev = null; //the leading node on the next level
        TreeLinkNode cur = root;  //current node of current level

        while (cur != null) {

            while (cur != null) { //iterate on the current level
                //left child
                if (cur.left != null) {
                    if (prev != null) {
                        prev.next = cur.left;
                    } else {
                        head = cur.left;
                    }
                    prev = cur.left;
                }
                //right child
                if (cur.right != null) {
                    if (prev != null) {
                        prev.next = cur.right;
                    } else {
                        head = cur.right;
                    }
                    prev = cur.right;
                }
                //move to next node
                cur = cur.next;
            }

            //move to next level
            cur = head;
            head = null;
            prev = null;
        }

    }

    public static void main(String...args){
        TreeLinkNode root = new TreeLinkNode(1);
        root.left = new TreeLinkNode(2);
        root.right = new TreeLinkNode(3);
        root.left.left = new TreeLinkNode(4);
        root.left.right = new TreeLinkNode(5);
        root.right.right = new TreeLinkNode(7);
        connect(root);
    }
}
