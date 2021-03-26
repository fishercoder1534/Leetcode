package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _369 {

    public static class Solution1 {
        public ListNode plusOne(ListNode head) {
            //get the length of the list and take out the value of each node and store them into an array
            ListNode temp = head;
            int len = 0;
            while (temp != null) {
                len++;
                temp = temp.next;
            }

            int[] nums = new int[len];
            temp = head;
            int j = 0;
            while (temp != null) {
                nums[j++] = temp.val;
                temp = temp.next;
            }

            //plus one into this array: nums
            for (int i = len - 1; i >= 0; i--) {
                if (nums[i] != 9) {
                    nums[i]++;
                    break;
                } else {
                    nums[i] = 0;
                }
            }

            //still assuming the first value in the list should not be zero as it's representing a valid number, although it's in a list
            ListNode pre = new ListNode(-1);
            if (nums[0] == 0) {
                //in this case, let's just construct a new linked list and return: only first node value is 1, all the rest is 0
                ListNode newHead = new ListNode(1);
                ListNode result = newHead;
                int count = 0;
                while (count++ < len) {
                    newHead.next = new ListNode(0);
                    newHead = newHead.next;
                }
                return result;
            } else {
                pre.next = head;
                for (int i = 0; i < len; i++) {
                    head.val = nums[i];
                    head = head.next;
                }
                return pre.next;
            }
        }
    }

    public static class Solution2 {

        public ListNode plusOne(ListNode head) {
            ListNode dummyNode = new ListNode(0);
            dummyNode.next = head;

            ListNode notNineNode = dummyNode;

            // find the right most node value != 9
            while (head != null) {
                if (head.val != 9) {
                    notNineNode = head;
                }
                head = head.next;
            }

            // increase the rightmost node value to 1
            notNineNode.val++;
            notNineNode = notNineNode.next;

            // set all the following node values with 9 to 0
            while (notNineNode != null) {
                notNineNode.val = 0;
                notNineNode = notNineNode.next;
            }
            return dummyNode.val != 0 ? dummyNode : dummyNode.next;
        }
    }

}
