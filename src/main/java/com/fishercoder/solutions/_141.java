package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.HashSet;
import java.util.Set;

public class _141 {

    public static class Solution1 {
        public boolean hasCycle(ListNode head) {
            Set<ListNode> set = new HashSet();
            while (head != null) {
                if (!set.add(head)) {
                    return true;
                }
                head = head.next;
            }
            return false;
        }
    }

    public static class Solution2 {
        public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    return true;
                }
            }
            return false;
        }
    }
}
