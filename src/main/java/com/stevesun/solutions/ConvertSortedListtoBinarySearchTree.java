package com.stevesun.solutions;

import com.stevesun.common.classes.ListNode;
import com.stevesun.common.classes.TreeNode;

/**
 * Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
 */
public class ConvertSortedListtoBinarySearchTree {

    public TreeNode sortedListToBST(ListNode head) {
        TreeNode res = rec(head, null);
        return res;
    }

    public TreeNode rec(ListNode start, ListNode end) {
        if (start == end) {
            return null;
        } else {
            ListNode mid = start;
            ListNode probe = start;
            while (probe != end && probe.next != end) {
                mid = mid.next;
                probe = probe.next.next;
            }

            TreeNode root = new TreeNode(mid.val);
            root.left = rec(start, mid);
            root.right = rec(mid.next, end);
            return root;
        }
    }

}
