package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

/**
 * 369. Plus One Linked List
 *
 * Given a non-negative integer represented as non-empty a singly linked list of digits, plus one to the integer.

 You may assume the integer do not contain any leading zero, except the number 0 itself.

 The digits are stored such that the most significant digit is at the head of the list.

 Example:
 Input:
 1->2->3

 Output:
 1->2->4
 */
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

}
