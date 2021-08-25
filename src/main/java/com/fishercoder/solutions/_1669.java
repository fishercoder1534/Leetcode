package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _1669 {
    public static class Solution1 {
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
            ListNode endList = list1;
            ListNode startList = null;

            for (int i = 0; i < b; i++, endList = endList.next) {
                if (i == a - 1) {
                    startList = endList;
                }
            }
            // Connect the startList.next to list2
            startList.next = list2;
            while (list2.next != null) {
                list2 = list2.next;
            }
            list2.next = endList.next;
            endList.next = null;
            return list1;
        }
    }
}
