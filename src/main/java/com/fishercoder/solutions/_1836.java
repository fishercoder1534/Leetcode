package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.HashSet;
import java.util.Set;

public class _1836 {
    public static class Solution1 {
        public ListNode removeDuplicates(ListNode head) {
            // write your code here
            // Maintain a hashtable to checkup for duplicate element in constant time
            Set<Integer> uniqueNums = new HashSet<>();

            ListNode current = head;
            ListNode prev = null;
            while (current != null) {
                int val = current.val;
                if (uniqueNums.contains(val)) {
                    prev.next = current.next;
                }
                else {
                    uniqueNums.add(val);
                    prev = current;
                }
                current = current.next;
            }
            return head;
        }
    }
}
