package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * 445. Add Two Numbers II
 *
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

    public static class Solution1 {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            Deque<Integer> stack1 = popIntoStack(l1);
            Deque<Integer> stack2 = popIntoStack(l2);

            int sum = 0;
            ListNode list = new ListNode(0);
            while (!stack1.isEmpty() || !stack2.isEmpty()) {
                if (!stack1.isEmpty()) {
                    sum += stack1.removeFirst();
                }
                if (!stack2.isEmpty()) {
                    sum += stack2.removeFirst();
                }
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


    public static class Solution2 {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            Stack<Integer> stack1 = popOntoStack(l1);
            Stack<Integer> stack2 = popOntoStack(l2);
            Stack<Integer> resultStack = add(stack1, stack2);
            return buildResult(resultStack);
        }

        private ListNode buildResult(Stack<Integer> stack) {
            ListNode prev = new ListNode(-1);
            ListNode head = new ListNode(stack.pop());
            prev.next = head;
            while (!stack.isEmpty()) {
                head.next = new ListNode(stack.pop());
                head = head.next;
            }
            return prev.next;
        }

        private Stack<Integer> add(Stack<Integer> stack1, Stack<Integer> stack2) {
            Stack<Integer> res = new Stack<>();
            int carry = 0;
            while (!stack1.isEmpty() || !stack2.isEmpty()) {
                if (!stack1.isEmpty()) {
                    carry += stack1.pop();
                }
                if (!stack2.isEmpty()) {
                    carry += stack2.pop();
                }
                int value = carry;
                if (carry > 9) {
                    value = carry % 10;
                    carry = 1;
                } else {
                    carry = 0;
                }
                res.push(value);
            }
            if (carry != 0) {
                res.add(carry);
            }
            return res;
        }

        private Stack<Integer> popOntoStack(ListNode head) {
            ListNode temp = head;
            Stack<Integer> stack = new Stack<>();
            while (temp != null) {
                stack.push(temp.val);
                temp = temp.next;
            }
            return stack;
        }
    }
}
