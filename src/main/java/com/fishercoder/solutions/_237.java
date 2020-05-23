package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _237 {

    public static class Solution1 {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
