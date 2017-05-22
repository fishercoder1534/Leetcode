package com.stevesun.solutions;

import com.stevesun.common.classes.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Follow up:
 What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

 Example:

 Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 8 -> 0 -> 7
 */
public class _445 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> stack1 = popIntoStack(l1);
        Deque<Integer> stack2 = popIntoStack(l2);

        int sum = 0;
        ListNode list = new ListNode(0);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (!stack1.isEmpty()) sum += stack1.removeFirst();
            if (!stack2.isEmpty()) sum += stack2.removeFirst();
            list.val = sum % 10;
            ListNode head = new ListNode(sum / 10);
            head.next = list;
            list = head;
            sum /= 10;
        }
        return list.val == 0 ? list.next : list;
    }

    private Deque<Integer> popIntoStack(ListNode head) {
        ListNode tmp = head;
        Deque<Integer> stack = new ArrayDeque<>();
        while (tmp != null) {
            stack.push(tmp.val);
            tmp = tmp.next;
        }
        return stack;
    }

}
