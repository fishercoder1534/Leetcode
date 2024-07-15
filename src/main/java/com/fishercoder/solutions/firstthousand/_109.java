package com.fishercoder.solutions.firstthousand;

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
                ListNode slow = start;
                ListNode fast = start;
                while (fast != end && fast.next != end) {//here is the key: we check if fast != end, not fast != null
                    slow = slow.next;
                    fast = fast.next.next;
                }

                TreeNode root = new TreeNode(slow.val);
                root.left = toBstRecursively(start, slow);
                root.right = toBstRecursively(slow.next, end);
                return root;
            }
        }
    }

}
