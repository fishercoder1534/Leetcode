package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _1669 {
    public static class Solution1 {
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
            ListNode pre = new ListNode(-1);
            ListNode list1Temp = list1;
            pre.next = list1Temp;
            b -= a;
            while (a > 1) {
                list1Temp = list1Temp.next;
                a--;
            }
            ListNode tail = list1Temp.next;
            list1Temp.next = list2;
            while (b > 0) {
                tail = tail.next;
                b--;
            }
            int length = 0;
            ListNode temp2 = list2;
            while (temp2 != null) {
                temp2 = temp2.next;
                length++;
            }
            while (length > 0) {
                list1Temp = list1Temp.next;
                length--;
            }
            list1Temp.next = tail.next;
            return pre.next;
        }
    }
}
