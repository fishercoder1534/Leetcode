package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.classes.TreeNode;

public class _109 {

    public static class Solution1 {

        public TreeNode sortedListToBST(ListNode head) {
            return toBstRecursively(head, null);
        }

        public TreeNode toBstRecursively(ListNode start, ListNode end) {
            if (start == end) {
                return null;
            } else {
                ListNode mid = start;
                ListNode fast = start;
                while (fast != end && fast.next != end) {
                    mid = mid.next;
                    fast = fast.next.next;
                }

                TreeNode root = new TreeNode(mid.val);
                root.left = toBstRecursively(start, mid);
                root.right = toBstRecursively(mid.next, end);
                return root;
            }
        }
    }

}
